package com.example.android.irbquizfinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by wonheelee on 3/10/18.
 */

public class ResultActivity extends AppCompatActivity {

    TextView myScore;
    TextView myName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        // Retrive the user name

        Bundle extras = getIntent().getExtras();
        String name = extras.getString("takerName");
        myName = (TextView)findViewById(R.id.nameView);
        myName.setText(name);


        // Retrive the user's quiz score

        Bundle extras2 = getIntent().getExtras();
        int score = extras2.getInt("totalScore");
        myScore = (TextView)findViewById(R.id.totalScoreView);
        myScore.setText(score + "/5");

    }

    /**
     * This method is called when the email button is clicked.
     */
    public void emailIRB(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        String emailAddress = "afbaily@stanford.edu"; //pre-filled email address
        intent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] { emailAddress });
        String emailSubject = "Inquiry about IRB Approval";
        intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
        String emailText = "Dear Adam,";
        intent.putExtra(Intent.EXTRA_TEXT, emailText);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
