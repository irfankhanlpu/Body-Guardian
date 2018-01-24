package com.example.tarunmittal.body_guardian;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
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

public class CalorieActivity extends AppCompatActivity {

    Spinner sp;
    String spin1;
    Button btn;

    RadioGroup rg, rg1, rg2;
    RadioButton rbkg,rblbs, rbcm,rbinches,rbmale,rbfemale;
    float BMR, height, weight;
    EditText heighttxt,agetext,weighttxt;
    float age;
    float height1;
    ArrayAdapter<String> adapter;
    String[] st = {"Basal Metabolic Rate", "Moderate Exercise", "Lightly Active"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);


        sp = (Spinner) findViewById(R.id.spin);

        adapter = new ArrayAdapter<String>(CalorieActivity.this, android.R.layout.simple_list_item_1, st);
        sp.setAdapter(adapter);

        heighttxt = (EditText) findViewById(R.id.heighttxt);
        weighttxt = (EditText) findViewById(R.id.weighttxt);
        agetext = (EditText) findViewById(R.id.agetxt);

        btn = (Button) findViewById(R.id.calbmi);
        rg = (RadioGroup) findViewById(R.id.rg);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        rbkg = (RadioButton) findViewById(R.id.rbkgs);
        rblbs = (RadioButton) findViewById(R.id.rblbs);
        rbcm = (RadioButton) findViewById(R.id.rbcenti);
        rbinches = (RadioButton) findViewById(R.id.rbinches);
        rbmale = (RadioButton) findViewById(R.id.rbmale);
        rbfemale = (RadioButton) findViewById(R.id.rbfemale);



        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
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
                        Toast.makeText(CalorieActivity.this, "" + height, Toast.LENGTH_SHORT).show();
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

                        Toast.makeText(CalorieActivity.this, "" + height, Toast.LENGTH_SHORT).show();
                    }}

            }
        });
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(group == rg1) {
                    if (checkedId == R.id.rbkgs) {

                        String kg = weighttxt.getText().toString();
                        if (kg.equals("")) {
                            weighttxt.requestFocus();
                            weighttxt.setError("Input field Required");

                        } else {

                            weight = Float.parseFloat(kg);
                            Toast.makeText(CalorieActivity.this, "" + weight, Toast.LENGTH_SHORT).show();
                        }
                    } else {

                        String lb = weighttxt.getText().toString();
                        if (lb.equals("")) {
                            weighttxt.requestFocus();
                            weighttxt.setError("Input field Required");

                        } else {
                            weight = Float.parseFloat(lb);
                            weight = (float) (weight / 2.2);

                            Toast.makeText(CalorieActivity.this, "" + weight, Toast.LENGTH_SHORT).show();
                        }
                    }

                }}
        });
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(group == rg2)
                {
                    if(checkedId == R.id.rbmale)
                    {

                   /*     String ag = agetext.getText().toString();
                        age  = Float.parseFloat(ag);
                        Toast.makeText(CalorieCalActivity.this, "Male is selected" , Toast.LENGTH_SHORT).show();
*/
                    }
                    else
                    {
  /*                      String ag = agetext.getText().toString();
                        age = Float.parseFloat(ag);
                        Toast.makeText(CalorieCalActivity.this, "Female is selected", Toast.LENGTH_SHORT).show();
  */                  }
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

                if(spin1 == "Basal Metabolic Rate")
                {
                    //formula
                    //  BMR = (float) (655 + (4.35*weight) + (4.7*height1) - (4.7 * age));

                    BMR=(float) ((13.75*weight)+(5.003*height)-(6.775*age));
                    //       String a=interpretBmi(BMR);
                    Toast.makeText(CalorieActivity.this, ""+BMR, Toast.LENGTH_SHORT).show();
                }
                else if (spin1.equals("Moderate Exercise"))
                {
                    //formula
                    BMR=(float)((12.75*weight)+(5.53*height)-(6.75*age)*1.55);

                    Toast.makeText(CalorieActivity.this, ""+BMR, Toast.LENGTH_SHORT).show();

                }
                else if(spin1.equals("Lightly Active"))
                {
                    //formula
                    BMR=(float) ((12.75*weight)+(6.003*height)-(6.95*age)*1.375);

                    Toast.makeText(CalorieActivity.this, ""+BMR, Toast.LENGTH_SHORT).show();

                }
                else
                {
                    String a=interpretBmi(BMR);
                    //Alert Dialog
                    AlertDialog.Builder alert=new AlertDialog.Builder(CalorieActivity.this);
                    alert.setTitle("Calorie Calcuated");

                    alert.setMessage("No of calories"+BMR+ "\n" + a+"\n" );
                    alert.setPositiveButton("Finish", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(CalorieActivity.this,HomeActivity.class);
                            startActivity(i);
                        }
                    });

                    alert.setNegativeButton("Recalculate", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(CalorieActivity.this,CalorieActivity.class);
                            startActivity(i);
                        }
                    });
                    alert.show();

                }}
            });


    }
    private String interpretBmi(float BMR) {
        if (BMR <200) {
            return "severely underweight";
        }
        else if (BMR > 200 && BMR < 18.5) {
            return "underweight";
        } else if (BMR > 18.5 && BMR < 25) {

            return "normal";
        } else if (BMR > 25 && BMR < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
