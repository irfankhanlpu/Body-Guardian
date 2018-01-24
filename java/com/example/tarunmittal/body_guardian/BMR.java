package com.example.tarunmittal.body_guardian;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class BMR extends AppCompatActivity {

    float BMR, height, weight;
    float age;
    float height1;
    RadioGroup rg, rg1, rg2,rg4;
    EditText agetext;
    RadioButton rbkg, rblbs, rbcm, rbinches, rbmale, rbfemale;
    RadioButton t1,t2,t3,t4,t5;
    Button calbmi;
    EditText heighttxt, weighttxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr);
        rg = (RadioGroup) findViewById(R.id.rg);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        heighttxt = (EditText) findViewById(R.id.heighttxt);
        weighttxt = (EditText) findViewById(R.id.weighttxt);
        rbkg = (RadioButton) findViewById(R.id.rbkgs);
        rblbs = (RadioButton) findViewById(R.id.rblbs);
        rbcm = (RadioButton) findViewById(R.id.rbcenti);
        rbinches = (RadioButton) findViewById(R.id.rbinches);
        rbmale = (RadioButton) findViewById(R.id.rbmale);
        rbfemale = (RadioButton) findViewById(R.id.rbfemale);
        agetext = (EditText) findViewById(R.id.Agetxt);
        calbmi = (Button) findViewById(R.id.calbmi);
        rg4= (RadioGroup) findViewById(R.id.rg4);
        t1= (RadioButton) findViewById(R.id.t1);
        t2= (RadioButton) findViewById(R.id.t2);
        t3= (RadioButton) findViewById(R.id.t3);
        t4= (RadioButton) findViewById(R.id.t4);
        t5= (RadioButton) findViewById(R.id.t5);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (group == rg) {
                    if (checkedId == R.id.rbcenti) {

                        String centi = heighttxt.getText().toString();
                        if(centi.equals(""))
                        {
                            heighttxt.requestFocus();
                            heighttxt.setError("Input field Required");
                        }
                        else {
                            height = Float.parseFloat(centi);
                            height = (float) (height);
                            Toast.makeText(BMR.this, "" + height, Toast.LENGTH_SHORT).show();

                        }

                    }
                    else
                    {
                        String inch = heighttxt.getText().toString();
                        if(inch.equals(""))
                        {
                            heighttxt.requestFocus();
                            heighttxt.setError("Input field Required");
                        }
                        else {
                            height = Float.parseFloat(inch);
                            height = (float) (height * 0.025 * 100);

                            Toast.makeText(BMR.this, "" + height, Toast.LENGTH_SHORT).show();
                        } }
                }
            }
        });


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (group == rg1) {
                    if (checkedId == R.id.rbkgs) {
                        String kg = weighttxt.getText().toString();
                        if (kg.equals("")) {
                            weighttxt.requestFocus();
                            weighttxt.setError("Input field Required");

                        } else {
                            weight = Float.parseFloat(kg);

                            Toast.makeText(BMR.this, "" + weight, Toast.LENGTH_SHORT).show();
                        }
                    } else

                    {
                        String lb = weighttxt.getText().toString();
                        if (lb.equals("")) {
                            weighttxt.requestFocus();
                            weighttxt.setError("Input field Required");

                        }
                        else {
                            weight = Float.parseFloat(lb);
                            weight = (float) (weight / 2.2);

                            Toast.makeText(BMR.this, "" + weight, Toast.LENGTH_SHORT).show();
                        }
                    }

                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (group == rg2) {
                    if (checkedId == R.id.rbmale) {

                        String ag = agetext.getText().toString();
                        if(ag.equals(""))
                        {
                            Toast.makeText(BMR.this, "Male is selected", Toast.LENGTH_SHORT).show();

                        }
                        else {
                            age = Float.parseFloat(ag);
                            BMR = (float) ((10 * weight) + (6.25 * height) - (5 * age) + 5);
                        }
                    }
                    else
                    {
                        String ag = agetext.getText().toString();
                        if(ag.equals(""))
                        {
                            Toast.makeText(BMR.this, "Female is selected", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            age = Float.parseFloat(ag);
                            BMR = (float) ((10 * weight) + (6.25 * height) - (5 * age) - 161);

                        }
                    }
                        
                }
            }
        });
        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(group==rg4)
                {
                    if(checkedId==R.id.t1)
                    {
                        BMR= (float) (BMR* 1.2);
                    }
                    if(checkedId==R.id.t2)
                    {
                        BMR= (float) (BMR* 1.375);
                    }
                    if(checkedId==R.id.t3)
                    {
                        BMR= (float) (BMR* 1.55);
                    }
                    if(checkedId==R.id.t4)
                    {
                        BMR= (float) (BMR* 1.725);
                    }
                    if(checkedId==R.id.t5)
                    {
                        BMR= (float) (BMR* 1.99);
                    }
                }
            }
        });


        calbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String str2=heighttxt.getText().toString();
                String str3=weighttxt.getText().toString();
                String str4=agetext.getText().toString();

                if (heighttxt.getText().toString().equals("")) {
                    heighttxt.requestFocus();
                    heighttxt.setError("Enter the height");


                }
              else  if (agetext.getText().toString().equals("")) {
                    agetext.requestFocus();
                    agetext.setError("Enter the age");
                }

              else  if (weighttxt.getText().toString().equals("")) {
                    weighttxt.requestFocus();
                    weighttxt.setError("Enter the weight");
                }
                else if (height>=200)
                {
                    heighttxt.requestFocus();
                    heighttxt.setError("Enter value less than 200");
                }
                else if (weight>=200)
                {
                    weighttxt.requestFocus();
                    weighttxt.setError("Enter value less than 200");
                }
                else if(age>80)
                {
                    agetext.requestFocus();
                    agetext.setError("Enter value less than 80");
                }
                else {
                    Toast.makeText(BMR.this, "" + BMR, Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder alert = new AlertDialog.Builder(BMR.this);
                    alert.setTitle("BMR Calculated");
                    alert.setMessage("Calculated BMR is: " + BMR);
                    alert.setPositiveButton("Finish", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(BMR.this, HomeActivity.class);
                            startActivity(i);
                        }
                    });

                    alert.setNegativeButton("Recalculate", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(BMR.this, BMR.class);
                            startActivity(i);
                        }
                    });
                    alert.show();

                }
            }
        });

    }


    }


