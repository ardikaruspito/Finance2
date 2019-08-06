package com.example.finance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

public class HalamanUtama extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth firebaseAuth;
    private ImageView btnKeluar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() == null) {
            finish();
            startActivity(new Intent(this, Login.class));
        }

        FirebaseUser user = firebaseAuth.getCurrentUser();

        btnKeluar = findViewById(R.id.bLogout);
        btnKeluar.setOnClickListener(this);
    }

    public void onClick(View view) {

        if(view == btnKeluar)
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this, Login.class));

    }


    public void beranda(View view) {
        Intent i = new Intent(HalamanUtama.this, BerandaAkun.class);
        startActivity(i);
    }

}















//    public void catatan(View view) {
//        Intent i = new Intent(HalamanUtama.this, Catatan.class);
//        startActivity(i);
//    }
//
//    public void daftar(View view) {
//        Intent i = new Intent(HalamanUtama.this, DaftarBelanja.class);
//        startActivity(i);
//    }
//
//    public void anggaran(View view) {
//        Intent i = new Intent(HalamanUtama.this, Anggaran.class);
//        startActivity(i);
//    }
//
//    public void apk(View view) {
//        Intent i = new Intent(HalamanUtama.this, TentangAplikasi.class);
//        startActivity(i);
//    }

