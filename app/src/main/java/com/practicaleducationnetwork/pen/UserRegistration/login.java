package com.practicaleducationnetwork.pen.UserRegistration;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.practicaleducationnetwork.pen.R;


public class login extends Activity implements View.OnClickListener {
    private Button signIn;
    private TextView signUp, userName, userEmail,forget;
    private EditText pswd;
    private EditText Email;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        firebaseAuth = FirebaseAuth.getInstance();

        if (firebaseAuth.getCurrentUser() != null) {

            Intent i = new Intent(login.this, profileMenu.class);
            startActivity(i);

            finish();
        }

        progressDialog = new ProgressDialog(this);
        signIn = (Button) findViewById(R.id.signIn);
        signUp = (TextView) findViewById(R.id.signUp);
        pswd = (EditText) findViewById(R.id.pswd);
        Email = (EditText) findViewById(R.id.Email);
        userEmail = (TextView) findViewById(R.id.userEmail);
        userName = (TextView) findViewById(R.id.userName);
        forget=(TextView) findViewById(R.id.forget);


        signIn.setOnClickListener(this);
        signUp.setOnClickListener(this);
        forget.setOnClickListener(this);

    }


    private void userLogin() {
        String email = Email.getText().toString().trim();
        String password = pswd.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Signing in..");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if (task.isSuccessful()) {
                            //Login Menu for  user
                            Intent i = new Intent(login.this, profileMenu.class);
                            startActivity(i);
                            finish();

                    }}
                });


    }

    @Override
    public void onClick(View view) {

        if (view == signIn) {
            userLogin();
        }

        if (view == signUp) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }


        if(view==forget){
            startActivity(new Intent(this,reset.class));
            finish();

        }
    }

}

