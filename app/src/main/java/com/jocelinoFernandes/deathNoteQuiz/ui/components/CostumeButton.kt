package com.jocelinoFernandes.deathNoteQuiz.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.jocelinoFernandes.deathNoteQuiz.ui.theme.Secondary

@Composable
fun CostumeButton(
    modifier: Modifier = Modifier,
    text: String = "text",
    backgroundColor: Color = Secondary,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor
        ),
        modifier = modifier.fillMaxWidth()
    ) {
        Text(text = text)

    }
}

@Preview
@Composable
fun CostumeButtonPreview() {
    CostumeButton()
}