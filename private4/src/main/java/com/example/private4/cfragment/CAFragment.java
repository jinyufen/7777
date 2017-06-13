package com.example.private4.cfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.private4.R;
import com.example.private4.adapter.MyRecycAdapter;
import com.example.private4.adapter.MyRollAdapter;
import com.example.private4.modle.News;
import com.jude.rollviewpager.RollPagerView;

import java.util.ArrayList;


public class CAFragment extends Fragment {
    private RollPagerView rollPagerView;
    private RecyclerView recyclerView;
    private MyRollAdapter adapter;
    private MyRecycAdapter recycAdapter;
    private ArrayList<News> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ca, null);
        rollPagerView = (RollPagerView) view.findViewById(R.id.roll_CA);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyc_CA);
        rollPagerView.setPlayDelay(1000);
        rollPagerView.setAnimationDurtion(500);
        rollPagerView.setAdapter(new MyRollAdapter());

        GridLayoutManager manager=new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        //添加分割线
        recyclerView.addItemDecoration(new DividerItemDecoration(
                getActivity(), DividerItemDecoration.VERTICAL
        ));

        int img =R.drawable.w;
        int img2 =R.drawable.e;
        String st1="我的未婚妻是非人类";
        list=new ArrayList<>();
        for (int i=0;i<10;i++){
            News news2=new News(img2,st1);
            News news=new News(img,st1);
            list.add(news);
            list.add(news2);
        }


        recycAdapter = new MyRecycAdapter(list, getActivity());
        recyclerView.setAdapter(recycAdapter);

        return view;
    }
}
