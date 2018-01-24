package com.example.tarunmittal.body_guardian;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.appinvite.AppInviteInvitation;

import java.util.ArrayList;



public class HomeActivity extends AppCompatActivity {
    RelativeLayout rbmi,rel1,rel2,rel3,rel4;
    TextView t;
    TextView tv;
    private static final int REQUEST_INVITE = 0;
    private static final String TAG = MainActivity.class.getSimpleName();
    FloatingActionButton shar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        rbmi = (RelativeLayout) findViewById(R.id.relativeBMI);
        rel1 = (RelativeLayout) findViewById(R.id.rel1);
        rel2=(RelativeLayout) findViewById(R.id.rel2);
        rel3= (RelativeLayout) findViewById(R.id.rel3);
tv= (TextView) findViewById(R.id.tvdisplay);
        tv.setText(getIntent().getExtras().getString("Email"));
        t= (TextView) findViewById(R.id.tt1);
        rel4= (RelativeLayout) findViewById(R.id.rel4);
        ArrayList<Person> tal = new ArrayList<Person>();
        final Person pt=new Person();


        rbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,BMI.class);
                startActivity(i);
                           }
        });

        rel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,CalorieActivity.class);
                startActivity(i);
            }
        });
        rel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this,BMR.class);
                startActivity(i);
            }
        });
        rel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this,idealweight.class);
                startActivity(i);
            }
        });

        rel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this,Target_heart_rate.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.homepage,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.Disclamer) {
            Intent i=new Intent(HomeActivity.this,Disclamier.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.Colarie) {
        Intent i=new Intent(HomeActivity.this,Colariecount.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.Info)
        {
Intent i =new Intent(HomeActivity.this,Info.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    }



