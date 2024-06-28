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

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
     e1=(EditText) findViewById(R.id.uname);
     e2=(EditText) findViewById(R.id.pass);
     b1=(AppCompatButton) findViewById(R.id.loid);
     b2=(AppCompatButton) findViewById(R.id.menu) ;
     b2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i=new Intent(getApplicationContext(),Register.class);
             startActivity(i);
         }
     });
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           Intent i=new Intent(getApplicationContext(),Login.class);
           startActivity(i);
        }
    });

    }
}