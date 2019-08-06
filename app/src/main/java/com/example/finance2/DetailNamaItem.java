package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetailNamaItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_nama_item);
    }

    public void tambah(View view) {
        Intent i =new Intent(DetailNamaItem.this, DaftarBelanja.class);
        startActivity(i);
    }
}
