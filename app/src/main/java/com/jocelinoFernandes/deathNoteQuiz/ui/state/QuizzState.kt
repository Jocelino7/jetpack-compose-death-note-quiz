package com.jocelinoFernandes.deathNoteQuiz.ui.state

import androidx.navigation.NavController
import com.jocelinoFernandes.deathNoteQuiz.model.Question


data class QuizState(
    var question: MutableList<Question>,
    var quizzCount: Int,
    var totalQuestion: Int,
    var showLossModal: Boolean,
    var currentQuestion: Question,
    var currentPageIndex: Int,
    val handleAnswer: (Char, () -> Unit) -> Unit = { _, _ -> },
    val isThereAnyQuestionLeft: () -> Boolean = { true },
    val isAnswerCorrect: (option: Char) -> Boolean = { true },
    val getQuestion: () -> Unit = {},
    val navigateToHome: () -> Unit = {},
    val navigateToCongratsScreen: () -> Unit = {},
    val restartGame: () -> Unit = {},
    val navController: NavController,
    val activateLossModal:()->Unit={},
    val hideLossModal:()->Unit={}
)