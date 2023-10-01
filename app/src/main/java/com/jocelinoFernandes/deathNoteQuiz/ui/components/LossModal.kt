package com.jocelinoFernandes.deathNoteQuiz.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.jocelinoFernandes.deathNoteQuiz.ui.theme.Primary

@Composable
fun LossModal(
    navigateToHome: () -> Unit,
    restartGame: () -> Unit
) {
    Dialog(onDismissRequest = { /*TODO*/ }) {
        Column(
            Modifier
                .height(150.dp)
                .background(color = Primary)
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Deseja voltar para o Menu Principal?",
                color = Color.White
            )
            VerticalSpacer()
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                CostumeButton(
                    modifier = Modifier.widthIn(max = 150.dp),
                    text = "Voltar ao menu",
                    backgroundColor = Color.Red
                ) {
                    navigateToHome()
                }
                Spacer(modifier = Modifier.width(10.dp))
                CostumeButton(
                    modifier = Modifier.widthIn(max = 150.dp),
                    text = "Reiniciar"
                ) {
                    restartGame()
                }
            }
        }
    }
}

@Preview
@Composable
fun LossModalPreview() {
    LossModal(
        navigateToHome = {},
        restartGame = {}
    )
}