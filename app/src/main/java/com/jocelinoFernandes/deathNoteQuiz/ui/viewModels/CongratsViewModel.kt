package com.jocelinoFernandes.deathNoteQuiz.ui.viewModels

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.jocelinoFernandes.deathNoteQuiz.ui.routes.Route

class CongratsViewModel() : ViewModel() {
    fun navigateHome(navController: NavController) = navController.navigate(Route.Home().name) {
        popUpTo(route = Route.Congrats().name) {
            inclusive = true
        }
    }
}