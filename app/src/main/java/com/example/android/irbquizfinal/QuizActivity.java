package com.example.android.irbquizfinal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    //create our QuestionLibrary object and make it private
    private QuestionLibrary questionLibrary = new QuestionLibrary();

    //Create variables to hold the score, questions, and buttons

    private TextView questionView;
    private Button buttonChoice1;
    private Button buttonChoice2;
    private Button buttonChoice3;
    private String answer;
    private int score = 0;
    private int questionNumber = 0;
    private ArrayList<QuestionLibrary> questionArrayList;

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_page);

        Bundle extras = getIntent().getExtras();
        name = extras.getString("takerName");

        //connect these variables to the views in xml

        questionView = (TextView) findViewById(R.id.question);
        buttonChoice1 = (Button) findViewById(R.id.choice1);
        buttonChoice2 = (Button) findViewById(R.id.choice2);
        buttonChoice3 = (Button) findViewById(R.id.choice3);


        updateQuestion(); //Include it in the onCreate method. If you don't, the question and answers are not displayed.

        //Create a listener for each button that is going to handle clicks when the Button is pressed

        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if the text from the button equals to the correct answer, the score increases by 1.
                if (buttonChoice1.getText() == answer) {

                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();

                    updateQuestion();
                }
            }
        });

        buttonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonChoice2.getText() == answer) {

                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();

                    updateQuestion();
                }
            }
        });

        buttonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonChoice3.getText() == answer) {

                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

    }

    //Update the question.
    private void updateQuestion() {

        if (questionNumber < 5) {

            questionView.setText(questionLibrary.getQuestion(questionNumber));
            buttonChoice1.setText(questionLibrary.getChoice1(questionNumber));
            buttonChoice2.setText(questionLibrary.getChoice2(questionNumber));
            buttonChoice3.setText(questionLibrary.getChoice3(questionNumber));

            answer = questionLibrary.getCorrectAnswer(questionNumber);

            questionNumber++;

        } else {

            //Create the intent and pass the score from this activity to the result activity
            Intent resultIntent = new Intent(this, ResultActivity.class);
//            AutoCompleteTextView scoreView = (AutoCompleteTextView) findViewById(R.id.totalScoreView);


            //Create the bundle
            Bundle b2 = new Bundle();
            //Add your data to bundle, totalScore is the key, score is the integer value
            b2.putInt("totalScore", score);
            //Add the bundle to the intent
            resultIntent.putExtras(b2);

            Bundle b3 = new Bundle();
            //Add your data to bundle, takerName is the key, name is the string value
            b3.putString("takerName", name);
            resultIntent.putExtras(b3);

            //Start the ResultActivity
            startActivity(resultIntent);

        }
    }

    //Update the score.

    private int updateScore(int point) {
        return score;
    }
}










