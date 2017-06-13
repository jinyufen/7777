package com.example.private4.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.private4.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/13 0013.
 */

public class PaAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments;
    int[] ss  = new int[]{R.drawable.dianzan,R.drawable.xin,R.drawable.ren};
    String[] aa = new String[]{"2963","21","301"};
    public PaAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return ss[position]+""+aa[position];
    }
}
