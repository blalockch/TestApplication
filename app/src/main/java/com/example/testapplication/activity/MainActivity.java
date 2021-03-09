package com.example.testapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testapplication.R;
import com.example.testapplication.RestCallback;
import com.example.testapplication.objects.APIResponseClass;
import com.example.testapplication.objects.WeatherForecast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RestCallback {

    private Button searchButton;
    private EditText searchEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        searchEditText = (EditText) findViewById(R.id.search_text);
        searchButton = (Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search_button:
                searchButtonClick();
                break;
        }
    }

    private void searchButtonClick() {
        WeatherForecast.GetList(this, String.valueOf(searchEditText.getText()));
    }

    @Override
    public void onSuccess(Object o) {
        APIResponseClass apiResponseClass = (APIResponseClass) o;
        if(apiResponseClass!=null) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.putExtra("responseIntent", apiResponseClass);
            startActivityForResult(intent, 1);
        }else {
            Toast.makeText(getApplicationContext(), "Object Error", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onFailure(Throwable T) {
        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
    }

}