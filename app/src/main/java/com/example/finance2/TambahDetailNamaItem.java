package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TambahDetailNamaItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_detail_nama_item);
    }

    public void next(View view) {
        Intent i = new Intent(TambahDetailNamaItem.this, DetailNamaItem.class);
        startActivity(i);
    }
}
