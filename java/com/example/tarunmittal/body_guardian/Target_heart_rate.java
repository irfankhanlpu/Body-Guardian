package com.example.tarunmittal.body_guardian;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Target_heart_rate extends AppCompatActivity {

    EditText age,hrtrate;
    RadioButton male,female;
    RadioGroup r2;
    float ag, tras,hrta;
    Button hrtRate;
    String ages,t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_heart_rate);
        age = (EditText) findViewById(R.id.ageTxt);
        hrtrate = (EditText) findViewById(R.id.hrtText);
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);
        hrtRate = (Button) findViewById(R.id.hertButton);
        r2 = (RadioGroup) findViewById(R.id.rg1);


        r2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (group == r2) {
                    if (checkedId == R.id.male) {
                        Toast.makeText(Target_heart_rate.this, "male is selected", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Target_heart_rate.this, "female ", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });



        hrtRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1=age.getText().toString();
                ages=hrtrate.getText().toString();
                if(TextUtils.isEmpty(t1))
                {
                    age.setError("Please enter age;");
                    age.requestFocus();
                    return;
                }
                if(TextUtils.isEmpty(ages))
                {
                    hrtrate.setError("Please enter heart rate;");
                    hrtrate.requestFocus();
                    return;
                }
                else if (ag>=80)
                {
                    age.requestFocus();
                    age.setError("Enter value less than 80");
                }
                else if(hrta>200)
                {

                    hrtrate.requestFocus();
                    hrtrate.setError("Enter value less than 200");
                }
                else {
                    String p = age.getText().toString();
                    ag = Float.parseFloat(p);

                    String q = hrtrate.getText().toString();
                    hrta = Float.parseFloat(q);
                    tras = (float) (207 - (ag * 0.7) + hrta);
                    String a = String.valueOf(tras);
                    String v1 = a(tras);

                    AlertDialog.Builder alert = new AlertDialog.Builder(Target_heart_rate.this);
                    alert.setTitle("Heart rate Calcuated");
                    alert.setMessage("Maximum Heart Rate Calculted" + " \n" + a + " beats/minute" + "\n" + v1);
                    alert.setPositiveButton("Finish", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Target_heart_rate.this, HomeActivity.class);
                            startActivity(i);
                        }
                    });

                    alert.setNegativeButton("Recalculate", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Target_heart_rate.this, Target_heart_rate.class);
                            startActivity(i);
                        }
                    });
                    alert.show();

                }
            }
        });

    }
    private String a(float tras){

        if( tras<100){
            return "Increase it to 200beats";
        }
        else if(tras>100 || tras<200)
        {
            return " Try to increase more";

        }
        else if(tras> 200 || tras<325){
            return "Perfect heart rate";
        }
        else if(tras>325)
        {
            return "reduce it to 200-250 range";
        }
        else {
            return "over";
        } }
}
