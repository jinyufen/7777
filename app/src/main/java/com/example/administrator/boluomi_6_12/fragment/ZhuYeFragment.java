package com.example.administrator.boluomi_6_12.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.boluomi_6_12.Adapter.Adapter;
import com.example.administrator.boluomi_6_12.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/6/12 0012.
 */

public class ZhuYeFragment extends Fragment {


    @Bind(R.id.mytab)
    TabLayout mytab;
    ArrayList<Fragment> fragments;
    A a;
    B b;
    C c;
    D d;
    @Bind(R.id.pags)
    ViewPager pags;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.zhuye_fragment, null);

        ButterKnife.bind(getActivity(), view);
        fragments = new ArrayList<>();
        a = new A();
        b = new B();
        c = new C();
        d = new D();
        fragments.add(a);
        fragments.add(b);
        fragments.add(c);
        fragments.add(d);
        Adapter adapter = new Adapter(getChildFragmentManager(), fragments);
        pags.setAdapter(adapter);
        mytab.setupWithViewPager(pags);
        mytab.setTabMode(TabLayout.MODE_FIXED);

        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
