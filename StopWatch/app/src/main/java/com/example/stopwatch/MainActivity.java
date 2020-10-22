package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button start, stop, reset;
    private boolean running;
    private int seconds = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.timerTextView_id);
        start = (Button) findViewById(R.id.startBtn_id);
        stop = (Button) findViewById(R.id.stopBtn_id);
        reset = (Button) findViewById(R.id.resetBtn_id);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        reset.setOnClickListener(this);

        runTimer();
    }

    private void runTimer() {

        final Handler handler = new Handler ();
        handler.post(new Runnable() {
            @Override
            public void run() {

                int hour = seconds / 3600;
                int min = seconds / 60;
                int sec = seconds % 60;

                String timer = String.format("%d:%02d:%02d",hour,min,sec);
                textView.setText(timer);

                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);

            }
        });
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.startBtn_id) {

            running = true;

        }
        if (view.getId() == R.id.stopBtn_id) {

            running = false;

        }
        if (view.getId() == R.id.resetBtn_id) {

            running = false;
            seconds = 0;


        }

    }
}