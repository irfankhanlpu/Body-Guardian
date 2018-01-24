package com.example.tarunmittal.body_guardian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Fruits extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        listView=(ListView)findViewById(R.id.dflv);
        ArrayList<Person> df1=new ArrayList<Person>();

        Person dfp1=new Person();
        dfp1.setName("Apple,1 raw apple with skin  81");
        dfp1.setImage(R.drawable.apple);
        df1.add(dfp1);

        Person dfp2=new Person();
        dfp2.setName("Apricots, 3 medium   633");
        dfp2.setImage(R.drawable.apricot);
        df1.add(dfp2);

        Person dfp3=new Person();
        dfp3.setName("Avocado, 5oz or 145g    629");
        dfp3.setImage(R.drawable.avocado);
        df1.add(dfp3);

        Person dfp4=new Person();
        dfp4.setName("Banana, 1 medium   380");
        dfp4.setImage(R.drawable.banana);
        df1.add(dfp4);

        Person dfp5=new Person();
        dfp5.setName("Blackberries, ½ cup  238");
        dfp5.setImage(R.drawable.blackberries);
        df1.add(dfp5);

        Person dfp6=new Person();
        dfp6.setName("Blueberries, ½ C 284");
        dfp6.setImage(R.drawable.blueberries);
        df1.add(dfp6);

        Person dfp7=new Person();
        dfp7.setName("Sweet cherries, 10 390");
        dfp7.setImage(R.drawable.cherries);
        df1.add(dfp7);

        Person dfp8=new Person();
        dfp8.setName("Dried dates, 10  110");
        dfp8.setImage(R.drawable.ddates);
        df1.add(dfp8);

        Person dfp9=new Person();
        dfp9.setName("Dried figs, 10 267");
        dfp9.setImage(R.drawable.dfigs);
        df1.add(dfp9);

        Person dfp10=new Person();
        dfp10.setName("Grapefruit, pink/red, ½ medium 290");
        dfp10.setImage(R.drawable.grapefruit);
        df1.add(dfp10);

        Person dfp11=new Person();
        dfp11.setName("Grapes, 1 C   640");
        dfp11.setImage(R.drawable.grapes);
        df1.add(dfp11);

        Person dfp12=new Person();
        dfp12.setName("Guava, 1 medium  572");
        dfp12.setImage(R.drawable.guava);
        df1.add(dfp12);

        Person dfp13=new Person();
        dfp13.setName("Honeydew, 1 C, cubed  560");
        dfp13.setImage(R.drawable.honeydew);
        df1.add(dfp13);

        Person dfp14=new Person();
        dfp14.setName("Kiwi, 1 medium  589");
        dfp14.setImage(R.drawable.kiwi);
        df1.add(dfp14);


        Person dfp15=new Person();
        dfp15.setName("Mango, 1 medium   284");
        dfp15.setImage(R.drawable.mango);
        df1.add(dfp15);


        Person dfp16=new Person();
        dfp16.setName("Nectarine, 1 medium 227");
        dfp16.setImage(R.drawable.nectarine);
        df1.add(dfp16);


        Person dfp17=new Person();
        dfp17.setName("Papaya, 1 medium 390");
        dfp17.setImage(R.drawable.papaya);
        df1.add(dfp17);

        Person dfp18=new Person();
        dfp18.setName("Peach, 1 medium  267");
        dfp18.setImage(R.drawable.peach);
        df1.add(dfp18);


        Person dfp19=new Person();
        dfp19.setName("Pear, 1 medium ");
        dfp19.setImage(R.drawable.pear);
        df1.add(dfp19);

        Person dfp20=new Person();
        dfp20.setName("Plum, 1 medium    290");
        dfp20.setImage(R.drawable.plum);
        df1.add(dfp20);

        Person dfp21=new Person();
        dfp21.setName("Pineapple, 1 C");
        dfp21.setImage(R.drawable.pineapple);
        df1.add(dfp21);

        Person dfp22=new Person();
        dfp22.setName("Dried prunes, 10");
        dfp22.setImage(R.drawable.prunes);
        df1.add(dfp22);

        Person dfp23=new Person();
        dfp23.setName("Seedless raisins, ⅔ C");
        dfp23.setImage(R.drawable.raisin);
        df1.add(dfp23);

        Person dfp24=new Person();
        dfp24.setName("Raspberries, ½ C");
        dfp24.setImage(R.drawable.raspberry);
        df1.add(dfp24);

        Person dfp25=new Person();
        dfp25.setName("Strawberries, 1 C");
        dfp25.setImage(R.drawable.strawberry);
        df1.add(dfp25);

        Person dfp26=new Person();
        dfp26.setName("Tangerine, 1 medium");
        dfp26.setImage(R.drawable.tangerine);
        df1.add(dfp26);

        Person dfp27=new Person();
        dfp27.setName("Watermelon, 1 C, cubed");
        dfp27.setImage(R.drawable.watermelon);
        df1.add(dfp27);

        MyAdapter dfmdpter1=new MyAdapter(df1,this);
        listView.setAdapter(dfmdpter1);
    }
}
