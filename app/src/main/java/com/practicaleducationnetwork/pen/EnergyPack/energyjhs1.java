package com.practicaleducationnetwork.pen.EnergyPack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.practicaleducationnetwork.pen.R;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class energyjhs1 extends AppCompatActivity {
ArrayAdapter <String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energyjhs1);
        ListView lv = (ListView) findViewById(R.id.etEnergy);
        ArrayList<String>energy_j1=new ArrayList<>();
        energy_j1.addAll(Arrays.asList(getResources().getStringArray(R.array.energy_jhs1)));
        adapter=new ArrayAdapter<String>(energyjhs1.this,android.R.layout.simple_list_item_1,energy_j1);
        lv.setAdapter(adapter);

    }
}
