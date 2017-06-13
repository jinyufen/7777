package com.example.private4.adapter;

import android.content.Context;
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
 * Created by w1565 on 2017/6/12.
 */

public class MyRecycAdapter extends RecyclerView.Adapter<MyRecycAdapter.MyViewHolder> {
    private OnItemClickLinear onItemClickLinear;

        public void setOnItemClickLinear(OnItemClickLinear onItemClickLinear) {
            this.onItemClickLinear = onItemClickLinear;
        }

        public interface OnItemClickLinear{
            public void onItemvlick(int position);
        }


        private ArrayList<News> list;
        private Context context;

        public MyRecycAdapter(ArrayList<News> list, Context context) {
        this.list = list;
        this.context = context;
    }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(context).inflate(R.layout.item1,null);
            RecyclerView.LayoutParams params=new RecyclerView.LayoutParams(
                    RecyclerView.LayoutParams.MATCH_PARENT,
                    RecyclerView.LayoutParams.WRAP_CONTENT
            );
            MyViewHolder myViewHolder=new MyViewHolder(view);

            return myViewHolder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, final int position) {
            holder.imageView.setImageResource(list.get(position).getImg());
            holder.textView.setText(list.get(position).getText());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickLinear!=null){
                        onItemClickLinear.onItemvlick(position);
                    }
                }
            });

        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            TextView textView;
            public MyViewHolder(View itemView) {
                super(itemView);
                imageView= (ImageView) itemView.findViewById(R.id.item_img);
                textView= (TextView) itemView.findViewById(R.id.item_text);
            }
        }

}
