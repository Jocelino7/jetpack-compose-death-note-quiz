package com.jocelinoFernandes.deathNoteQuiz.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

fun Modifier.costumeBorder() = composed {
    border(
        width = 1.dp,
        color = Color.White,
        shape = RoundedCornerShape(10.dp)
    )
}