package com.jocelinoFernandes.deathNoteQuiz.ui.screen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.jocelinoFernandes.deathNoteQuiz.ui.components.CostumeButton
import com.jocelinoFernandes.deathNoteQuiz.ui.theme.Primary
import com.jocelinoFernandes.deathNoteQuiz.ui.viewModels.HomeViewModel

@Composable
fun Home(
    navController: NavController
) {
    val homeViewModel: HomeViewModel = viewModel()
    HomeScreen {
        homeViewModel.navigateToQuizScreen(navController)
    }
}

@Composable
fun HomeScreen(
    navigateToQuizScreen: () -> Unit
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Primary)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Death Note Quizz",
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
        }
        Column(
            modifier = Modifier.weight(1f)
                .padding(horizontal = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CostumeButton(
                text = "Play"
            ) {
                navigateToQuizScreen()
            }
        }
    }
}

@Preview
@Composable
fun HomePreview() {
    Home(
        navController = rememberNavController()
    )
}