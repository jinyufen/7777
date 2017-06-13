package com.example.administrator.boluomi_6_12.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.boluomi_6_12.Bean.ZhyeBean;
import com.example.administrator.boluomi_6_12.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/12 0012.
 */

public class ZhuYeAdapter extends BaseAdapter {
    Context context;
    ArrayList<ZhyeBean> zhyeList;
    public ZhuYeAdapter(Context context, ArrayList<ZhyeBean> zhyeList) {
        this.context=context;
        this.zhyeList=zhyeList;
    }

    @Override
    public int getCount() {
        return zhyeList.size();
    }

    @Override
    public Object getItem(int position) {
        return zhyeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ZHolder zHolder ;
        if (convertView==null){
            zHolder = new ZHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.zhuye_item,null);
            zHolder.imageView= (ImageView) convertView.findViewById(R.id.zhy_ima);
            zHolder.title = (TextView) convertView.findViewById(R.id.zhyy_text);
            zHolder.content = (TextView) convertView.findViewById(R.id.zhuye_contet);
            convertView.setTag(zHolder);
        }else {
            zHolder = (ZHolder) convertView.getTag();
        }
        zHolder.imageView.setImageResource(zhyeList.get(position).getIma());
        zHolder.title.setText(zhyeList.get(position).getTitle());
        zHolder.content.setText(zhyeList.get(position).getContent());
        return convertView;
    }
    class ZHolder{
        ImageView imageView;
        TextView title,content;
    }
}
