package com.example.administrator.boluomi_6_12;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    TextView toolbar;
    @Bind(R.id.imageView)
    ImageView imageView;

    @Bind(R.id.send)
    Button send;
    @Bind(R.id.yzm_ed)
    EditText yzmEd;
    @Bind(R.id.sj_ed)
    EditText sjEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @OnClick(R.id.send)
    public void onViewClicked() {
        if (sjEd.equals("")&&sjEd==null&&yzmEd.equals("")&&yzmEd==null){
            Toast.makeText(this, "输入内容不能为空", Toast.LENGTH_SHORT).show();
        }else {


            Intent intent = new Intent(Main2Activity.this,Main22Activity.class);
            startActivity(intent);
        }
    }
}
