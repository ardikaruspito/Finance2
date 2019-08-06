package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BerandaDompetNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_dompet_now);
    }

    public void pindah(View view) {
        Intent i = new Intent(BerandaDompetNow.this, BerandaAkun.class);
        startActivity(i);
    }
}
