package com.example.administrator.boluomi_6_12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main22Activity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    TextView toolbar;
    @Bind(R.id.imageView)
    ImageView imageView;
    @Bind(R.id.pass)
    EditText pass;
    @Bind(R.id.name)
    EditText name;
    @Bind(R.id.surepass)
    EditText surepass;
    @Bind(R.id.denglu)
    Button denglu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.denglu)
    public void onViewClicked() {
        if (pass.equals("")&pass==null&&surepass.equals("")&&surepass==null&&name.equals("")&&name==null){
            Toast.makeText(this, "输入内容不能为空", Toast.LENGTH_SHORT).show();
        }else {


            Intent intent = new Intent(Main22Activity.this,Main23Activity.class);
            startActivity(intent);
        }
    }
}
