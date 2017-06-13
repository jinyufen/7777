package com.example.administrator.boluomi_6_12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main23Activity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    TextView toolbar;
    @Bind(R.id.imageView2)
    ImageView imageView2;
    @Bind(R.id.imageView)
    ImageView imageView;
    @Bind(R.id.boy)
    ImageView boy;
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.textView2)
    TextView textView2;
    @Bind(R.id.girl)
    ImageView girl;
    @Bind(R.id.textView3)
    TextView textView3;
    @Bind(R.id.textView4)
    TextView textView4;
    @Bind(R.id.sure)
    Button sure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.sure)
    public void onViewClicked() {
        Intent intent = new Intent(Main23Activity.this,Main24Activity.class);
        startActivity(intent);
    }
}
