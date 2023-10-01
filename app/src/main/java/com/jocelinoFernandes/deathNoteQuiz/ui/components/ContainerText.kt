package com.jocelinoFernandes.deathNoteQuiz.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextContainer(text: String) {
    Text(
        text = text,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        style = MaterialTheme.typography.titleLarge,
        textAlign = TextAlign.Center,
    )
}

@Preview
@Composable
fun TextContainerPreview() {
    TextContainer(
        text = "questionContainer"
    )
}