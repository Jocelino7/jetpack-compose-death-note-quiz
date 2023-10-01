package com.jocelinoFernandes.deathNoteQuiz.ui.routes

sealed class Route(val name: String) {
    class Home : Route("Home")
    class Quiz : Route("Quiz")
    class Congrats : Route("Congrats")
}
