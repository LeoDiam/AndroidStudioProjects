package com.example.list_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        DataSource dataSource = new DataSource();
        ArrayList<String> mainMenu = dataSource.getData();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.list_item,R.id.textView_item, mainMenu);
        listView.setAdapter(adapter);
    }
}