package com.example.convertertocapital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText input = findViewById(R.id.editTextinput);
        EditText output = findViewById(R.id.editTextoutput);
        Button convert = findViewById(R.id.convert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String outPut = input.getText().toString();

                if (outPut.contains("Insert text:")){
                    if(outPut.substring(12).toUpperCase().isEmpty())
                        output.setText("No text".toUpperCase());
                    else
                    output.setText(outPut.substring(12).toUpperCase());
                }else {
                    if(outPut.isEmpty())
                        output.setText("No text".toUpperCase());
                    else
                        output.setText(outPut.toUpperCase());

                }
            }
        });

    }
}