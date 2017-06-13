package com.example.private4.cfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.private4.R;
import com.example.private4.adapter.GridAdapter;
import com.example.private4.modle.News;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/6/13 0013.
 */

public class DFragment extends Fragment {
    @Bind(R.id.my_gr)
    GridView myGr;
    ArrayList<News> list;
    int[] ima = new int[]{R.drawable.a, R.drawable.s, R.drawable.d, R.drawable.h, R.drawable.g, R.drawable.f, R.drawable.s, R.drawable.d, R.drawable.h};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.agager, null);
        ButterKnife.bind(this, view);
        list = new ArrayList<>();
        for (int i = 0; i < ima.length; i++) {
            News news = new News();
            news.setImg(ima[i]);
            list.add(news);

        }
        Log.e("TAG", "ssssdfghjk,.");
        GridAdapter gridAdapter = new GridAdapter(getActivity(), list);
        myGr.setAdapter(gridAdapter);


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
