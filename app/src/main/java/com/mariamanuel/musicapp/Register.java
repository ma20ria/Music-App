package com.mariamanuel.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6;
AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
    e1=(EditText) findViewById(R.id.name);
    e2=(EditText) findViewById(R.id.age);
    e3=(EditText) findViewById(R.id.pmobno);
    e4=(EditText) findViewById(R.id.uname);
    e5=(EditText) findViewById(R.id.pass);
    e6=(EditText) findViewById(R.id.cpass);
    b1=(AppCompatButton) findViewById(R.id.rebtn);
    b2=(AppCompatButton) findViewById(R.id.lobtn);
    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
    });
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Registered", Toast.LENGTH_SHORT).show();
        }
    });





    }
}