package com.example.afapp02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button3 = (Button) findViewById(R.id.button);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button3 = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(button3);
            }
        });

            Button button4 = (Button) findViewById(R.id.button);

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent button4 = new Intent(Main3Activity.this, MainActivity.class);
                    startActivity(button4);
                }
            });
        }
    }

