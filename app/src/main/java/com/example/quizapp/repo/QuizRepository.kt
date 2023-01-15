package com.example.quizapp.repo

import com.example.quizapp.data.Quiz

interface QuizRepository {
    suspend fun insertQuizQuestions(quizList : MutableList<Quiz>)
    suspend fun insertQuiz(quiz: Quiz)
    suspend fun getQuizList(): MutableList<Quiz>
    suspend fun resetQuestionSet()
}