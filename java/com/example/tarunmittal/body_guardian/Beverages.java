package com.example.tarunmittal.body_guardian;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

import java.util.ArrayList;

public class Beverages extends AppCompatActivity {

    ListView listView;
    SearchView s1;
    String[] stateList;

    String[] bevrages={"soda","Diet soda","Bottled sweet tea",
    "Brewed tea, unsweet","Brewed tea, unsweet","Red wine" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);
        listView = (ListView) findViewById(R.id.dflv);

    //    stateList=getResources().getStringArray(R.array.stateList);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,bevrages);
        AutoCompleteTextView act= (AutoCompleteTextView) findViewById(R.id.auto);
        act.setThreshold(1);
        act.setAdapter(adapter);
        act.setTextColor(Color.RED);
        ArrayList<Person> df1 = new ArrayList<Person>();

        Person dfp1 = new Person();
        dfp1.setName("Soda  81");
        dfp1.setImage(R.drawable.soda);
        df1.add(dfp1);

        Person dfp2 = new Person();
        dfp2.setName("Diet soda   633");
        dfp2.setImage(R.drawable.dsoda);
        df1.add(dfp2);

        Person dfp3 = new Person();
        dfp3.setName("Bottled sweet tea    629");
        dfp3.setImage(R.drawable.sweetteabootle);
        df1.add(dfp3);

        Person dfp4 = new Person();
        dfp4.setName("Brewed tea, unsweet   380");
        dfp4.setImage(R.drawable.brewedtea);
        df1.add(dfp4);

        Person dfp5 = new Person();
        dfp5.setName("Orange juice, unsweetened  238");
        dfp5.setImage(R.drawable.orangejuice);
        df1.add(dfp5);

        Person dfp6 = new Person();
        dfp6.setName("Apple juice, unsweetened 284");
        dfp6.setImage(R.drawable.applejuice);
        df1.add(dfp6);

        Person dfp7 = new Person();
        dfp7.setName("Tomato/Vegetable juice 390");
        dfp7.setImage(R.drawable.vegetablejuice);
        df1.add(dfp7);

        Person dfp8 = new Person();
        dfp8.setName("Cranberry juice cocktail  110");
        dfp8.setImage(R.drawable.cran);
        df1.add(dfp8);

        Person dfp9 = new Person();
        dfp9.setName("Whole Milk 267");
        dfp9.setImage(R.drawable.milk);
        df1.add(dfp9);

        Person dfp10 = new Person();
        dfp10.setName("2% low-fat milk  290");
        dfp10.setImage(R.drawable.lowfatmilk);

        df1.add(dfp10);

        Person dfp11 = new Person();
        dfp11.setName("1% low-fat milk   640");
        dfp11.setImage(R.drawable.lowfatmilk);
        df1.add(dfp11);

        Person dfp12 = new Person();
        dfp12.setName("Nonfat milk  572");
        dfp12.setImage(R.drawable.milk);
        df1.add(dfp12);

        Person dfp13 = new Person();
        dfp13.setName("Soy milk  560");
        dfp13.setImage(R.drawable.soymilk);
        df1.add(dfp13);

        Person dfp14 = new Person();
        dfp14.setName("Coffee, black  589");
        dfp14.setImage(R.drawable.blackcoffee);
        df1.add(dfp14);


        Person dfp15 = new Person();
        dfp15.setName("Coffee with cream   284");
        dfp15.setImage(R.drawable.cwc);
        df1.add(dfp15);


        Person dfp16 = new Person();
        dfp16.setName("Coffee with whipped cream 227");
        dfp16.setImage(R.drawable.cwwc);
        df1.add(dfp16);


        Person dfp17 = new Person();
        dfp17.setName("Coffee with heavy whip. cream 390");
        dfp17.setImage(R.drawable.cwhwc);
        df1.add(dfp17);

        Person dfp18 = new Person();
        dfp18.setName("Caffe Latte, whole milk          267");
        dfp18.setImage(R.drawable.caffelatte);
        df1.add(dfp18);


        Person dfp19 = new Person();
        dfp19.setName("Caffe Latte, nonfat(Starbucks)           145");
        dfp19.setImage(R.drawable.caffelatte);
        df1.add(dfp19);

        Person dfp20 = new Person();
        dfp20.setName("Chocolate Shake      135");
        dfp20.setImage(R.drawable.chocolate);
        df1.add(dfp20);

        Person dfp21 = new Person();
        dfp21.setName("Milk Shake           135 ");
        dfp21.setImage(R.drawable.milkshale);
        df1.add(dfp21);

        Person dfp22 = new Person();
        dfp22.setName("Coke             120");
        dfp22.setImage(R.drawable.coek);
        df1.add(dfp22);

        Person dfp23 = new Person();
        dfp23.setName("Pepsi            95");
        dfp23.setImage(R.drawable.pepsi);
        df1.add(dfp23);

        Person dfp24 = new Person();
        dfp24.setName("Maaza            150");
        dfp24.setImage(R.drawable.maaza);
        df1.add(dfp24);

        Person dfp25 = new Person();
        dfp25.setName("Sports drink(like Gatorade)      200");
        dfp25.setImage(R.drawable.gator);
        df1.add(dfp25);

        Person dfp26 = new Person();
        dfp26.setName("Energy drink(like Red Bull)          350" );
        dfp26.setImage(R.drawable.red);
        df1.add(dfp26);

        Person dfp27 = new Person();
        dfp27.setName("Beer             210");
        dfp27.setImage(R.drawable.beer);
        df1.add(dfp27);

        Person dfp28 = new Person();
        dfp28.setName("Red wine         350" );
        dfp28.setImage(R.drawable.redwine);
        df1.add(dfp28);

        Person dfp29 = new Person();
        dfp29.setName("Hard liquor(vodka,rum,whisk.)  200");
        dfp29.setImage(R.drawable.hardliquor);
        df1.add(dfp29);


        MyAdapter dfmdpter1 = new MyAdapter(df1, this);
        listView.setAdapter(dfmdpter1);

    }
}
