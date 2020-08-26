package com.example.basicmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonPresentation;
    private Button buttonForm;
    private Button buttonCalculator;
    private TextView teamPresentation;
    private TextView ageCalculator;
    private TextView form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamPresentation = findViewById(R.id.teamPresentation);
        teamPresentation.setText(R.string.team_presentation);

        ageCalculator = findViewById(R.id.ageCalculator);
        ageCalculator.setText(R.string.age_calculator);

        form = findViewById(R.id.form);
        form.setText(R.string.form);

        buttonPresentation = (Button) findViewById(R.id.buttonPresentation);
        buttonPresentation.setText(R.string.text_button);

        buttonForm = (Button) findViewById(R.id.buttonForm);
        buttonForm.setText(R.string.text_button);

        buttonCalculator = (Button) findViewById(R.id.buttonCalculator);
        buttonCalculator.setText(R.string.text_button);

        buttonPresentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PresentationActivity.class);
                startActivity(i);
            }
        });

        buttonForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FormActivity.class);
                startActivity(i);
            }
        });

        buttonCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(i);
            }
        });
    }
}