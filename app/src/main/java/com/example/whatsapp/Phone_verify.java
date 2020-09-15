package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class Phone_verify extends AppCompatActivity {
    Button b;
    TextInputLayout phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verify);
        phoneNumber = findViewById(R.id.phone_Number);
    }

    public void callNextScreen (View view) {
        // Performing Validation by calling validation functions
        if (!validatePhoneNo()) {
            return;

        }
        //Get the Phone No from phone no field in String
        String phoneNo = phoneNumber.getEditText().getText().toString();

        //Call the next activity and pass phone no with it
        Intent intent = new Intent(Phone_verify.this, Home_screen.class);
        intent.putExtra("phoneNo", phoneNo);
        startActivity(intent);
    }

    private boolean validatePhoneNo() {
        String val = phoneNumber.getEditText().getText().toString();

        if (val.isEmpty()) {
            phoneNumber.setError("Field cannot be empty");
            return false;
        }
        else {
            phoneNumber.setError(null);
            phoneNumber.setErrorEnabled(false);
            return true;
        }
    };

}