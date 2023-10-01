package com.jocelinoFernandes.deathNoteQuiz.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jocelinoFernandes.deathNoteQuiz.ui.routes.Route
import com.jocelinoFernandes.deathNoteQuiz.ui.screen.Congrats
import com.jocelinoFernandes.deathNoteQuiz.ui.screen.Home
import com.jocelinoFernandes.deathNoteQuiz.ui.screen.Quiz
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Route.Home().name
    ) {
        composable(
            route = Route.Home().name
        ) {
            Home(navController = navController)
        }
        composable(route = Route.Quiz().name) {
            Quiz(navController = navController)
        }
        composable(route = Route.Congrats().name) {
            Congrats(navController = navController)
        }
    }
}