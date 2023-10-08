package com.example.myquizapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        // 1
        val que1 = Question(
            1, "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina,
                "Argentina", "Austrialia", "America", "Armenia",
                1
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Australia", "Austrialia", "America", "Armenia",
            1
        )
        questionsList.add(que2)

        // 3
        val que3 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium", "Austrialia", "America", "Armenia",
            1
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "Austrialia", "America", "Armenia",
            1
        )
        questionsList.add(que4)

        // 5
        val que5 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark", "Austrialia", "America", "Armenia",
            1
        )
        questionsList.add(que5)

        // 6
        val que6 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji", "Austrialia", "America", "Armenia",
            1
        )
        questionsList.add(que6)

        // 7
        val que7 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Austrialia", "America", "Armenia",
            1
        )
        questionsList.add(que7)

        // 8
        val que8 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India", "Austrialia", "America", "Armenia",
            1
        )
        questionsList.add(que8)

        // 9
        val que9 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Austrialia", "America", "Armenia",
            1
        )
        questionsList.add(que9)

        // 10
        val que10 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New zealand", "Austrialia", "America", "Armenia",
            1
        )
        questionsList.add(que10)

        return questionsList
    }
}