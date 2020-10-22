package com.example.mytextviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView ageTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = (TextView) findViewById(R.id.nameTextviewId) ;
        nameTextView.setText("marufuzzaman nibir");

        ageTextView = findViewById(R.id.ageTextViewId);
        ageTextView.setText("26 years old");
    }
}