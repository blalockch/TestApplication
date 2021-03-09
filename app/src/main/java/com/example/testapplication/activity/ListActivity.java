package com.example.testapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.testapplication.R;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    //array of weatherobjects

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initViews();

        //listView.setAdapter(weatherListAdapter);
    }

    private void initViews() {
        //listView = (ListView) findViewById(R.id.weather_list);
    }
}