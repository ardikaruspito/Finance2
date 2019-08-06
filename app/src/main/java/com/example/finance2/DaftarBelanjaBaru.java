package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DaftarBelanjaBaru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_belanja_baru);
    }

    public void Daftar(View view) {
        Intent i = new Intent(DaftarBelanjaBaru.this, TambahDetailNamaItem.class);
        startActivity(i);
    }
}
