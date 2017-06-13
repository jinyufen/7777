package com.example.private4.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.private4.R;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;

/**
 * Created by w1565 on 2017/6/12.
 */

public class MyRollAdapter extends StaticPagerAdapter {
    private int[] imgs = {
            R.drawable.q,
            R.drawable.t,
            R.drawable.y,
    };


    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(container.getContext());
        view.setImageResource(imgs[position]);
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return view;
    }


    @Override
    public int getCount() {
        return imgs.length;
    }

}
