package com.example.mhapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        TextView textView11 = findViewById(R.id.textView11);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView10 = findViewById(R.id.textView10);
        EditText editTextPhone = findViewById(R.id.editTextPhone);
        EditText editTextTextPassword2 = findViewById(R.id.editTextTextPassword2);
        Button button = findViewById(R.id.button);
        Button button5 = findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg = new Intent(getApplicationContext(), Registration.class);
                startActivity(reg);
            }
        });
    }
}