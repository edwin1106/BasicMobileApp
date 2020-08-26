package com.example.basicmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    EditText name;
    EditText lastName;
    EditText phone;
    Button sendDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        name = (EditText) findViewById(R.id.personName);
        lastName = (EditText) findViewById(R.id.personLastName);
        phone = (EditText) findViewById(R.id.personPhone);
        sendDate = (Button) findViewById(R.id.buttonValidate);

        sendDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate())
                {
                    Toast.makeText(FormActivity.this, "Se ingresó datos de " + name.getText().toString() +
                            " " + lastName.getText().toString() + " y su número es: " + phone.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validate()
    {
        boolean validation = true;

        String personName = name.getText().toString();
        String personLastName = lastName.getText().toString();
        String personPhone = phone.getText().toString();
        if (personName.isEmpty())
        {
            name.setError("El campo nombre es obligatorio");
            validation = false;
        }
        if (personLastName.isEmpty())
        {
            lastName.setError("El campo apellido es obligatorio");
            validation = false;
        }
        if (personPhone.isEmpty())
        {
            phone.setError("El campo teléfono es obligatorio");
            validation = false;
        }

        return validation;
    }
}