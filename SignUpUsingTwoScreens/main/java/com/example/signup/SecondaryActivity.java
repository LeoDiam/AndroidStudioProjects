package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_activity);
        TextView name = findViewById(R.id.nameText);
        TextView surname = findViewById(R.id.surnameText);
        TextView email = findViewById(R.id.emailText);

        name.setText(getIntent().getExtras().getString("name"));
        surname.setText(getIntent().getExtras().getString("surname"));
        email.setText(getIntent().getExtras().getString("email"));

    }
}