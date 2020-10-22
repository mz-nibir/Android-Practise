package com.example.myvisitingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button  callButton,fbButton,locButton,gmailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callButton= (Button) findViewById(R.id.id_call);
        fbButton= (Button) findViewById(R.id.id_fb);
        locButton= (Button) findViewById(R.id.id_location);
        gmailButton= (Button) findViewById(R.id.gmail_id);

        callButton.setOnClickListener(this);
        fbButton.setOnClickListener(this);
        locButton.setOnClickListener(this);
        gmailButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {


        if (view.getId()==R.id.id_call)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: +8801722414549"));
            startActivity(intent);
        }
        else if (view.getId()==R.id.gmail_id)
        {
            Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("mailto: mz.nibr@gmail.com"));
            startActivity(intent);
        }
        else if (view.getId()==R.id.id_fb)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mz.nibir"));
            startActivity(intent);
        }
        else if (view.getId()==R.id.id_location)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 23.815592, 90.424863"));
            startActivity(intent);
        }



    }
}