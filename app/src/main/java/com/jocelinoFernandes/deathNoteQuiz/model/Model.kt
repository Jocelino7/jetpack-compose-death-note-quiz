package com.jocelinoFernandes.deathNoteQuiz.model

data class Question(
    val question: String,
    val options: List<Options>,
    val correctOption: Char
)

data class Options(
    val answer: String,
    val option: Char
)
