package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BerandaAkun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_akun);
    }

    public void dompet(View view) {
        Intent i = new Intent(BerandaAkun.this, BerandaDompetNow.class);
        startActivity(i);
    }
}
