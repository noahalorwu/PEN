package com.practicaleducationnetwork.pen.UserRegistration;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practicaleducationnetwork.pen.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Sign_in extends Fragment {


    public Sign_in() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false);
    }

}
