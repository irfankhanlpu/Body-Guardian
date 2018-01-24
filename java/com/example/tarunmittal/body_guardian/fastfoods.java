package com.example.tarunmittal.body_guardian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class fastfoods extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);
        listView=(ListView)findViewById(R.id.dflv);
        ArrayList<Person> df1=new ArrayList<Person>();

        Person dfp1=new Person();
        dfp1.setName("Burger(100g)  81");
        dfp1.setImage(R.drawable.burger);
        df1.add(dfp1);

        Person dfp2=new Person();
        dfp2.setName("Cheese Burger(100g)   633");
        dfp2.setImage(R.drawable.cheeseburger);
        df1.add(dfp2);

        Person dfp3=new Person();
        dfp3.setName("Veg Sandwich(100g)    629");
        dfp3.setImage(R.drawable.vegsandwich);
        df1.add(dfp3);

        Person dfp4=new Person();
        dfp4.setName("Cheese Sandwich(100g)   380");
        dfp4.setImage(R.drawable.cheesesand);
        df1.add(dfp4);

        Person dfp5=new Person();
        dfp5.setName("Standard Pizza(per piece)  238");
        dfp5.setImage(R.drawable.pizza);
        df1.add(dfp5);

        Person dfp6=new Person();
        dfp6.setName("Cheese Pizza(per piece) 284");
        dfp6.setImage(R.drawable.cheesepizza);
        df1.add(dfp6);

        Person dfp7=new Person();
        dfp7.setName("Non Veg Pizza(per piece)  390");
        dfp7.setImage(R.drawable.nvpizza);
        df1.add(dfp7);

        Person dfp8=new Person();
        dfp8.setName("Momo(per piece)  110");
        dfp8.setImage(R.drawable.momo);
        df1.add(dfp8);

        Person dfp9=new Person();
        dfp9.setName("Chicken Momo(per piece) 267");
        dfp9.setImage(R.drawable.cmoom);
        df1.add(dfp9);

        Person dfp10=new Person();
        dfp10.setName("White/Brown bread  290");
        dfp10.setImage(R.drawable.bread);
        df1.add(dfp10);

        Person dfp11=new Person();
        dfp11.setName("Ham Burger(100g)   640");
        dfp11.setImage(R.drawable.ham);
        df1.add(dfp11);

        Person dfp12=new Person();
        dfp12.setName("Rolls(per piece)  572");
        dfp12.setImage(R.drawable.rolsl);
        df1.add(dfp12);

        Person dfp13=new Person();
        dfp13.setName("Cheese Rolls(per piece)  560");
        dfp13.setImage(R.drawable.crolld);
        df1.add(dfp13);

        Person dfp14=new Person();
        dfp14.setName("McChicken(143g)  589");
        dfp14.setImage(R.drawable.mcchicken);
        df1.add(dfp14);


        Person dfp15=new Person();
        dfp15.setName("Mc Filet-o-Fish(142g)   284");
        dfp15.setImage(R.drawable.fish);
        df1.add(dfp15);


        Person dfp16=new Person();
        dfp16.setName("Hot Dog 227");
        dfp16.setImage(R.drawable.hotdog);
        df1.add(dfp16);


        Person dfp17=new Person();
        dfp17.setName("Cheese Hot Dog 390");
        dfp17.setImage(R.drawable.cheesehotdog);
        df1.add(dfp17);

        Person dfp18=new Person();
        dfp18.setName("Chicken Hot Dog 267");
        dfp18.setImage(R.drawable.hotdog);
        df1.add(dfp18);


        Person dfp19=new Person();
        dfp19.setName("Kfc’s Drumstick(per piece)           190");
        dfp19.setImage(R.drawable.drum);
        df1.add(dfp19);

        Person dfp20=new Person();
        dfp20.setName("Kfc’s Breast(per piece)          156");
        dfp20.setImage(R.drawable.kb);
        df1.add(dfp20);

        Person dfp21=new Person();
        dfp21.setName("Kfc’s Thigh(per piece)           145"      );
        dfp21.setImage(R.drawable.thigh);
        df1.add(dfp21);

        Person dfp22=new Person();
        dfp22.setName("Kfc’s Wing(per piece)            121");
        dfp22.setImage(R.drawable.wings);
        df1.add(dfp22);

        Person dfp23=new Person();
        dfp23.setName("French Fries(small)              74");
        dfp23.setImage(R.drawable.french);
        df1.add(dfp23);

        Person dfp24=new Person();
        dfp24.setName("French Fries(medium)             65");
        dfp24.setImage(R.drawable.french);
        df1.add(dfp24);

        Person dfp25=new Person();
        dfp25.setName("French Fries(large)          49");
        dfp25.setImage(R.drawable.french);
        df1.add(dfp25);

        Person dfp26=new Person();
        dfp26.setName("Popcorn(80g)             45");
        dfp26.setImage(R.drawable.popcorn);
        df1.add(dfp26);

        Person dfp27=new Person();
        dfp27.setName("McVeggie Burger(114g)            145");
        dfp27.setImage(R.drawable.mcveggie);
        df1.add(dfp27);

        Person dfp28=new Person();
        dfp28.setName("Pizza Hut’s Veg Pizza(per piece)         158");
        dfp28.setImage(R.drawable.pvp);
        df1.add(dfp28);

        Person dfp29=new Person();
        dfp29.setName("Pizza Hut’s Non Veg Pizza(per piece)     204");
        dfp29.setImage(R.drawable.pnvp);
        df1.add(dfp29);


        MyAdapter dfmdpter1=new MyAdapter(df1,this);
        listView.setAdapter(dfmdpter1);
    }

}
