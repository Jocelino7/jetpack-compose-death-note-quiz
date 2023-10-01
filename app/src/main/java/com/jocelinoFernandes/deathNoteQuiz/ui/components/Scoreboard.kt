package com.jocelinoFernandes.deathNoteQuiz.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Scoreboard(
    questionIndex: Int,
    total: Int
) {
    Text(
        text = "$questionIndex/$total",
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.Bold,
        color= Color.White
    )
}

@Preview
@Composable
fun ScoreboardPreview() {
    Scoreboard(questionIndex = 6, total = 37)
}