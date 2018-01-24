package com.example.tarunmittal.body_guardian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class vegetable extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);
        listView=(ListView)findViewById(R.id.dflv);
        ArrayList<Person> df1=new ArrayList<Person>();

        Person dfp1=new Person();
        dfp1.setName("Alfalfa sprouts, 1 C, raw  81");
        dfp1.setImage(R.drawable.alfalfa);
        df1.add(dfp1);

        Person dfp2=new Person();
        dfp2.setName("Artichoke, 1 medium, boiled   633");
        dfp2.setImage(R.drawable.artichoke);
        df1.add(dfp2);

        Person dfp3=new Person();
        dfp3.setName("Asparagus, 6 spears, boiled    629");
        dfp3.setImage(R.drawable.asparagus);
        df1.add(dfp3);

        Person dfp4=new Person();
        dfp4.setName("Beets, ½ C, boiled   380");
        dfp4.setImage(R.drawable.beets);
        df1.add(dfp4);

        Person dfp5=new Person();
        dfp5.setName("Broccoli, ½ C, raw  238");
        dfp5.setImage(R.drawable.broccoli);
        df1.add(dfp5);

        Person dfp6=new Person();
        dfp6.setName("Brussels sprouts, ½ C, boiled 284");
        dfp6.setImage(R.drawable.brussels);
        df1.add(dfp6);

        Person dfp7=new Person();
        dfp7.setName("Green cabbage, ½ C, raw 390");
        dfp7.setImage(R.drawable.cabbage);
        df1.add(dfp7);

        Person dfp8=new Person();
        dfp8.setName("Carrot, 1 medium, raw  110");
        dfp8.setImage(R.drawable.carrots);
        df1.add(dfp8);

        Person dfp9=new Person();
        dfp9.setName("Cauliflower, ½ C, raw 267");
        dfp9.setImage(R.drawable.cauliflower);
        df1.add(dfp9);

        Person dfp10=new Person();
        dfp10.setName("Celery, 1 stalk, raw  290");
        dfp10.setImage(R.drawable.celery);
        df1.add(dfp10);

        Person dfp11=new Person();
        dfp11.setName("Corn, ½ C, boiled   640");
        dfp11.setImage(R.drawable.corn);
        df1.add(dfp11);

        Person dfp12=new Person();
        dfp12.setName("Cucumber, ½ C, raw slices  572");
        dfp12.setImage(R.drawable.cucumber);
        df1.add(dfp12);

        Person dfp13=new Person();
        dfp13.setName("Eggplant, ½ C, boiled  560");
        dfp13.setImage(R.drawable.eggplant);
        df1.add(dfp13);

        Person dfp14=new Person();
        dfp14.setName("Green beans, ½ C, boiled  589");
        dfp14.setImage(R.drawable.beans);
        df1.add(dfp14);


        Person dfp15=new Person();
        dfp15.setName("Romaine lettuce, ½ C, shredded   284");
        dfp15.setImage(R.drawable.romaine);
        df1.add(dfp15);


        Person dfp16=new Person();
        dfp16.setName("Mushrooms, ½ C, raw slices 227");
        dfp16.setImage(R.drawable.mushrooms);
        df1.add(dfp16);


        Person dfp17=new Person();
        dfp17.setName("Onions, ½ C, raw chopped 390");
        dfp17.setImage(R.drawable.onion);
        df1.add(dfp17);

        Person dfp18=new Person();
        dfp18.setName("Parsnips, ½ C, boiled slices 267");
        dfp18.setImage(R.drawable.parsnip);
        df1.add(dfp18);


        Person dfp19=new Person();
        dfp19.setName("Peas, ½ C, frozen, boiled");
        dfp19.setImage(R.drawable.peas);
        df1.add(dfp19);

        Person dfp20=new Person();
        dfp20.setName("Potato, 1 medium, baked  290");
        dfp20.setImage(R.drawable.potato);
        df1.add(dfp20);

        Person dfp21=new Person();
        dfp21.setName("Sweet pepper, ½ C, raw chopped");
        dfp21.setImage(R.drawable.pepper);
        df1.add(dfp21);

        Person dfp22=new Person();
        dfp22.setName("Radishes, 10, raw");
        dfp22.setImage(R.drawable.radishes);
        df1.add(dfp22);

        Person dfp23=new Person();
        dfp23.setName("Spinach, ½ C, raw chopped");
        dfp23.setImage(R.drawable.spinach);
        df1.add(dfp23);

        Person dfp24=new Person();
        dfp24.setName("Summer squash, ½ C, raw slices");
        dfp24.setImage(R.drawable.summer);
        df1.add(dfp24);

        Person dfp25=new Person();
        dfp25.setName("Tomato, 1, raw");
        dfp25.setImage(R.drawable.tomatoes);
        df1.add(dfp25);

        MyAdapter dfmdpter1=new MyAdapter(df1,this);
        listView.setAdapter(dfmdpter1);

    }
}
