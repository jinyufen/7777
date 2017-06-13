package com.example.private4.fragmnet;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import com.example.private4.Main22Activity;
import com.example.private4.R;
import com.example.private4.adapter.GridAdapter;
import com.example.private4.adapter.RecyAdapter;
import com.example.private4.modle.News;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class BFragment extends Fragment {
    @Bind(R.id.one_gri)
    GridView oneGri;
    @Bind(R.id.two_gri)
    GridView twoGri;
    @Bind(R.id.myrecy)
    RecyclerView myrecy;
    ArrayList<News> list;
    ArrayList<News> list1;
    @Bind(R.id.one_more)
    Button oneMore;

    @Bind(R.id.two_more)
    Button twoMore;

    @Bind(R.id.three_more)
    Button threeMore;

    @Bind(R.id.chuangz)
    Button chuangz;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, null);

        ButterKnife.bind(this, view);
        int img = R.drawable.w;
        int img2 = R.drawable.e;
        int img3 = R.drawable.s;
        String st1 = "我的未婚妻是非人类";
        String st2 = "风中基友传";
        String st3 = "只有花知晓";

        list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            News news3 = new News(img3, st1);
            News news2 = new News(img2, st2);
            News news = new News(img, st3);
            list.add(news);
            list.add(news2);
            list.add(news3);
        }
        Log.e("TAG", "ssssdfghjk,.");
        GridAdapter gridAdapter = new GridAdapter(getActivity(), list);
        oneGri.setAdapter(gridAdapter);
        twoGri.setAdapter(gridAdapter);
        list1 = new ArrayList<>();
        for (int a = 0; a < 6; a++) {
            News news7 = new News(img3, st1);
            News news8 = new News(img2, st2);
            News news9 = new News(img, st3);
            list1.add(news9);
            list1.add(news8);
            list1.add(news7);
        }
        RecyAdapter recyAdapter = new RecyAdapter(getActivity(), list1);
        myrecy.setAdapter(recyAdapter);
        myrecy.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.one_more, R.id.two_more, R.id.three_more,R.id.chuangz})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.one_more:

                break;
            case R.id.two_more:
                Intent intent = new Intent(getActivity(), Main22Activity.class);
                startActivity(intent);
                break;
            case R.id.three_more:
                break;
            case R.id.chuangz:
            Intent intent1 = new Intent(getActivity(), Main22Activity.class);
                startActivity(intent1);
                break;
        }
    }


}
