package com.example.ninja.patientexamination;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ninja on 11/03/2018.
 */

public class pagerAdapter extends FragmentPagerAdapter {
    Fragment fragment[]={new DeatilsFragment(),new ExaminFragment()};
    String title[]={"Diseases","Examination"};
    public pagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public Fragment getItem(int position) {
        return fragment[position];
    }

    @Override
    public int getCount() {
        return fragment.length;
    }
}
