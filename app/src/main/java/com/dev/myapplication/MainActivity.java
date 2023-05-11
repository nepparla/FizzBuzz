package com.dev.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ed = findViewById(R.id.edittext);
        Button button = findViewById(R.id.button);
        String TAG = "FIZZBUZZ";
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.parseInt(String.valueOf(ed.getText()));
                int i = 1;
                for (i = 1; i < count; i++) {
                    if (i % 15 == 0) {
                        Log.d(TAG, "onClick: " + "Fizz Buzz");
                    } else if (i % 3 == 0) {
                        Log.d(TAG, "onClick: " + "Fizz");
                    } else if (i % 5 == 0) {
                        Log.d(TAG, "onClick: " + "Buzz");
                    } else {
                        Log.d(TAG, "onClick: " + i);
                    }
                }
            }
        });

    }
}