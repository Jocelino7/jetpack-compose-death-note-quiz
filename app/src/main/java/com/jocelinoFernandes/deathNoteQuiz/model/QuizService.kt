package com.jocelinoFernandes.deathNoteQuiz.model

class QuizService {
    private val questions: MutableList<Question> = mutableListOf(
        Question(
            "Who is the main character of Death Note?",
            listOf(
                Options("Light Yagami", 'A'),
                Options("L Lawliet", 'B'),
                Options("Misa Amane", 'C'),
                Options("Ryuk", 'D')
            ),
            'A'
        ),
        Question(
            "What is the primary power of the Death Note?",
            listOf(
                Options("Time Travel", 'A'),
                Options("Mind Reading", 'B'),
                Options("Teleportation", 'C'),
                Options("Death Inducement", 'D')
            ),
            'D'
        ),
        Question(
            "Who is the Shinigami who drops the Death Note to the human world?",
            listOf(
                Options("Rem", 'A'),
                Options("Sidoh", 'B'),
                Options("Ryuk", 'C'),
                Options("Gelus", 'D')
            ),
            'C'
        ),
        Question(
            "What is L's real name?",
            listOf(
                Options("Lawliet L", 'A'),
                Options("Light Yagami", 'B'),
                Options("Nate River", 'C'),
                Options("Mihael Keehl", 'D')
            ),
            'A'
        ),
        Question(
            "Who is the second Kira in Death Note?",
            listOf(
                Options("Misa Amane", 'A'),
                Options("Teru Mikami", 'B'),
                Options("Kiyomi Takada", 'C'),
                Options("Kyosuke Higuchi", 'D')
            ),
            'A'
        ),
        Question(
            "What is the name of L's successor?",
            listOf(
                Options("Mello", 'A'),
                Options("Near", 'B'),
                Options("Matt", 'C'),
                Options("Watari", 'D')
            ),
            'B'
        ),
        Question(
            "Who is the first person to discover the Death Note?",
            listOf(
                Options("Light Yagami", 'A'),
                Options("Misa Amane", 'B'),
                Options("Ryuk", 'C'),
                Options("L Lawliet", 'D')
            ),
            'A'
        ),
        Question(
            "What is the name of Light Yagami's sister?",
            listOf(
                Options("Sachiko Yagami", 'A'),
                Options("Sayu Yagami", 'B'),
                Options("Mikami Yagami", 'C'),
                Options("Amane Yagami", 'D')
            ),
            'B'
        ),
        Question(
            "What is the name of the detective agency that L sets up to investigate Kira?",
            listOf(
                Options("Wammy's House", 'A'),
                Options("SPK", 'B'),
                Options("Task Force", 'C'),
                Options("NPA", 'D')
            ),
            'C'
        ),
        Question(
            "What is the real name of the detective known as 'L'?",
            listOf(
                Options("Lawliet L", 'A'),
                Options("Ryuzaki L", 'B'),
                Options("Nate River", 'C'),
                Options("Mihael Keehl", 'D')
            ),
            'A'
        ),
        Question(
            "What is the name of Misa Amane's Shinigami?",
            listOf(
                Options("Ryuk", 'A'),
                Options("Rem", 'B'),
                Options("Sidoh", 'C'),
                Options("Gelus", 'D')
            ),
            'B'
        ),
        Question(
            "What does L love to eat?",
            listOf(
                Options("Pizza", 'A'),
                Options("Chocolate", 'B'),
                Options("Cakes", 'C'),
                Options("Fruit", 'D')
            ),
            'C'
        ),
        Question(
            "What is the name of the notebook in which Light first writes names?",
            listOf(
                Options("Death Note", 'A'),
                Options("Kira's Notebook", 'B'),
                Options("Black Notebook", 'C'),
                Options("Death Journal", 'D')
            ),
            'A'
        ),
        Question(
            "What is the maximum number of characters a person can write in the Death Note?",
            listOf(
                Options("1000", 'A'),
                Options("500", 'B'),
                Options("2000", 'C'),
                Options("There´s no limit", 'D')
            ),
            'D'
        ),
        Question(
            "What is Light Yagami's alias as Kira?",
            listOf(
                Options("Zero", 'A'),
                Options("K", 'B'),
                Options("L", 'C'),
                Options("Kira", 'D')
            ),
            'D'
        ),
        Question(
            "What is Misa Amane's occupation before obtaining the Death Note?",
            listOf(
                Options("Model", 'A'),
                Options("Singer", 'B'),
                Options("Actress", 'C'),
                Options("Police Officer", 'D')
            ),
            'A'
        ),
        Question(
            "What is the name of Light Yagami's father?",
            listOf(
                Options("Soichiro Yagami", 'A'),
                Options("Touta Matsuda", 'B'),
                Options("Shuichi Aizawa", 'C'),
                Options("Hideki Ide", 'D')
            ),
            'A'
        ),
        Question(
            "What is the name of the notebook used by Misa Amane to make the eye deal with the Shinigami?",
            listOf(
                Options("Death Note", 'A'),
                Options("Second Kira's Notebook", 'B'),
                Options("Misa's Notebook", 'C'),
                Options("Shinigami Notebook", 'D')
            ),
            'A'
        ),
        Question(
            "Who is the owner of the Death Note after Light Yagami´s death?",
            listOf(
                Options("L", 'A'),
                Options("Near", 'B'),
                Options("Mello", 'C'),
                Options("Mikami", 'D')
            ),
            'B'
        ),
        Question(
            "What is the name of the detective who initially confronts Kira and is known for his sweet tooth?",
            listOf(
                Options("L", 'A'),
                Options("Near", 'B'),
                Options("Mello", 'C'),
                Options("Matsuda", 'D')
            ),
            'A'
        ),
        Question(
            "How does Light Yagami typically kill criminals using the Death Note?",
            listOf(
                Options("Stabbing", 'A'),
                Options("Shooting", 'B'),
                Options("Heart Attack", 'C'),
                Options("Drowning", 'D')
            ),
            'C'
        ),
        Question(
            "What is the name of the task force created to capture Kira?",
            listOf(
                Options("SPK", 'A'),
                Options("Task Force", 'B'),
                Options("NPA", 'C'),
                Options("Wammy's House", 'D')
            ),
            'B'
        ),
        Question(
            "What is the name of Light Yagami's girlfriend in the series?",
            listOf(
                Options("Misa Amane", 'A'),
                Options("Kiyomi Takada", 'B'),
                Options("Naomi Misora", 'C'),
                Options("Sayu Yagami", 'D')
            ),
            'A'
        ),
        Question(
            "What is the primary goal of Kira in the series?",
            listOf(
                Options("Becoming a detective", 'A'),
                Options("World domination", 'B'),
                Options("Eliminating all crime", 'C'),
                Options("Becoming a Shinigami", 'D')
            ),
            'C'
        ),
        Question(
            "What does L's name stand for in the story?",
            listOf(
                Options("L Lawliet", 'A'),
                Options("L Light", 'B'),
                Options("L Love", 'C'),
                Options("L Leviathan", 'D')
            ),
            'A'
        ),
        Question(
            "How many Death Notes are there in the human world initially?",
            listOf(
                Options("One", 'A'),
                Options("Two", 'B'),
                Options("Three", 'C'),
                Options("Four", 'D')
            ),
            'B'
        ),
        Question(
            "What is the name of the Shinigami King in the Death Note series?",
            listOf(
                Options("Ryuk", 'A'),
                Options("Rem", 'B'),
                Options("Sidoh", 'C'),
                Options("King Shinigami", 'D')
            ),
            'D'
        ),
        Question(
            "Who is the first victim of Light Yagami using the Death Note?",
            listOf(
                Options("A Kidnapper", 'A'),
                Options("A murderer", 'B'),
                Options("A bully", 'C'),
                Options("A politician", 'D')
            ),
            'A'
        ),
        Question(
            "What is the rule in the Death Note that allows the Shinigami to extend a human's lifespan?",
            listOf(
                Options("Rule 5", 'A'),
                Options("Rule 23", 'B'),
                Options("Rule 42", 'C'),
                Options("There is no such rule", 'D')
            ),
            'D'
        ),
        Question(
            "What is the name of the organization that opposes Kira and is led by Near and Mello?",
            listOf(
                Options("SPK", 'A'),
                Options("Task Force", 'B'),
                Options("NPA", 'C'),
                Options("Wammy's House", 'D')
            ),
            'A'
        ),
        Question(
            "Who is the Shinigami who kills L to save Misa Amane?",
            listOf(
                Options("Ryuk", 'A'),
                Options("Rem", 'B'),
                Options("Sidoh", 'C'),
                Options("Gelus", 'D')
            ),
            'B'
        ),
        Question(
            "What is Light Yagami's father's occupation?",
            listOf(

                Options("Doctor", 'A'),
                Options("Lawyer", 'B'),
                Options("Chef", 'C'),
                Options("Detective", 'D'),
            ),
            'D'
        ),
        Question(
            "How does Light Yagami first come into possession of the Death Note?",
            listOf(
                Options("Ryuk gives it to him", 'A'),
                Options("He buys it from a store", 'B'),
                Options("He finds it in a park", 'C'),
                Options("He steals it from a police station", 'D')
            ),
            'C'
        ),
        Question(
            "What is the primary difference between the two Death Notes in the human world?",
            listOf(
                Options("Color", 'A'),
                Options("Size", 'B'),
                Options("Writing rules", 'C'),
                Options("None, they are identical", 'D')
            ),
            'D'
        ),
        Question(
            "What is the name of the Shinigami realm in the Death Note series?",
            listOf(
                Options("Mire", 'A'),
                Options("Netherworld", 'B'),
                Options("Abyss", 'C'),
                Options("Shinigami Realm", 'D')
            ),
            'D'
        ),
        Question(
            "Who ultimately wins the battle of wits between Light Yagami and L?",
            listOf(
                Options("L", 'A'),
                Options("Light Yagami", 'B'),
                Options("They both die", 'C'),
                Options("It's inconclusive", 'D')
            ),
            'B'
        ),
        Question(
            "What is the final fate of Light Yagami in the Death Note series?",
            listOf(
                Options("He is arrested and imprisoned", 'A'),
                Options("He escapes and continues his killings", 'B'),
                Options("He is killed by Ryuk", 'C'),
                Options("He becomes a Shinigami", 'D')
            ),
            'C'
        ),
        Question(
            "Who is the director of the task force working to catch Kira?",
            listOf(
                Options("Hidek Ide", 'A'),
                Options("Touta Matsuda", 'B'),
                Options("Shuichi Aizawa", 'C'),
                Options("Soichiro Yagami", 'D')
            ),
            'D'
        )
    )

    fun getAllQuestion(): MutableList<Question> = questions
}