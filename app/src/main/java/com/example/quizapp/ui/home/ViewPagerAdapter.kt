package com.example.quizapp.ui.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.quizapp.data.Quiz
import com.example.quizapp.ui.radioButtonQuestions.RadioButtonQuestionFragment
import com.example.quizapp.ui.result.ResultFragment
import com.google.gson.Gson

class ViewPagerAdapter(
    fragment: Fragment,
    private val questionList: List<Quiz>
) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = questionList.size + 1

    override fun createFragment(position: Int): Fragment {
        val fragment: Fragment = if (position == 15) {
            ResultFragment.newInstance()
        }else {
            val quiz = questionList[position]
            RadioButtonQuestionFragment.newInstance(Gson().toJson(quiz))
        }

        return fragment
    }

}