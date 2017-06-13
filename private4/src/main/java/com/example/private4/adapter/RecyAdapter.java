package com.example.private4.adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.private4.R;
import com.example.private4.modle.News;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/12 0012.
 */

public class RecyAdapter extends RecyclerView.Adapter {
    Context context;
    ArrayList<News> list;
    public RecyAdapter(Context context, ArrayList<News> list) {
        this.context=context;
        this.list=list;
    }
class RHolder extends RecyclerView.ViewHolder {
    TextView retext;
    ImageView reima;
    public RHolder(View itemView) {
        super(itemView);
        retext= (TextView) itemView.findViewById(R.id.re_text);
        reima = (ImageView) itemView.findViewById(R.id.re_ima);

    }
}

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recy_item,null);

        return new RHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RHolder holder1 = (RHolder) holder;
        holder1.reima.setImageResource(list.get(position).getImg());
        holder1.retext.setText(list.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
