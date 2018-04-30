package com.example.ninja.patientexamination;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExaminFragment extends Fragment {
    ArrayList<String> arrayList;
    String symtopms[]={"Shortness of breath","Chest tightness or pain", "Trouble sleeping", "coughing",
            "wheezing sound when exhaling", "Yellowing of your skin and eyeballs", "Pain in your upper right abdomen",
            "Abdominal swelling", "Nausea", "Vomiting", "Sleepiness", "Loss of appetite", "Fatigue and weakness",
            "Changes in how much you urinate", "Muscle twitches and cramps", "Swelling of feet and ankles",
            "High blood pressure", "Increased thirst", "Frequent urination", "Extreme hunger", "Unexplained weight loss",
            "Presence of ketones in the urine", "Fatigue", "Irritability", "Blurred vision", "Slow-healing sores",
            "Frequent infections", "Bleeding easily","Bruising easily","Dark-colored urine","Itchy skin",
            "Fluid buildup in your abdomen", "Swelling in your legs","Chest pain, chest tightness, chest pressure and chest discomfort (angina)","Shortness of breath",
            "Pain, numbness, weakness or coldness in your legs or arms if the blood vessels in those parts of your body are narrowed",
            "Pain in the neck, jaw, throat, upper abdomen or back","Sweating","Chills and shivering", "Headache", "Muscle aches", "Loss of appetite", "Irritability", "Dehydration", "General weakness"};
    String Asthma[]={"Shortness of breath","Chest tightness or pain", "Trouble sleeping", "coughing",
            "wheezing sound when exhaling"};
    String Liver_Failure[]={"Yellowing of your skin and eyeballs", "Pain in your upper right abdomen",
            "Abdominal swelling", "Nausea", "Vomiting", "Sleepiness"};
    String Chronic_kidney_disease[]={"Loss of appetite", "Fatigue and weakness",
            "Changes in how much you urinate", "Muscle twitches and cramps", "Swelling of feet and ankles",
            "High blood pressure"};
    String Diabetes[]={"Increased thirst", "Frequent urination", "Extreme hunger", "Unexplained weight loss",
            "Presence of ketones in the urine", "Fatigue", "Irritability", "Blurred vision", "Slow-healing sores",
            "Frequent infections"};
    String Hepatitis_C[]={"Bleeding easily","Bruising easily","Dark-colored urine","Itchy skin",
            "Fluid buildup in your abdomen", "Swelling in your legs"};
    String Heart []= {"Chest pain, chest tightness, chest pressure and chest discomfort (angina)","Shortness of breath",
            "Pain, numbness, weakness or coldness in your legs or arms if the blood vessels in those parts of your body are narrowed",
            "Pain in the neck, jaw, throat, upper abdomen or back"};
    String Fever []= {"Sweating","Chills and shivering", "Headache", "Muscle aches", "Loss of appetite", "Irritability", "Dehydration", "General weakness"};

    public ExaminFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_examin, container, false);
        Button btn = v.findViewById(R.id.button);
        final TextView tv = v.findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList = new ArrayList<>();
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

                builder.setMultiChoiceItems(symtopms, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        if (b){
                            arrayList.add(symtopms[i]);
                        }else{
                            arrayList.remove(symtopms[i]);
                        }
                    }
                });
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (arrayList.size()<3){
                            tv.setText("You Must Select More Than 3 Symptoms");
                        }else {
//                            for (int in =0;in<arrayList.size();i++){
//                                arrayList.get(in);
//                            }

                            int n = 0;
                                for (int j = 0; j < Asthma.length; j++) {
                                    if (arrayList.contains(Asthma[j])) {
                                        ++n;
                                    } else {
                                        System.out.println(Asthma[j] + " is not a valid letter");
                                    }
                            }
                            int m = 0;
                            for (int l = 0; l < Liver_Failure.length; l++) {
                                if (arrayList.contains(Liver_Failure[l])) {
                                    ++m;
                                } else {
                                    System.out.println(Liver_Failure[l] + " is not a valid letter");
                                }
                            }
                            int r = 0;
                            for (int l = 0; l < Chronic_kidney_disease.length; l++) {
                                if (arrayList.contains(Chronic_kidney_disease[l])) {
                                    ++r;
                                } else {
                                    System.out.println(Chronic_kidney_disease[l] + " is not a valid letter");
                                }
                            }
                            int s = 0;
                            for (int l = 0; l < Diabetes.length; l++) {
                                if (arrayList.contains(Diabetes[l])) {
                                    ++s;
                                } else {
                                    System.out.println(Diabetes[l] + " is not a valid letter");
                                }
                            }
                            int t = 0;
                            for (int l = 0; l < Hepatitis_C.length; l++) {
                                if (arrayList.contains(Hepatitis_C[l])) {
                                    ++t;
                                } else {
                                    System.out.println(Hepatitis_C[l] + " is not a valid letter");
                                }
                            }
                            int u = 0;
                            for (int l = 0; l < Heart.length; l++) {
                                if (arrayList.contains(Heart[l])) {
                                    ++u;
                                } else {
                                    System.out.println(Heart[l] + " is not a valid letter");
                                }
                            }
                            int v = 0;
                            for (int l = 0; l < Fever.length; l++) {
                                if (arrayList.contains(Fever[l])) {
                                    ++v;
                                } else {
                                    System.out.println(Fever[l] + " is not a valid letter");
                                }
                            }
                            System.out.println(n+" is valid asthma");
                            System.out.println(m+" is valid Liver_Failure");
                            System.out.println(r+" is valid Chronic_kidney_disease");
                            System.out.println(s+" is valid Diabetes");
                            System.out.println(t+" is valid Hepatitis_C");
                            System.out.println(u+" is valid Heart");
                            System.out.println(v+" is valid Fever");
//                            if (m > n){
//                                tv.setText("You Might Be infected With Live Failure");
//                            }else if(n>m){
//                                tv.setText("You Might Be infected With Asthma");
//
//                            }
//                            else{
//                                tv.setText("You Might Be infected With Live Failure Or Asthma");
//                            }
                            char numChars[]={'n','m','r','s','t','u','v'};
                            int numbers[]={n,m,r,s,t,u,v};
                            int highestnum = numbers[0];
                            char highestchar = numChars[0];
                            for (int index = 1; index < numbers.length; index ++) {
                                if (numbers[index] > highestnum) {
                                    highestnum = numbers[index];
                                    highestchar = numChars[index];
                                }
                            }
                            System.out.println(highestnum);
                            System.out.println(highestchar);
                            String str ="";
                            switch (highestchar){
                                case 'n':str="Asthma";break;
                                case 'm':str="Liver Failure";break;
                                case 'r':str="Chronic kidney Disease";break;
                                case 's':str="Diabetes";break;
                                case 't':str="Hepatitis C";break;
                                case 'u':str="Heart";break;
                                case 'v':str="Fever";break;
                            }

                            tv.setText("Your Disease Might be "+str+" Disease");
//                            char[] checking = {'A','B','C','D'};
//                            char[] valids = {'A','B','C'};
//                            int n = 0;
//                            for (int in = 0; in < checking.length; in++) {
//                                for (int j = 0; j < valids.length; j++) {
//                                    if (checking[in] == valids[j]) {
//                                        ++n;
//                                    } else {
//                                            System.out.println(checking[in] + " is not a valid letter");
//                                        }
//                                    }
//
//
//                            }
//                            System.out.println(n);
                        }
                    }
                });
                builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.setTitle("Select Your Symptoms");
                builder.create().show();
            }
        });
        return v;
    }
}
