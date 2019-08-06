package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KategoriPengeluaranFinansial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_pengeluaran_finansial);
    }

    public void back(View view) {
        Intent i = new Intent(KategoriPengeluaranFinansial.this, Kategori.class);
        startActivity(i);
    }
}
