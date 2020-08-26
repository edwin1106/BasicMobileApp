package com.example.basicmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonPresentation;
    Button buttonForm;
    Button buttonCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPresentation = (Button) findViewById(R.id.buttonPresentation);
        buttonForm = (Button) findViewById(R.id.buttonForm);
        buttonCalculator = (Button) findViewById(R.id.buttonCalculator);

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