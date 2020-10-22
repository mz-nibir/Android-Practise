package com.example.mybuttondem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button loginButton,logoutButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.loginButtonId);

        loginButton = (Button) findViewById(R.id.logoutButtonId);

        textView = (TextView) findViewById(R.id.textViewId);

        loginButton.setOnClickListener(this);
        logoutButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.loginButtonId){
            textView.setText("Login Button is clicked");
        }
        if(view.getId()==R.id.logoutButtonId){
            textView.setText("Logout is clicked");

        }

    }
}