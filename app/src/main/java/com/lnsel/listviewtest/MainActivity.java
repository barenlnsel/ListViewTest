package com.lnsel.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    //GridView gridview;
    // Array of strings...


    public static int [] prgmImages={R.drawable.ic_launcher_background,
            R.drawable.ic_add_a_photo_black_24dp,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background};

    public static String [] prgmNameList={"Let Us C",
            "c++",
            "JAVA",
            "Jsp",
            "Microsoft .Net",
            "Android",
            "PHP",
            "Jquery",
            "JavaScript"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.lv);
        //gridview=(GridView)findViewById(R.id.gridview);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "postion "+i, Toast.LENGTH_LONG).show();
            }
        });

        //ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item, mobileArray);

        CustomAdapter adapter=new CustomAdapter(MainActivity.this,prgmNameList,prgmImages);
        lv.setAdapter(adapter);


        ArrayList<Data> list=new ArrayList<>();
        for(int i=0;i>10;i++) {
            Data data = new Data();
            data.setName("A");
            data.setRoll("101");
            data.setImage("link");
            list.add(data);
        }


        String name=list.get(2).getName();
        String roll=list.get(2).getRoll();
        String image=list.get(2).getImage();
    }
}
