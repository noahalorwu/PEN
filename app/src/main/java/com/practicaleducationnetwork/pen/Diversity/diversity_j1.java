package com.practicaleducationnetwork.pen.Diversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.practicaleducationnetwork.pen.R;
import com.practicaleducationnetwork.pen.Tab_JHS1.StudentAsMatter;
import com.practicaleducationnetwork.pen.Tab_JHS1.automaticirrigation;
import com.practicaleducationnetwork.pen.Tab_JHS1.capillaryrise;
import com.practicaleducationnetwork.pen.Tab_JHS1.cellmodels;
import com.practicaleducationnetwork.pen.Tab_JHS1.changesofstate;
import com.practicaleducationnetwork.pen.Tab_JHS1.hazards;
import com.practicaleducationnetwork.pen.Tab_JHS1.measuringcapillaryrise;
import com.practicaleducationnetwork.pen.Tab_JHS1.movingmatches;
import com.practicaleducationnetwork.pen.Tab_JHS1.statesofmatter;

import java.util.ArrayList;
import java.util.Arrays;

public class diversity_j1 extends AppCompatActivity {
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diversity_j1);
        ListView lv = (ListView) findViewById(R.id.etDiversity);
        ArrayList<String> jhs1_div=new ArrayList<>();
        jhs1_div.addAll(Arrays.asList(getResources().getStringArray(R.array.diversity_jh1)));
        adapter=new ArrayAdapter<String>(diversity_j1.this,android.R.layout.simple_list_item_1,jhs1_div);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent w = new Intent(getApplicationContext(), StudentAsMatter.class);
                        startActivity(w);
                        break;
                    case 1:
                        Intent sm = new Intent(getApplicationContext(), statesofmatter.class);
                        startActivity(sm);
                        break;

                    case 2:
                        Intent cs = new Intent(getApplicationContext(), changesofstate.class);
                        startActivity(cs);
                        break;
                    case 3:
                        Intent cm = new Intent(getApplicationContext(), cellmodels.class);
                        startActivity(cm);
                        break;
                    case 4:
                        Intent cr = new Intent(getApplicationContext(), capillaryrise.class);
                        startActivity(cr);
                        break;
                    case 5:
                        Intent mm = new Intent(getApplicationContext(), movingmatches.class);
                        startActivity(mm);
                        break;
                    case 6:
                        Intent mc = new Intent(getApplicationContext(), measuringcapillaryrise.class);
                        startActivity(mc);
                        break;
                    case 7:
                        Intent ai = new Intent(getApplicationContext(), automaticirrigation.class);
                        startActivity(ai);
                        break;
                    case 8:
                        Intent sf = new Intent(getApplicationContext(), hazards.class);
                        startActivity(sf);
                        break;




                }
            }
        });
    }
}
