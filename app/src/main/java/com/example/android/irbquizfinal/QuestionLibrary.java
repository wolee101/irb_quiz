package com.example.android.irbquizfinal;

/**
 * Created by wonheelee on 3/9/18.
 */

public class QuestionLibrary {

    //Question array
    private String questions[] = {

            "1. What does IRB stand for in the context of research?",
            "2. Which of the following is not critical in determining if your study requires IRB approval?",
            "3. Which one of the following is least likely to be classified as research?",
            "4. Human subjects are a living individual about whom an investigator conducting research obtains data through:",
            "5. Which one of the following would most likely to require IRB review?"
    };

    //Answer array - 2-dimensional array (array of arrays, 2 [])
    private String choices[][] = {

            {"Information Research Board", "Institutional Review Board", "Internal Review Board"},
            {"Is my study classified as research defined by the common rule?", "Will the findings of my study be published?", "Does my study involve human subjects?"},
            {"An experiment designed to acquire new knowledge", "A systematic investigation designed to contribute to generalizable knowledge", "A routine testing and analysis of materials"},
            {"intervention/interaction or identifiable private information", "deidentified information", "trusted data providers"},
            {"A study where participants are asked to provide information about their companies.", "A case study that involves the assessment of the student outreach program at school.", "An MTurk experiment that gathers the opinions, experiences, or characteristics of the workers."}

    };

    //Correct answer array
    private String correctAnswers[] = {

            "Institutional Review Board",
            "Will the findings of my study be published?",
            "A routine testing and analysis of materials",
            "intervention/interaction or identifiable private information",
            "An MTurk experiment that gathers the opinions, experiences, or characteristics of the workers."
    };

    //method that returns the question
    public String getQuestion(int a) {
        String question = questions[a];
        return question;
    }

    //return the first item in the array in the choices arrary
    public String getChoice1(int a) {
        String choice0 = choices[a][0];
        return choice0;
    }

    //return the second item in the array in the choices arrary
    public String getChoice2(int a) {
        String choice1 = choices[a][1];
        return choice1;
    }

    //return the third item in the array in the choices arrary
    public String getChoice3(int a) {
        String choice2 = choices[a][2];
        return choice2;
    }

    //method that returns the correct answer
    public String getCorrectAnswer(int a) {
        String answer = correctAnswers[a];
        return answer;
    }
}
