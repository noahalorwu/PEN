package com.practicaleducationnetwork.pen.NavigationFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practicaleducationnetwork.pen.CyclesPack.cycles_j1;
import com.practicaleducationnetwork.pen.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Cycles extends Fragment {
    View view;
    CardView card1;

    public Cycles() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_cycles, container, false);
        cycles_jhs1();
        return view;
    }

    private void cycles_jhs1() {
        card1 = (CardView) view.findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cyc = new Intent(getActivity(), cycles_j1.class);
                startActivity(cyc);
            }
        });
    }

}
