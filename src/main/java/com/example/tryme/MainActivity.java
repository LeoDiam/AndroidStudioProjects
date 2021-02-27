package com.example.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private View windowView;
    private Button tryMeButton;
    private int[] colours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colours = new int[]{Color.RED, Color.GRAY , Color.GREEN , Color.CYAN , Color.BLACK , Color.BLUE , Color.WHITE , Color.YELLOW ,Color.MAGENTA , Color.LTGRAY};
        windowView = findViewById(R.id.windowViewid);

        tryMeButton = (Button) findViewById(R.id.TryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ranNums = new Random();
                int randomNum = ranNums.nextInt(colours.length);
                windowView.setBackgroundColor(colours[randomNum]);
                Log.d("Random",String.valueOf(randomNum));
            }
        });





    }
}