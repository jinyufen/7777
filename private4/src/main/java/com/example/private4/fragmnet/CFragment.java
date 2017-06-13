package com.example.private4.fragmnet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.private4.R;
import com.example.private4.adapter.MyCAdapter;
import com.example.private4.cfragment.CAFragment;
import com.example.private4.cfragment.CBFragment;
import com.example.private4.cfragment.CCFragment;
import com.example.private4.cfragment.CDFragment;

import java.util.ArrayList;


public class CFragment extends Fragment {
    private ArrayList<Fragment> list;
    private MyCAdapter adapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_c,null);
        viewPager= (ViewPager) view.findViewById(R.id.Cviewpage);
        tabLayout= (TabLayout) view.findViewById(R.id.tabLayout);
        list=new ArrayList<>();
        list.add(new CAFragment());
        list.add(new CBFragment());
        list.add(new CCFragment());
        list.add(new CDFragment());
        adapter=new MyCAdapter(getFragmentManager(),list);
        viewPager.setAdapter(adapter);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setupWithViewPager(viewPager);


        return view;
    }
}
