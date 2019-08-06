package com.example.finance2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity implements View.OnClickListener {


        public Button button4;
        public Button button16;
        public EditText editText2;
        public EditText editText3;

        private FirebaseAuth firebaseAuth;
        private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() !=null) {

            finish();
            startActivity(new Intent(getApplicationContext(),HalamanUtama.class));


        }

            editText2 = (EditText) findViewById(R.id.editText2);
            editText3 = (EditText) findViewById(R.id.editText3);
            button4 = (Button) findViewById(R.id.button4);
            button16 = (Button) findViewById(R.id.button16);

            progressDialog = new ProgressDialog(this);

            button4.setOnClickListener(this);
            button16.setOnClickListener(this);

    }

    private void userLogin() {
        String email =  editText2.getText().toString().trim();
        String password = editText3.getText().toString().trim();

        if(TextUtils.isEmpty(email)) {
            //email is empty
            Toast.makeText(this, "please enter email", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(password)){
            //password is empty
            Toast.makeText(this, "plese enter your password", Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Registering User...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if (task.isSuccessful()){
                            finish();
                            startActivity(new Intent(getApplicationContext(),HalamanUtama.class));


                        }
                    }
                });
    }

    @Override
    public void onClick(View view) {
        if(view == button4) {
            userLogin();
        }

        if(view == button16) {
            finish();
            startActivity(new Intent(this, RegisterActivity.class));
        }

    }


}
