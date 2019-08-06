package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnggaranMingguan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggaran_mingguan);
    }

    public void plus(View view) {
        Intent i = new Intent(AnggaranMingguan.this, Anggaran.class);
        startActivity(i);
    }
}
