package com.jocelinoFernandes.deathNoteQuiz.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jocelinoFernandes.deathNoteQuiz.ui.theme.Primary
import com.jocelinoFernandes.deathNoteQuiz.ui.theme.Secondary
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun AnswerContainer(
    onClick: () -> Unit,
    text: String,
    option: Char,
    isCorrectAnswer: Boolean = false
) {
    var performAnimation by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    val targetValue = if (performAnimation) when (isCorrectAnswer) {
        true -> Secondary
        else -> Color.Red
    } else Primary

    var animation = animateColorAsState(
        targetValue = targetValue,
        label = "color-animation",
        animationSpec = tween(500)
    )
    Box(
        Modifier
            .heightIn(
                max = 50.dp
            )
            .background(
                color = animation.value,
                shape = RoundedCornerShape(10.dp),
            )
            .costumeBorder()
            .clickable {
                scope.launch {
                    performAnimation = true
                    delay(500)
                    performAnimation = false
                    onClick()
                }
            },
    ) {
        Row(
            Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Row(
                Modifier
                    .padding(10.dp)
                    .fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Text(
                    text = option.toString().toUpperCase(),
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
            Text(
                text = text,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color.Red,
                    shape = RoundedCornerShape(10.dp)
                )
                .background(
                    Color.Red,
                    shape = RoundedCornerShape(10.dp)
                )
                .fillMaxHeight()
        )
    }
}

@Preview
@Composable
fun QuestionContainerPreview() {
    AnswerContainer(
        text = "Question",
        option = 'A',
        onClick = {

        }
    )
}