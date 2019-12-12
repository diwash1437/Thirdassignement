package com.example.thirdassignement.UI.Dashboard;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thirdassignement.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Dashboardfragment extends Fragment {


    public Dashboardfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboardfragment, container, false);
    }

}
