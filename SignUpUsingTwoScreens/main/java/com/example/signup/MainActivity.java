package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name = findViewById(R.id.nameT);
        TextView surname = findViewById(R.id.surnameT);
        TextView email = findViewById(R.id.EmailT);
        Button signUp = findViewById(R.id.buttonSignUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString();
                String s = surname.getText().toString();
                String e = email.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondaryActivity.class);
                intent.putExtra("name",n);
                intent.putExtra("surname",s);
                intent.putExtra("email",e);
                startActivity(intent);
                MainActivity.this.finish();//when pressing back on Secondary activity screen the app will close

            }
        });
    }
}