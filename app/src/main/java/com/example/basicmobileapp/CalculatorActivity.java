package com.example.basicmobileapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basicmobileapp.R;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class CalculatorActivity extends AppCompatActivity {
    Button openCalendar;
    TextView age;
    DatePickerDialog.OnDateSetListener datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        age = (TextView) findViewById(R.id.age);
        openCalendar = (Button) findViewById(R.id.openCalendar);

        openCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        CalculatorActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog,
                        datePicker,
                        year,month,day);
                dialog.getDatePicker().setMaxDate(System.currentTimeMillis());
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        datePicker = new DatePickerDialog.OnDateSetListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month += 1;
                LocalDate dateNow = LocalDate.now();
                LocalDate dateChoosen = LocalDate.of(year, month, day);
                
                Period period = Period.between(dateChoosen, dateNow);
                
                if (period.getYears() <= 0 ){
                    Toast.makeText(CalculatorActivity.this, "Fecha incorrecta", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(CalculatorActivity.this, "Usted tiene" + " " + period.getYears() + " "+"años", Toast.LENGTH_LONG).show();
                }
                String ageString = period.getYears() + " años";
                age.setText(ageString);
            }
        };
    }
}
