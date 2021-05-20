package com.example.driverslicense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NoData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_data);
    }

    public void btn4(View view) {
        Intent intent5 = new Intent(this, MainActivity.class);
        startActivity(intent5);
    }
}