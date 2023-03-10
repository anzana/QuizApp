package com.example.quizapp.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.quizapp.R
import com.example.quizapp.data.QuizFakeData
import com.example.quizapp.databinding.FragmentHomeBinding
import com.example.quizapp.ui.SplashActivity
import com.example.quizapp.viewmodel.QuizViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home), View.OnClickListener {

    private lateinit var _context: Context

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: QuizViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this._context = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        viewModel = ViewModelProvider(requireActivity())[QuizViewModel::class.java]

        initialSetup()

    }

    private fun initialSetup() {
        binding.nextButton.setOnClickListener(this)
        binding.homeButton.setOnClickListener(this)

        viewModel.data.observe(viewLifecycleOwner) {quizList ->
            quizList?.let {
                val viewPagerAdapter = ViewPagerAdapter(this, it)
                binding.viewPager.adapter = viewPagerAdapter
            }
        }
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.next_button -> {

                binding.viewPager.setCurrentItem(binding.viewPager.currentItem + 1, true)

                //Result Fragment
                if (binding.viewPager.currentItem == 15) {
                    binding.buttonsLL.visibility = View.GONE
                    binding.viewPager.isUserInputEnabled = false
                }
            }

            R.id.home_button -> {
                resetDB()
                val intent = Intent(activity, SplashActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }
        }
    }

    private fun resetDB() {
        viewModel.resetDatabase(QuizFakeData.getQuizQuestions())
    }

}