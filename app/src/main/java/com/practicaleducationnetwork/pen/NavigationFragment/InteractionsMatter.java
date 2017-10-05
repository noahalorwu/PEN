package com.practicaleducationnetwork.pen.NavigationFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.practicaleducationnetwork.pen.Interaction.interactions_jhs;
import com.practicaleducationnetwork.pen.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class InteractionsMatter extends Fragment {
    View view;
    private TextView etInteract;
    CardView card1;

    public InteractionsMatter() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_interactions_matter, container, false);
        interact_jhs();
        return  view;
    }

    private void interact_jhs() {
        card1=(CardView)view.findViewById(R.id.card1);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent interact = new Intent(getActivity(),interactions_jhs.class);
                startActivity(interact);
            }
        });
    }

}
