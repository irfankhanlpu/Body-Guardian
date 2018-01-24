package com.example.tarunmittal.body_guardian;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private EditText txtEmailLogin,txtPasswordLogin;
    Button userLogin;
   // private CallbackManager mCallbackManager;
    private FirebaseAuth mFirebaseAuth;
    Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userLogin= (Button) findViewById(R.id.btnLoginUser);
        signup= (Button) findViewById(R.id.signup);
        txtEmailLogin= (EditText) findViewById(R.id.txtEmailLogin);
        txtPasswordLogin= (EditText) findViewById(R.id.txtPaaswordLogin);
        mFirebaseAuth=FirebaseAuth.getInstance();
        userLogin= (Button) findViewById(R.id.btnLoginUser);

        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtEmailLogin.getText().toString().equals("")&&txtPasswordLogin.getText().toString().equals(""))
                {
                    txtEmailLogin.setError("Please enter email");
                    txtEmailLogin.requestFocus();
                }
                if(txtPasswordLogin.getText().toString().equals(""))
                {
                    txtPasswordLogin.setError("Please enter password");
                    txtPasswordLogin.requestFocus();
                }
                else {
                    final ProgressDialog progressDialog = ProgressDialog.show(MainActivity.this, "Please wait...", "Processing...", true);
                    (mFirebaseAuth.signInWithEmailAndPassword(txtEmailLogin.getText().toString(), txtPasswordLogin.getText().toString())).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressDialog.dismiss();
                            if (task.isSuccessful()) {
                                Toast.makeText(MainActivity.this, "Login Succesfully", Toast.LENGTH_LONG).show();
                                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                                i.putExtra("Email", mFirebaseAuth.getCurrentUser().getEmail());
                                startActivity(i);

                            } else {
                                Log.e("Error", task.getException().toString());
                                Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,signup.class);
                startActivity(i);
            }
        });
    }
}
