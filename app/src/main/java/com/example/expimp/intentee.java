package com.example.expimp;

import android.content. Intent;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle; import android.widget. TextView;

public class intentee extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentee);
//actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Second Activity");
//intent to get data
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");
//TextView
        TextView mResultTv = findViewById(R.id.resultTV);
//set Text
        mResultTv.setText("Name: " + name + "\nEmail: " + email + "\nPhone: " + phone);
    }
}