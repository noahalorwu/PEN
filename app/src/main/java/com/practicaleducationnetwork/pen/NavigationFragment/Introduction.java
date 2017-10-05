package com.practicaleducationnetwork.pen.NavigationFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.practicaleducationnetwork.pen.Intro.Introduction_j1;
import com.practicaleducationnetwork.pen.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Introduction extends Fragment {
    View view;
    CardView card1;
    private TextView intro_jhs1;

    public Introduction() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_introduction, container, false);
        introjhs1();
        return view;
    }

    private void introjhs1() {
        card1 = (CardView) view.findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Introduction_j1.class);
                startActivity(i);
            }
        });

    }

}
