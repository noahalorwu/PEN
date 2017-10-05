package com.practicaleducationnetwork.pen.Interaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.practicaleducationnetwork.pen.R;
import com.practicaleducationnetwork.pen.Sys.systems_j1;

import java.util.ArrayList;
import java.util.Arrays;

public class interactions_jhs extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactions_jhs);
        ListView lv = (ListView) findViewById(R.id.etInteraction);
        ArrayList<String> jhs1_interact=new ArrayList<>();
        jhs1_interact.addAll(Arrays.asList(getResources().getStringArray(R.array.interactions_jhs1)));
        adapter = new ArrayAdapter<>(interactions_jhs.this,android.R.layout.simple_list_item_1,jhs1_interact);
        lv.setAdapter(adapter);

    }
}
