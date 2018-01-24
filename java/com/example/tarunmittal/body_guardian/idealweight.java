package com.example.tarunmittal.body_guardian;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class idealweight extends AppCompatActivity {

    Spinner sp;
    String spin1;
    Button btn;

    RadioGroup rg, rg1, rg2;
    RadioButton rbkg,rblbs, rbcm,rbinches,rbmale,rbfemale;
    float ideal, height, weight;
    EditText heighttxt,agetext,weighttxt;
    float age;
    float height1;
    ArrayAdapter<String> adapter;

    String[] st = {"D.R._Miller","B.J._Devine","Lemmens"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idealweight);

        sp = (Spinner) findViewById(R.id.spiner);

        adapter = new ArrayAdapter<String>(idealweight.this, android.R.layout.simple_list_item_1, st);
        sp.setAdapter(adapter);
        btn = (Button) findViewById(R.id.idealweight);
        rg = (RadioGroup) findViewById(R.id.rg);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rbcm = (RadioButton) findViewById(R.id.rbcenti);
        rbinches = (RadioButton) findViewById(R.id.rbinches);
        rbmale = (RadioButton) findViewById(R.id.rbmale);
        rbfemale = (RadioButton) findViewById(R.id.rbfemale);
        heighttxt=(EditText) findViewById(R.id.heighttxt);
        agetext= (EditText) findViewById(R.id.agetxt);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(group == rg)
                {
                    if(checkedId == R.id.rbcenti)
                    {


                        String centi  = heighttxt.getText().toString();
                        if(centi.equals(""))
                        {
                            heighttxt.requestFocus();
                            heighttxt.setError("Input field Required");

                        }
                        else {
                            height = Float.parseFloat(centi);
                            height1 = (float) (height * .01);

                            Toast.makeText(idealweight.this, "" + height1, Toast.LENGTH_SHORT).show();

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
                        else{
                        height= Float.parseFloat(inch);

                        height1 = (float) (height * 0.0254);

                        Toast.makeText(idealweight.this, ""+height1, Toast.LENGTH_SHORT).show();

                    }}
                }
            }
        });
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(group == rg1)
                {
                    if(checkedId == R.id.rbmale)
                    {


                        String ag = agetext.getText().toString();
                        if(ag.equals(""))
                        {
                            agetext.requestFocus();
                            agetext.setError("Input field Required");

                        }

                        age  = Float.parseFloat(ag);
                        Toast.makeText(idealweight.this, "Male is selected" , Toast.LENGTH_SHORT).show();

                    }
                    else if(checkedId==R.id.rbfemale)
                    {

                        String ag = agetext.getText().toString();
                        if(ag.equals(""))
                        {
                            agetext.requestFocus();
                            agetext.setError("Input field Required");

                        }
                        age = Float.parseFloat(ag);
                        Toast.makeText(idealweight.this, "Female is selected", Toast.LENGTH_SHORT).show();




                    }
                }
            }
        });

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                btn.setText(st[position]);
                spin1 = btn.getText().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {

                 String str2=heighttxt.getText().toString();
                 String str3=agetext.getText().toString();
                 if ((heighttxt.getText().toString().equals("")))
                 {
                     heighttxt.requestFocus();
                     heighttxt.setError("Enter the height");
                 }
                 else if (agetext.getText().toString().equals(""))
                 {
                     agetext.requestFocus();
                     agetext.setError("Enter the age");
                 }
                 else if (height>=200)
                 {
                     heighttxt.requestFocus();
                     heighttxt.setError("Enter value less than 200");
                 }
                else
                 {if (spin1.equals("D.R._Miller")) {
                             //formula
                             //  BMR = (float) (655 + (4.35*weight) + (4.7*height1) - (4.7 * age));

                             ideal = (float) (3.41 * height);
                             Toast.makeText(idealweight.this, "" + ideal, Toast.LENGTH_SHORT).show();

                         } else if (spin1.equals("B.J._Devine")) {
                             //formula
                             ideal = (float) (3.2 * height);
                             Toast.makeText(idealweight.this, "" + ideal, Toast.LENGTH_SHORT).show();
                         } else if (spin1.equals("Lemmens")) {
                             //formula
                             ideal = (float) (22 * height * height) / (100 * 100);
                             Toast.makeText(idealweight.this, "" + ideal, Toast.LENGTH_SHORT).show();
                         }

                         //Alert Dialog
                         AlertDialog.Builder alert = new AlertDialog.Builder(idealweight.this);
                         alert.setTitle("Ideal weight Calcuated");
                         alert.setMessage("" + "ideal weight is:" + ideal + "\n" + "\n");
                         alert.setPositiveButton("Finish", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 Intent i = new Intent(idealweight.this, HomeActivity.class);
                                 startActivity(i);
                             }
                         });

                         alert.setNegativeButton("Recalculate", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 Intent i = new Intent(idealweight.this, idealweight.class);
                                 startActivity(i);
                             }
                         });
                         alert.show();


                 }}
        });
    }

}




