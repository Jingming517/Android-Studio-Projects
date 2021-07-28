package com.example.ex1_registrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.textViewFirstName);
        TextView txtLastName = findViewById(R.id.textViewLastName);
        TextView txtEmail = findViewById(R.id.textViewEmail);

        EditText edtTxtFirstName = findViewById(R.id.editTextFirstName);
        EditText edtTxtLastName = findViewById(R.id.editTextLastName);
        EditText edtTxtEmail = findViewById(R.id.editTextEmail);

        txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString());
        txtLastName.setText("Last Name: " + edtTxtLastName.getText().toString());
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());
    }
}