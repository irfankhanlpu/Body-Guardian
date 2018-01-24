package com.example.tarunmittal.body_guardian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Colariecount extends AppCompatActivity {
    ListView clv1,clv2,clv3,clv4,clv5,lv6;
    LinearLayout ll2,ll3,ll4,ll5,ll6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colariecount);
        ll2= (LinearLayout) findViewById(R.id.l2);

        ll3= (LinearLayout) findViewById(R.id.l3);
        ll4= (LinearLayout) findViewById(R.id.l4);
        ll5= (LinearLayout) findViewById(R.id.l5);

        ll6= (LinearLayout) findViewById(R.id.l6);
        clv1 = (ListView) findViewById(R.id.lv1);
        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Colariecount.this,dfruits.class);
                startActivity(intent);
            }
        });
        ll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2=new Intent(Colariecount.this,Fruits.class);
                startActivity(intent2);
            }
        });
        ll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3=new Intent(Colariecount.this,vegetable.class);
                startActivity(intent3);
            }
        });
        ll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(Colariecount.this,Beverages.class);
                startActivity(intent4);
            }
        });
        ll6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent5=new Intent(Colariecount.this,fastfoods.class);
                startActivity(intent5);
            }
        });
        ArrayList<Person> tal = new ArrayList<Person>();
        Person pt=new Person();
        pt.setName("Dried Fruits");
        pt.setImage(R.drawable.dfruits);
        pt.setDescription(null);

        //p.setDescription("It's a person's weight in kilograms divided by the square of height in meters.");
        //p.setImage(R.drawable.bmi1);
        tal.add(pt);
        MyAdapter tmd = new MyAdapter(tal,this);
        clv1.setAdapter(tmd);
        clv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(Colariecount.this,dfruits.class);
                startActivity(intent);
            }
        });

        clv2 = (ListView) findViewById(R.id.lv2);
        ArrayList<Person> tal2 = new ArrayList<Person>();
        Person pt2=new Person();
        pt2.setName("Fruits");
        pt2.setImage(R.drawable.fruits);
        pt2.setDescription(null);
        //p.setDescription("It's a person's weight in kilograms divided by the square of height in meters.");
        //p.setImage(R.drawable.bmi1);
        tal2.add(pt2);
        MyAdapter tmd2 = new MyAdapter(tal2,this);
        clv2.setAdapter(tmd2);
        clv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent2=new Intent(Colariecount.this,Fruits.class);
                startActivity(intent2);
            }
        });
        clv3 = (ListView) findViewById(R.id.lv3);
        ArrayList<Person> tal3 = new ArrayList<Person>();
        Person pt3=new Person();
        pt3.setName("Vegetables");
        pt3.setImage(R.drawable.vegetables);
        pt3.setDescription(null);
        //p.setDescription("It's a person's weight in kilograms divided by the square of height in meters.");
        //p.setImage(R.drawable.bmi1);
        tal3.add(pt3);
        MyAdapter tmd3 = new MyAdapter(tal3,this);
        clv3.setAdapter(tmd3);
        clv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent3=new Intent(Colariecount.this,vegetable.class);
                startActivity(intent3);
            }
        });
        clv4 = (ListView) findViewById(R.id.lv4);
        ArrayList<Person> tal4 = new ArrayList<Person>();
        Person pt4=new Person();
        pt4.setName("Beverages");
        pt4.setImage(R.drawable.bev);
        pt4.setDescription(null);
        //p.setDescription("It's a person's weight in kilograms divided by the square of height in meters.");
        //p.setImage(R.drawable.bmi1);
        tal4.add(pt4);
        MyAdapter tmd4 = new MyAdapter(tal4,this);
        clv4.setAdapter(tmd4);
        clv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent4=new Intent(Colariecount.this,Beverages.class);
                startActivity(intent4);
            }
        });

        clv5 = (ListView) findViewById(R.id.lv5);
        ArrayList<Person> tal5 = new ArrayList<Person>();
        Person pt5=new Person();
        pt5.setName("Fast Foods");
        pt5.setImage(R.drawable.fastfood);
        pt5.setDescription(null);
        //p.setDescription("It's a person's weight in kilograms divided by the square of height in meters.");
        //p.setImage(R.drawable.bmi1);
        tal5.add(pt5);
        MyAdapter tmd5 = new MyAdapter(tal5,this);
        clv5.setAdapter(tmd5);
        clv5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent5=new Intent(Colariecount.this,fastfoods.class);
                startActivity(intent5);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.caloriecount,menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.bck)
        {
           Intent i=new Intent(Colariecount.this,HomeActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
