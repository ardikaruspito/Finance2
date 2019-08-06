package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kategori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
    }
    public void makananminuman(View view) {
        Intent intent =new Intent(Kategori.this, KategoriMakanMinum.class);
        startActivity(intent);
    }

    public void berbelanja(View view) {
        Intent intent = new Intent(Kategori.this, KategoriBelanja.class);
        startActivity(intent);
    }

    public void transportasi (View view) {
        Intent intent = new Intent(Kategori.this, KategoriTransportasi.class);
        startActivity(intent);
    }

    public void gayahidupliburan (View view) {
        Intent intent = new Intent(Kategori.this, KategoriGayaHidup.class);
        startActivity(intent);
    }

    public void komputer (View view) {
        Intent intent = new Intent(Kategori.this, KategoriKomunikasi.class);
        startActivity(intent);
    }


    public void pengeluaranfinansial(View view) {
        Intent intent = new Intent(Kategori.this, KategoriPengeluaranFinansial.class);
        startActivity(intent);
    }


    public void penghasilan(View view) {
        Intent intent = new Intent(Kategori.this, KategoriPenghasilan.class);
        startActivity(intent);
    }
}
