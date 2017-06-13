package com.example.administrator.boluomi_6_12;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.administrator.boluomi_6_12.Adapter.MyPagerAdapter;
import com.example.administrator.boluomi_6_12.fragment.BookFragment;
import com.example.administrator.boluomi_6_12.fragment.GouWFragment;
import com.example.administrator.boluomi_6_12.fragment.JieJFragment;
import com.example.administrator.boluomi_6_12.fragment.MyFragment;
import com.example.administrator.boluomi_6_12.fragment.ShiPFragment;
import com.example.administrator.boluomi_6_12.fragment.ZhuYeFragment;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main24Activity extends AppCompatActivity {


    ArrayList<Fragment> fragments;
    ShiPFragment shiPFragment;
    BookFragment bookFragment;
    ZhuYeFragment zhuYeFragment;
    JieJFragment jieJFragment;
    GouWFragment gouWFragment;
    MyFragment myFragment;
    @Bind(R.id.mytab)
    TabLayout mytab;
    @Bind(R.id.mapager)
    ViewPager mapager;
    @Bind(R.id.movie)
    ImageButton movie;
    @Bind(R.id.book)
    ImageButton book;
    @Bind(R.id.zhuy)
    ImageButton zhuy;
    @Bind(R.id.xinxin)
    ImageButton xinxin;
    @Bind(R.id.gouwu)
    ImageButton gouwu;
    @Bind(R.id.wode)
    ImageButton wode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);
        ButterKnife.bind(this);
        fragments = new ArrayList<>();
        shiPFragment = new ShiPFragment();
        bookFragment = new BookFragment();
        zhuYeFragment = new ZhuYeFragment();
        jieJFragment = new JieJFragment();
        gouWFragment = new GouWFragment();
        myFragment = new MyFragment();
        fragments.add(shiPFragment);
        fragments.add(bookFragment);
        fragments.add(zhuYeFragment);
        fragments.add(jieJFragment);
        fragments.add(gouWFragment);
        fragments.add(myFragment);
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), fragments);
        mapager.setAdapter(pagerAdapter);


    }

    @OnClick({R.id.movie, R.id.book, R.id.zhuy, R.id.xinxin, R.id.gouwu, R.id.wode})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.movie:
                mapager.setCurrentItem(0);
                break;
            case R.id.book:
                mapager.setCurrentItem(1);
                break;
            case R.id.zhuy:
                mapager.setCurrentItem(2);
                break;
            case R.id.xinxin:
                mapager.setCurrentItem(3);
                break;
            case R.id.gouwu:
                mapager.setCurrentItem(4);
                break;
            case R.id.wode:
                mapager.setCurrentItem(5);
                break;
        }
    }


}
