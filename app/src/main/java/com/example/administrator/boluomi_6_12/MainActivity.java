package com.example.administrator.boluomi_6_12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.imageView)
    ImageView imageView;
    @Bind(R.id.editText2)
    EditText editText2;
    @Bind(R.id.editText)
    EditText editText;
    @Bind(R.id.denglu)
    Button denglu;
    @Bind(R.id.zhuce)
    Button zhuce;
    @Bind(R.id.toolbar)
    TextView toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.denglu, R.id.zhuce})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.denglu:
                if (editText.equals("") && editText == null && editText2.equals("") && editText2 == null) {
                    Toast.makeText(this, "输入内容不能为空", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, Main24Activity.class);
                    startActivity(intent);
                }
                break;
            case R.id.zhuce:
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                break;
        }
    }
}
