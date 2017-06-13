package com.example.administrator.boluomi_6_12.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.administrator.boluomi_6_12.Adapter.ZhuYeAdapter;
import com.example.administrator.boluomi_6_12.Bean.ZhyeBean;
import com.example.administrator.boluomi_6_12.R;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/6/12 0012.
 */

public class A extends Fragment {
    @Bind(R.id.roll_view_pager)
    RollPagerView rollViewPager;
    @Bind(R.id.zy_grid)
    GridView zyGrid;
    private RollPagerView mRollViewPager;
    GridView gridView;
    int[] ima = new int[]{R.drawable.w, R.drawable.e,R.drawable.a,R.drawable.b};
    ArrayList<ZhyeBean> zhyeList = new ArrayList<>();
    String[] title = new String[]{"我的未婚妻是非人类", "我的未婚妻是非人类","我的未婚妻是非人类", "我的未婚妻是非人类"};
    String[] content = new String[]{"为什么要伤害我的眼睛", "为什么要伤害的眼睛","为什么要伤害我的眼睛", "为什么要伤害的眼睛"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.a, null);
        rollViewPager = (RollPagerView) view.findViewById(R.id.roll_view_pager);
        zyGrid = (GridView) view.findViewById(R.id.zy_grid);
        for (int i = 0; i < title.length; i++) {
            ZhyeBean zhyeBean = new ZhyeBean();
            zhyeBean.setIma(ima[i]);
            zhyeBean.setTitle(title[i]);
            zhyeBean.setContent(content[i]);
            zhyeList.add(zhyeBean);
        }
        ZhuYeAdapter zhuYeAdapter = new ZhuYeAdapter(getActivity(), zhyeList);
        gridView.setAdapter(zhuYeAdapter);
        //设置播放时间间隔

        mRollViewPager.setPlayDelay(1000);

        //设置透明度

        mRollViewPager.setAnimationDurtion(500);

        //设置适配器

        mRollViewPager.setAdapter(new TestNormalAdapter());


        //设置指示器（顺序依次）

        //自定义指示器图片

        //设置圆点指示器颜色

        //设置文字指示器

        //隐藏指示器

        //mRollViewPager.setHintView(new IconHintView(this, R.drawable.point_focus, R.drawable.point_normal));

        mRollViewPager.setHintView(new ColorPointHintView(getActivity(), Color.YELLOW, Color.WHITE));

        //mRollViewPager.setHintView(new TextHintView(this));

        //mRollViewPager.setHintView(null);
        ButterKnife.bind(this, view);
        return view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    private class TestNormalAdapter extends StaticPagerAdapter {

        private int[] imgs = {

                R.drawable.q,

                R.drawable.t,

                R.drawable.r,

                R.drawable.y,

        };


        @Override

        public View getView(ViewGroup container, int position) {

            ImageView view2 = new ImageView(container.getContext());

            view2.setImageResource(imgs[position]);

            view2.setScaleType(ImageView.ScaleType.CENTER_CROP);

            view2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

            return view2;

        }


        @Override

        public int getCount() {

            return imgs.length;

        }

    }
    }
