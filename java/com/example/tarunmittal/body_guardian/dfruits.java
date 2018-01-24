package com.example.tarunmittal.body_guardian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class dfruits extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dfruit,menu);
        return  super.onCreateOptionsMenu(menu);
    }

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dfruits);
        listView=(ListView)findViewById(R.id.dflv);
        ArrayList<Person> df1=new ArrayList<Person>();

        Person dfp1=new Person();
        dfp1.setName("Almonds                    572");
        dfp1.setImage(R.drawable.almonds);
        df1.add(dfp1);

        Person dfp2=new Person();
        dfp2.setName("Cashews                     633");
        dfp2.setImage(R.drawable.cashews);
        df1.add(dfp2);

        Person dfp3=new Person();
        dfp3.setName("Cedar Nuts                  629");
        dfp3.setImage(R.drawable.cedar);
        df1.add(dfp3);

        Person dfp4=new Person();
        dfp4.setName("Coco Nuts                   380");
        dfp4.setImage(R.drawable.coco);
        df1.add(dfp4);

        Person dfp5=new Person();
        dfp5.setName("Dried Apples               238");
        dfp5.setImage(R.drawable.dapples);
        df1.add(dfp5);

        Person dfp6=new Person();
        dfp6.setName("Dried Apricots            284");
        dfp6.setImage(R.drawable.dapricots);
        df1.add(dfp6);

        Person dfp7=new Person();
        dfp7.setName("Dried Bananas             390");
        dfp7.setImage(R.drawable.dbnana);
        df1.add(dfp7);

        Person dfp8=new Person();
        dfp8.setName("Dried Briar Fruit         110");
        dfp8.setImage(R.drawable.dbriar);
        df1.add(dfp8);

        Person dfp9=new Person();
        dfp9.setName("Dried Dates               267");
        dfp9.setImage(R.drawable.ddates);
        df1.add(dfp9);

        Person dfp10=new Person();
        dfp10.setName("Dried Figs               290");
        dfp10.setImage(R.drawable.dfigs);
        df1.add(dfp10);

        Person dfp11=new Person();
        dfp11.setName("Hazelnuts                640");
        dfp11.setImage(R.drawable.hazelnut);
        df1.add(dfp11);

        Person dfp12=new Person();
        dfp12.setName("Mustard Pits             572");
        dfp12.setImage(R.drawable.dmustard);
        df1.add(dfp12);

        Person dfp13=new Person();
        dfp13.setName("Peanuts                  560");
        dfp13.setImage(R.drawable.peanuts);
        df1.add(dfp13);

        Person dfp14=new Person();
        dfp14.setName("Pecans                   589");
        dfp14.setImage(R.drawable.pecons);
        df1.add(dfp14);


        Person dfp15=new Person();
        dfp15.setName("Pumpkin Seeds             284");
        dfp15.setImage(R.drawable.pumpkin);
        df1.add(dfp15);


        Person dfp16=new Person();
        dfp16.setName("Raisins                           227");
        dfp16.setImage(R.drawable.raisin);
        df1.add(dfp16);


        Person dfp17=new Person();
        dfp17.setName("Roast Chestnuts           390");
        dfp17.setImage(R.drawable.chestnuts);
        df1.add(dfp17);

        Person dfp18=new Person();
        dfp18.setName("Sesame Seeds           267");
        dfp18.setImage(R.drawable.sesame);
        df1.add(dfp18);


        Person dfp19=new Person();
        dfp19.setName("Sunflower Seeds   200");
        dfp19.setImage(R.drawable.sunflower);
        df1.add(dfp19);

        Person dfp20=new Person();
        dfp20.setName("Walnuts                   290");
        dfp20.setImage(R.drawable.walnuts);
        df1.add(dfp20);


        MyAdapter dfmdpter1=new MyAdapter(df1,this);
        listView.setAdapter(dfmdpter1);
    }
}
