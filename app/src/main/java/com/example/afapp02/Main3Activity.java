package com.example.afapp02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button4 = (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button4 = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(button4);
            }
        });

        Button button5 = (Button) findViewById(R.id.button3);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button5 = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(button5);
            }
        });
    }
}