package com.practicaleducationnetwork.pen.Sys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.practicaleducationnetwork.pen.R;
import com.practicaleducationnetwork.pen.Tab_JHS1.breathingmodel;
import com.practicaleducationnetwork.pen.Tab_JHS1.lungcapacity;
import com.practicaleducationnetwork.pen.Tab_JHS1.respirationcards;
import com.practicaleducationnetwork.pen.Tab_JHS1.respirationplates;

import java.util.ArrayList;
import java.util.Arrays;

public class systems_j1 extends AppCompatActivity {
    ArrayAdapter <String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systems_j1);
        ListView lv = (ListView) findViewById(R.id.etSystems);
        ArrayList<String> jhs1_sys=new ArrayList<>();
        jhs1_sys.addAll(Arrays.asList(getResources().getStringArray(R.array.systems_jhs1)));
        adapter = new ArrayAdapter<>(systems_j1.this,android.R.layout.simple_list_item_1,jhs1_sys);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent bm = new Intent(getApplicationContext(),breathingmodel.class);
                        startActivity(bm);
                        break;
                    case 1:
                        Intent rc = new Intent(getApplicationContext(),respirationcards.class);
                        startActivity(rc);
                        break;
                    case 2:
                        Intent rp = new Intent(getApplicationContext(),respirationplates.class);
                        startActivity(rp);
                        break;
                    case 3:
                        Intent lc = new Intent(getApplicationContext(),lungcapacity.class);
                        startActivity(lc);
                        break;
                }
            }
        });
    }
}
