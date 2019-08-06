package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Anggaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggaran);
    }

    public void plus(View view) {
        Intent i = new Intent(Anggaran.this, FormAnggaranBaru.class);
        startActivity(i);
    }
}
