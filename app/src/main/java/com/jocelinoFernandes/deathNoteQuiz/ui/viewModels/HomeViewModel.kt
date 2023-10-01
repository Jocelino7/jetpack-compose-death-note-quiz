package com.jocelinoFernandes.deathNoteQuiz.ui.viewModels

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.jocelinoFernandes.deathNoteQuiz.ui.routes.Route

class HomeViewModel : ViewModel() {
    fun navigateToQuizScreen(navController: NavController) =
        navController.navigate(Route.Quiz().name)
}