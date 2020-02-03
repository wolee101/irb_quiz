package com.example.android.irbquizfinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.irbquizfinal.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toFirst(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

}

// Don't need this when you call the method by onClick id "toQuiz"

//        pageMainButton = (Button) findViewById(R.id.pageMain);
//        pageMainButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//    public void openFirstActivity() {
//        Intent intent = new Intent(this, com.example.android.irbquizfinal.FirstActivity.class);
//        startActivity(intent);
//    }
//
//}


















