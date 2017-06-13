package com.example.private4.fragmnet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.private4.R;
import com.example.private4.adapter.PaAdapter;
import com.example.private4.cfragment.*;
import com.example.private4.cfragment.DFragment;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


public class FFragment extends Fragment {
    @Bind(R.id.imageView2)
    ImageView imageView2;
    @Bind(R.id.textView2)
    TextView textView2;
    @Bind(R.id.my_ta)
    TabLayout myTa;
    @Bind(R.id.my_pa)
    ViewPager myPa;
ArrayList<Fragment> fragments;
    DFragment dFragment;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f, null);


        ButterKnife.bind(this, view);
        fragments  =new ArrayList<>();

        for (int i=0;i<3;i++){
            dFragment = new DFragment();
            fragments.add(dFragment);
        }
        PaAdapter paAdapter = new PaAdapter(getFragmentManager(),fragments);
        myPa.setAdapter(paAdapter);
        myTa.setupWithViewPager(myPa);
        myTa.setTabMode(TabLayout.MODE_FIXED);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
