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
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Button buttonReg = findViewById(R.id.ButtonReg);
        Button loginRedirect = findViewById(R.id.LoginRedirect);
        TextView Name = findViewById(R.id.Name);
        TextView Username = findViewById(R.id.Username);
        TextView DOB = findViewById(R.id.DOB);
        TextView emailId = findViewById(R.id.EmailId);
        TextView phoneNo = findViewById(R.id.PhoneNo);
        TextView pw = findViewById(R.id.pw);
        TextView rePw = findViewById(R.id.rePw);
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextUsername = findViewById(R.id.editTextUsername);
        EditText editTextDate = findViewById(R.id.editTextDate);
        EditText editTextPhoneNo = findViewById(R.id.editTextPhoneNo);
        EditText editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        EditText editTextRePassword = findViewById(R.id.editTextRePassword);
        DB = new DBHelper(this);

        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                String username = editTextUsername.getText().toString();
                int date = editTextDate.getText().toString().isEmpty() ? 0 : Integer.parseInt(editTextDate.getText().toString());
                int phone = editTextPhoneNo.getText().toString().isEmpty() ? 0 : Integer.parseInt(editTextPhoneNo.getText().toString());;
                String email = editTextTextEmailAddress.getText().toString();
                String password = editTextPassword.getText().toString();
                String rePassword = editTextRePassword.getText().toString();
                if(Name.equals("")
                        ||Username.equals("")
                        ||DOB.equals("")
                        ||emailId.equals("")
                        ||phoneNo.equals("")
                        ||pw.equals("")
                        ||rePw.equals("")
                        ||editTextName.equals("")
                        ||editTextUsername.equals("")
                        ||editTextDate.equals("")
                        ||editTextPhoneNo.equals("")
                        ||editTextTextEmailAddress.equals("")
                        ||editTextPassword.equals("")
                        ||editTextRePassword.equals(""))
                    Toast.makeText(Registration.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    if(editTextPassword.equals(editTextRePassword)){
                        Boolean checkuser = DB.checkusername(username);
                        if(!checkuser){
                            Boolean insert = DB.insertData(name,username,date,phone,email,password,rePassword);
                            if(insert){
                                Toast.makeText(Registration.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                //Intent intent = new Intent(getApplicationContext(),homepage.class);
                                //startActivity(intent);
                            }else{
                                Toast.makeText(Registration.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(Registration.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(Registration.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                } }
        });
        
        loginRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LoginRedirect) {
                Intent loginRedirect =  new Intent(getApplicationContext(), login.class);
                startActivity(loginRedirect);
            }
        });

    }
}