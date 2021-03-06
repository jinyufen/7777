package com.example.administrator.boluomi_6_12.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/12 0012.
 */

public class Adapter extends FragmentPagerAdapter {
    String[] tit = new String[]{"HOT热门","BOOKS书城","VIDEO视频","BARRIER结界"};
    ArrayList<Fragment> fragments;
    public Adapter(FragmentManager fm, ArrayList<Fragment> fragments) {
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
        return tit[position];
    }
}
