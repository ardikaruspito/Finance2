package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormAnggaranBaru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_anggaran_baru);
    }

    public void ctg(View view) {
        Intent i = new Intent(FormAnggaranBaru.this, AnggaranMingguan.class);
        startActivity(i);
    }
}
