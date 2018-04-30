package com.example.ninja.patientexamination;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeatilsFragment extends Fragment {


    public DeatilsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String diseases[]={"Asthma","Liver  Failure","Chronic kidney disease","Diabetes","Hepatitis C","Heart Disease","Fever"};
        String symptoms[]=getResources().getStringArray(R.array.symptoms);
        ArrayList<Disease> arrayList = new ArrayList<>();
        View v = inflater.inflate(R.layout.fragment_deatils, container, false);
        RecyclerView recyclerView = v.findViewById(R.id.recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        for (int i=0;i<diseases.length;i++){
            arrayList.add(new Disease(diseases[i],symptoms[i]));
        }
        RecyclerView.Adapter adapter = new DiseaseRecAdapter(arrayList,getActivity());
        recyclerView.setAdapter(adapter);
        return v;
    }

}
