package com.practicaleducationnetwork.pen.CyclesPack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import com.practicaleducationnetwork.pen.R;
import com.practicaleducationnetwork.pen.Tab_JHS1.conditionforgermination;
import com.practicaleducationnetwork.pen.Tab_JHS1.flowerstructure;
import com.practicaleducationnetwork.pen.Tab_JHS1.seedgermination;

import java.util.ArrayList;
import java.util.Arrays;

public class cycles_j1 extends AppCompatActivity {
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycles_j1);
        ListView lv = (ListView) findViewById(R.id.etCycles);
        ArrayList<String> jhs1_cycles=new ArrayList<>();
        jhs1_cycles.addAll(Arrays.asList(getResources().getStringArray(R.array.cycles_jhs1)));
        adapter=new ArrayAdapter<>(cycles_j1.this,android.R.layout.simple_list_item_1,jhs1_cycles);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent fs = new Intent(getApplicationContext(), flowerstructure.class);
                        startActivity(fs);
                        break;
                    case 1:
                        Intent sd = new Intent(getApplicationContext(), seedgermination.class);
                        startActivity(sd);
                        break;
                    case 2:
                        Intent cd = new Intent(getApplicationContext(), conditionforgermination.class);
                        startActivity(cd);
                        break;
                }
            }
        });
    }
}
