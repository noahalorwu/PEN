package com.practicaleducationnetwork.pen.NavigationFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.practicaleducationnetwork.pen.R;
import com.practicaleducationnetwork.pen.Sys.systems_j1;


/**
 * A simple {@link Fragment} subclass.
 */
public class Systems extends Fragment {
    View  view;
    CardView card1;

    public Systems() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_systems, container, false);
        sys_jhs();
        return  view;
    }

    private void sys_jhs() {
        card1=(CardView)view.findViewById(R.id.card1);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sys = new Intent(getActivity(),systems_j1.class);
                startActivity(sys);
            }
        });
    }

}