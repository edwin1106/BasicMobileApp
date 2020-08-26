package com.example.basicmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PresentationActivity extends AppCompatActivity {

    private TextView nameMember1;
    private TextView nameMember2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);
        nameMember1 = findViewById(R.id.nameMember1);
        nameMember1.setText(R.string.name_member1);

        nameMember2 = findViewById(R.id.nameMember2);
        nameMember2.setText(R.string.name_member2);
    }
}
