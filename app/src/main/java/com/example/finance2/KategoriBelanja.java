package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KategoriBelanja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_belanja);
    }

    public void back(View view) {
        Intent i = new Intent(KategoriBelanja.this, Kategori.class);
        startActivity(i);
    }
}
