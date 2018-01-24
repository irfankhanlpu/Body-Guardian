package com.example.tarunmittal.body_guardian;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signup extends AppCompatActivity {
    private EditText txtEmailAddress,txtPassword;
    private FirebaseAuth mFirebaseAuth;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        txtEmailAddress= (EditText) findViewById(R.id.txtEmailRegistraion);
        txtPassword= (EditText) findViewById(R.id.txtPaaswordRegistration);
        mFirebaseAuth=FirebaseAuth.getInstance();
        register= (Button) findViewById(R.id.btnRegistrationUser);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog progressDialog=ProgressDialog.show(signup.this,"Please wait...","Processing",true);
                (mFirebaseAuth.createUserWithEmailAndPassword(txtEmailAddress.getText().toString(),txtPassword.getText().toString()
                )).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if(task.isSuccessful())
                        {
                            Toast.makeText(signup.this,"Register succesfully",Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(signup.this,MainActivity.class);
                            startActivity(i
                            );
                        }
                        else
                        {
                            Log.e("Error",task.getException().toString());
                            Toast.makeText(signup.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}
