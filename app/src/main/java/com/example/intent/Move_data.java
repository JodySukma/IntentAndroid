package com.example.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Move_data extends AppCompatActivity  {
    public static final String EXTRA_DATA = "extra_data"; /// untuk menampung hasil inputan main aktivity yang berupa string

    TextView moveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_data);

        moveData = findViewById(R.id.move_data);

        String data = getIntent().getStringExtra(EXTRA_DATA); /// untuk menampilkan data yang sudah di tampung ke view

        moveData.setText(data); /// tampilan data yang sudah di tampilkan di view
    }
}
