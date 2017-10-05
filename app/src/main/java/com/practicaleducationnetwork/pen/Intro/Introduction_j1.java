package com.practicaleducationnetwork.pen.Intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.practicaleducationnetwork.pen.R;
import com.practicaleducationnetwork.pen.Tab_JHS1.cartesianDiver;
import com.practicaleducationnetwork.pen.Tab_JHS1.constructionOfEuraka;
import com.practicaleducationnetwork.pen.Tab_JHS1.dataOnweighing;
import com.practicaleducationnetwork.pen.Tab_JHS1.densitytower;
import com.practicaleducationnetwork.pen.Tab_JHS1.eggFloat;
import com.practicaleducationnetwork.pen.Tab_JHS1.sinkersAndFloaters;

import java.util.ArrayList;
import java.util.Arrays;

public class Introduction_j1 extends AppCompatActivity {
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_j1);

        ListView lv = (ListView) findViewById(R.id.etIntroduction);
        ArrayList<String> intro_j1=new ArrayList<>();
        intro_j1.addAll(Arrays.asList(getResources().getStringArray(R.array.introduction_jhs1)));
        adapter=new ArrayAdapter<String>(Introduction_j1.this,android.R.layout.simple_list_item_1,intro_j1);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){

                    case 0:
                        Intent w = new Intent(getApplicationContext(),dataOnweighing.class);
                        startActivity(w);
                        break;
                    case 1:
                        Intent d = new Intent(getApplicationContext(),densitytower.class);
                        startActivity(d);
                        break;
                    case 2:
                        Intent e = new Intent(getApplicationContext(),eggFloat.class);
                        startActivity(e);
                        break;
                    case 3:
                        Intent sink = new Intent(getApplicationContext(),sinkersAndFloaters.class);
                        startActivity(sink);
                        break;
                    case 4:
                        Intent cart = new Intent(getApplicationContext(),cartesianDiver.class);
                        startActivity(cart);
                        break;
                    case 5:
                    Intent con = new Intent(getApplicationContext(),constructionOfEuraka.class);
                    startActivity(con);
                    break;

                }
            }
        });
    }
}