package com.rybalov.omarhayamoneveryday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Spinner spinnerDays;
    private TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerDays = findViewById(R.id.spinnerDays);
        textViewDescription = findViewById(R.id.textViewDescription);
    }

    public void showRubai(View view) {
        int position = spinnerDays.getSelectedItemPosition();
        String description = getRubaiByPosition(position);
        textViewDescription.setText(description);
    }

    private String getRubaiByPosition(int position) {
        String[] rubais = getResources().getStringArray(R.array.rubai);
        return rubais[position];
    }
}