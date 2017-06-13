package com.example.private4.adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.private4.R;
import com.example.private4.modle.News;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/12 0012.
 */

public class GridAdapter extends BaseAdapter {
    Context context;
    ArrayList<News> list;

    public GridAdapter(Context context, ArrayList<News> list) {
        this.context=context;
        this.list=list;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GHolder gHolder;
        if (convertView==null){
            gHolder = new GHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.grid_item,null);
            gHolder.image = (ImageView) convertView.findViewById(R.id.grid_ima);
            gHolder.text = (TextView) convertView.findViewById(R.id.grid_text);
            convertView.setTag(gHolder);
        }else {
            gHolder = (GHolder) convertView.getTag();
        }
        gHolder.text.setText(list.get(position).getText());
        gHolder.image.setImageResource(list.get(position).getImg());
        return convertView;
    }
    class GHolder{
        ImageView image;
        TextView text;

    }
}
