package com.jocelinoFernandes.deathNoteQuiz.ui.screen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.jocelinoFernandes.deathNoteQuiz.R
import com.jocelinoFernandes.deathNoteQuiz.ui.components.CostumeButton
import com.jocelinoFernandes.deathNoteQuiz.ui.components.VerticalSpacer
import com.jocelinoFernandes.deathNoteQuiz.ui.theme.Primary
import com.jocelinoFernandes.deathNoteQuiz.ui.viewModels.CongratsViewModel

@Composable
fun Congrats(
    navController: NavController
) {
    val congratsViewModel: CongratsViewModel = viewModel()
    CongratsScreen {
        congratsViewModel.navigateHome(navController)
    }

}

@Composable
fun CongratsScreen(
    goHome: () -> Unit
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Primary),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        VerticalSpacer()
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.baseline_celebration_24),
            contentDescription = "celebration icon",
            tint = Color.Yellow,
            modifier = Modifier.size(100.dp)
        )
        VerticalSpacer()
        Text(
            text = "Congratulations",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White,
            fontWeight = FontWeight.Bold,
        )
        VerticalSpacer()
        Text(
            text = "Congratulations on your impressive victory in the Death Note quiz! It's evident that you possess a deep understanding of the series, its characters, and its intricate plot. Your dedication and knowledge shine as brilliantly as Light Yagami's intellect when he first encountered the Death Note.\n" +
                    "\n" +
                    "Mastering a quiz like this is a testament to your passion for the world of Death Note, and it's always a pleasure to see fans like you excel. Keep up the fantastic work, and may your passion for anime and manga continue to lead you on exciting journeys through various fictional universes.",
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.bodyLarge
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(10.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ) {
            CostumeButton(
                text = "Go home"
            ) {
                goHome()
            }
        }
    }
}

@Preview
@Composable
fun CongratsPreview() {
    Congrats(navController = rememberNavController())
}