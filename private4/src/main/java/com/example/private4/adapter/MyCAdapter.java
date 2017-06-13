package com.example.private4.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by w1565 on 2017/6/12.
 */


public class MyCAdapter extends FragmentPagerAdapter {
    private String[] str={"HOT热门","BOOKS书城","VIDEO视频","BARRIER结界"};
    private ArrayList<Fragment> list;
    public MyCAdapter(FragmentManager fm,ArrayList<Fragment> list) {
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return str[position];
    }
}
