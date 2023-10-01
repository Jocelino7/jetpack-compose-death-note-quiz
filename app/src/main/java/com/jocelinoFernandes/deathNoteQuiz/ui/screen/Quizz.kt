package com.jocelinoFernandes.deathNoteQuiz.ui.screen

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.jocelinoFernandes.deathNoteQuiz.ui.components.AnswerContainer
import com.jocelinoFernandes.deathNoteQuiz.ui.components.LossModal
import com.jocelinoFernandes.deathNoteQuiz.ui.components.Scoreboard
import com.jocelinoFernandes.deathNoteQuiz.ui.components.TextContainer
import com.jocelinoFernandes.deathNoteQuiz.ui.components.VerticalSpacer
import com.jocelinoFernandes.deathNoteQuiz.ui.components.costumeBorder
import com.jocelinoFernandes.deathNoteQuiz.ui.state.QuizState
import com.jocelinoFernandes.deathNoteQuiz.ui.theme.Primary
import com.jocelinoFernandes.deathNoteQuiz.ui.viewModels.QuizViewModel
import kotlinx.coroutines.launch


@Composable
fun Quiz(
    navController: NavController
) {
    val quizViewModel: QuizViewModel = viewModel()
    val callback = QuizState(
        question = quizViewModel.questions,
        currentPageIndex = quizViewModel.currentQuestionIndex.collectAsState().value,
        quizzCount = quizViewModel.quizzCount.collectAsState().value,
        showLossModal = quizViewModel.showLossModal.collectAsState().value,
        isThereAnyQuestionLeft = quizViewModel::isThereAnyQuestionLeft,
        currentQuestion = quizViewModel.currentQuestion.collectAsState().value,
        totalQuestion = quizViewModel.totalQuestion,
        navigateToHome = { quizViewModel.navigateHome(navController) },
        navigateToCongratsScreen = { quizViewModel.navigateToCongratsScreen(navController) },
        isAnswerCorrect = quizViewModel::isAnswerCorrect,
        restartGame = quizViewModel::restartQuiz,
        getQuestion = quizViewModel::getQuestion,
        navController = navController,
        activateLossModal = quizViewModel::activateLossModal,
        hideLossModal = quizViewModel::hideLossModal
    )
    QuizScreen(callback = callback)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun QuizScreen(
    callback: QuizState
) {
    val pageState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f,
    ) {
        callback.totalQuestion
    }
    val scope = rememberCoroutineScope()
    if (callback.showLossModal) {
        LossModal(
            navigateToHome = { callback.navigateToHome() },
            restartGame = callback.restartGame
        )
    }
    HorizontalPager(
        userScrollEnabled = false,
        state = pageState
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .background(
                    color = Primary
                )
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Scoreboard(questionIndex = callback.quizzCount, total = callback.totalQuestion)
            VerticalSpacer(10.dp)
            Column(
                Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .costumeBorder(),
                verticalArrangement = Arrangement.Center,

                ) {
                TextContainer(
                    text = callback.currentQuestion.question
                )
            }
            Column(
                Modifier.weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                callback.currentQuestion.options.map { option ->
                    val correctAnswer = callback.isAnswerCorrect(option.option)
                    AnswerContainer(
                        text = option.answer,
                        option = option.option,
                        isCorrectAnswer = correctAnswer,
                        onClick = {
                            if (correctAnswer) {
                                if (callback.isThereAnyQuestionLeft()) {
                                    scope.launch {
                                        callback.getQuestion()
                                        pageState.animateScrollToPage(
                                            callback.currentPageIndex,
                                            animationSpec = tween(
                                                durationMillis = 1000,
                                                easing = LinearEasing
                                            )
                                        )
                                    }

                                } else {
                                    callback.navigateToCongratsScreen()
                                }
                            } else {
                                callback.activateLossModal()
                            }
                        }
                    )
                    VerticalSpacer()
                }
            }
        }
    }
}


@Preview
@Composable
fun QuizPreview() {
    Quiz(navController = rememberNavController())

}