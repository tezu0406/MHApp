package com.example.mhapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    private Button ButtonReg, LoginRedirect;
    private TextView FirstName, LastName, DOB, EmailId, PhoneNo, pw, rePw;
    private EditText editTextFirstName, editTextLastName, editTextDate, editTextPhoneNo, editTextTextEmailAddress, editTextPassword, editTextRePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButtonReg = findViewById(R.id.ButtonReg);
        LoginRedirect = findViewById(R.id.LoginRedirect);
        FirstName = findViewById(R.id.FirstName);
        LastName = findViewById(R.id.LastName);
        DOB = findViewById(R.id.DOB);
        EmailId = findViewById(R.id.EmailId);
        PhoneNo = findViewById(R.id.PhoneNo);
        pw = findViewById(R.id.pw);
        rePw = findViewById(R.id.rePw);
        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextDate = findViewById(R.id.editTextDate);
        editTextPhoneNo = findViewById(R.id.editTextPhoneNo);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextRePassword = findViewById(R.id.editTextRePassword);

        ButtonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View ButtonReg) {
                Toast.makeText(Registration.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                //Intent homepage = new Intent(getApplicationContext(), homepage.class);
                //startActivity(homepage);
            }
        });
        
        LoginRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LoginRedirect) {
                //Intent loginRedirect =  new Intent(getApplicationContext(), login.class);
                //startActivity(loginRedirect);
            }
        });

    }
}