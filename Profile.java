package com.example.mismatched;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    Button Button1;
    Button Button2;
    Button Button3;
    Button Button4;
    Button Button5;
    Button Button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button1 = findViewById(R.id.button1);
        Button2 = findViewById(R.id.button2);
        Button3 = findViewById(R.id.button3);
        Button4 = findViewById(R.id.button4);
        Button5 = findViewById(R.id.button5);
        Button6 = findViewById(R.id.button6);


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(Profile.this , messagearea.class);
                startActivity(abc);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(Profile.this , messagearea.class);
                startActivity(abc);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(Profile.this , messagearea.class);
                startActivity(abc);
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(Profile.this , messagearea.class);
                startActivity(abc);
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(Profile.this , messagearea.class);
                startActivity(abc);
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(Profile.this , messagearea.class);
                startActivity(abc);
            }
        });




    }
}