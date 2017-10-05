package com.practicaleducationnetwork.pen.NavigationFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practicaleducationnetwork.pen.EnergyPack.energyjhs1;
import com.practicaleducationnetwork.pen.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Energy extends Fragment {

    View view;
    CardView card1;

    public Energy() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_energy, container, false);
        init();
        return view;


    }

    private void init() {
        card1 = (CardView) view.findViewById(R.id.card1);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), energyjhs1.class);
                startActivity(intent);

            }
        });

    }

}
