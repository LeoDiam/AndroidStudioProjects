package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText input1 = findViewById(R.id.inputNum1);
        EditText input2 = findViewById(R.id.inputNum2);
        Button clear = findViewById(R.id.clear);
        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button div = findViewById(R.id.div);
        Button mul = findViewById(R.id.mul);
        EditText result = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(String.valueOf(Double.valueOf(input1.getText().toString())
                        + Double.valueOf(input2.getText().toString())));
                input1.setText("");
                input2.setText("");

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.valueOf(Double.valueOf(input1.getText().toString())
                        - Double.valueOf(input2.getText().toString())));
                input1.setText("");
                input2.setText("");

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.valueOf(Double.valueOf(input1.getText().toString())
                        * Double.valueOf(input2.getText().toString())));
                input1.setText("");
                input2.setText("");

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.valueOf(Double.valueOf(input1.getText().toString())
                        / Double.valueOf(input2.getText().toString())));
                input1.setText("");
                input2.setText("");

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                input2.setText("");
            }
        });


    }
}