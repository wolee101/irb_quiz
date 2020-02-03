package com.example.android.irbquizfinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

    }

    public void toQuiz(View view) {

        EditText userName = (EditText) findViewById(R.id.name_field);
        String name = userName.getText().toString();

        Bundle b = new Bundle();
        //Add your data to bundle, totalScore is the key, score is the integer value
        b.putString("takerName", name);

        Intent quizIntent = new Intent(this, QuizActivity.class);
        quizIntent.putExtras(b);
        startActivity(quizIntent);
    }
}




