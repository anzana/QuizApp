package com.example.quizapp.util

import com.example.quizapp.data.AnswerModel

interface CheckClickInterface {
    fun onCheckBoxUnChecked(answerModel: AnswerModel)
}