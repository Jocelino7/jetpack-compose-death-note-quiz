package com.jocelinoFernandes.deathNoteQuiz.ui.viewModels

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.jocelinoFernandes.deathNoteQuiz.model.QuizService
import com.jocelinoFernandes.deathNoteQuiz.model.Question
import com.jocelinoFernandes.deathNoteQuiz.ui.routes.Route
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class QuizViewModel : ViewModel() {
    private val quizzService: QuizService = QuizService()
    val questions = quizzService.getAllQuestion()
    private val _quizzCount = MutableStateFlow(1)
    private val _currentQuestionIndex = MutableStateFlow(0)
    private val _showLossModal = MutableStateFlow(false)
    private val _currentQuestion = MutableStateFlow(questions[0])

    val quizzCount: StateFlow<Int> = _quizzCount
    val totalQuestion = questions.size
    val currentQuestionIndex: StateFlow<Int> = _currentQuestionIndex
    val currentQuestion: StateFlow<Question> = _currentQuestion


    val showLossModal: StateFlow<Boolean> = _showLossModal

    fun restartQuiz() {
        hideLossModal()
        _quizzCount.value = 1
        _currentQuestionIndex.value = 0
        _currentQuestion.value = questions[0]
    }

    fun navigateHome(
        navController: NavController
    ) = navController.navigate(Route.Home().name) {
        popUpTo(route = Route.Quiz().name) {
            inclusive = true
        }
    }

    fun navigateToCongratsScreen(navController: NavController) =
        navController.navigate(Route.Congrats().name) {
            popUpTo(route = Route.Quiz().name) {
                inclusive = true
            }
        }

    private fun updateCurrentIndex(index: Int) {
        _currentQuestionIndex.value = index
    }

    fun hideLossModal() {
        _showLossModal.value = false
    }

    fun activateLossModal() {
        _showLossModal.value = true
    }

    private fun updateCounter() {
        _quizzCount.value += 1
    }

    fun getQuestion(): Question {
        val questionIndex = currentQuestionIndex.value + 1
        val question = questions[questionIndex]
        updateCurrentIndex(questionIndex)
        _currentQuestion.value = question
        updateCounter()
        return question
    }

    fun isAnswerCorrect(option: Char): Boolean {
        return currentQuestion.value.correctOption == option
    }

    fun isThereAnyQuestionLeft(): Boolean = _quizzCount.value != totalQuestion
}
