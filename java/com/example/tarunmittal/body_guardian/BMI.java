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
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class BMI extends AppCompatActivity {
    float BMI, height, weight;
    RadioGroup rg, rg1, rg2;
    RadioButton rbkg,rblbs, rbcm,rbinches,rbmale,rbfemale;
    Button calbmi;
    ImageView im1;
    String str_height;
    EditText heighttxt,weighttxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
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
      //  im1= (ImageView) findViewById(R.id.pic);

        calbmi = (Button) findViewById(R.id.calbmi);
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
                                height = (float) (height / 100);
                                Toast.makeText(BMI.this, "" + height, Toast.LENGTH_SHORT).show();
                            }

                        } else
                            {
                            String inch = heighttxt.getText().toString();
                            if(inch.equals(""))
                            {
                                heighttxt.requestFocus();
                                heighttxt.setError("Input field Required");
                            }
                            else {

                                height = Float.parseFloat(inch);
                                height = (float) (height * 0.0254);

                            Toast.makeText(BMI.this, "" + height, Toast.LENGTH_SHORT).show();
                        }}

                    }

            }
        });

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (group == rg1) {

                    if (checkedId == R.id.rbkgs) {

                        String kg = weighttxt.getText().toString();
                        if(kg.equals(""))
                        {
                            weighttxt.requestFocus();
                            weighttxt.setError("Input field Required");

                        }
                        else {

                            weight = Float.parseFloat(kg);
                            Toast.makeText(BMI.this, "" + weight, Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {

                        String lb = weighttxt.getText().toString();
                        if(lb.equals(""))
                        {
                            weighttxt.requestFocus();
                            weighttxt.setError("Input field Required");

                        }
                        else {
                            weight = Float.parseFloat(lb);
                            weight = (float) (weight / 2.2);

                            Toast.makeText(BMI.this, "" + weight, Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(BMI.this, "" + rbmale.getText().toString(), Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(BMI.this, "" + rbfemale.getText().toString(), Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });


        calbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str2 = heighttxt.getText().toString();
                String str3 = weighttxt.getText().toString();

                if ((heighttxt.getText().toString().equals("")))
                {
                    heighttxt.requestFocus();
                    heighttxt.setError("Enter the height");
                }
                else if (weighttxt.getText().toString().equals(""))
                {
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

               else {

                    BMI = weight / (height * height);

                    String bm11 = interpretBmi(BMI);
                    AlertDialog.Builder alert = new AlertDialog.Builder(BMI.this);
                    alert.setTitle("BMI Calculated");
                    alert.setMessage("" + BMI + "KG/M*M" + "\n" + "\n" + bm11);
                    alert.setPositiveButton("Finish", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(BMI.this, HomeActivity.class);
                            startActivity(i);
                        }
                    });

                    alert.setNegativeButton("Recalculate", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(BMI.this, BMI.class);
                            startActivity(i);
                        }
                    });
                    alert.show();
                //    im1.setVisibility(View.VISIBLE);
                }

            }
        });

    }
    private String interpretBmi(float BMR) {
        if (BMR < 20.7)
        {
            return "underweight";
        }
        else if (BMR > 20.7 && BMR < 26.4)
        {
            return "normal";
        }
        else if(BMR >26.4 && BMR<27.8)
        {return " marginally overweight";
        }
        else if(BMR >27.8 && BMR<31.1)
        {
            return "Overweight";
        }
        else if(BMR >31.1) {
            return "obese";
        }

        else
        {
            return  null;
        }
    }


}

