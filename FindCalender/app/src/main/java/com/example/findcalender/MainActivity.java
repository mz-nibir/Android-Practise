package com.example.findcalender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindCal(View view) {

        Spinner MySpinner = (Spinner) findViewById(R.id.sp_selected);
        String SelectedCal = MySpinner.getSelectedItem().toString();

        CalenderExpert calender = new CalenderExpert();
        List<String> menu = calender.getMenu(SelectedCal);


        StringBuilder menuFormatted = new StringBuilder();
        for (String calen : menu) {
            menuFormatted.append(calen).append('\n');
        }

        TextView MyText = (TextView) findViewById(R.id.tv_IdList);

        MyText.setText(menuFormatted);
    }
}