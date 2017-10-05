package com.practicaleducationnetwork.pen.NavigationFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.practicaleducationnetwork.pen.Diversity.diversity_j1;
import com.practicaleducationnetwork.pen.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DiversityMatter extends Fragment {
    private TextView etDiv1;
    View view;
    CardView card1;

    public DiversityMatter() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_diversity_matter, container, false);
        diversity();
        return view;
    }

    private void diversity() {
        card1 = (CardView) view.findViewById(R.id.card1);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent etDiv = new Intent(getActivity(), diversity_j1.class);
                startActivity(etDiv);
            }
        });
    }

}
