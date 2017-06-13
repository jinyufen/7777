package com.example.private4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout lin;
    private Toolbar toolbar;
    private ImageView circleImageView, circleImageView2, circleImageView3, wenhao;
    private EditText ed1, ed2, ed3;
    private Button but1, but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        lin = (LinearLayout) findViewById(R.id.lin);
        toolbar = (Toolbar) findViewById(R.id.toobar);
        circleImageView = (ImageView) findViewById(R.id.circleImageView);
        circleImageView2 = (ImageView) findViewById(R.id.circleImageView2);
        circleImageView3 = (ImageView) findViewById(R.id.circleImageView3);
        wenhao = (ImageView) findViewById(R.id.wenhao);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        ed3 = (EditText) findViewById(R.id.ed3);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        toolbar.setTitle("登录");


        ed3.setVisibility(View.GONE);
        lin.setVisibility(View.GONE);

        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but1:


                break;
            case R.id.but2:
                String butext2 = but2.getText().toString().trim();
                if (butext2.equals("新用户注册")) {

                    toolbar.setTitle("验证码");
                    but1.setVisibility(View.GONE);
                    ed1.setHint("手机号");
                    ed2.setHint("验证码");
                    but2.setText("发送验证码");
                }else if (butext2.equals("发送验证码")){
                    String e1=ed1.getText().toString().trim();
                    if (!e1.equals(null)){
                        toolbar.setTitle("注册");
                        ed3.setVisibility(View.VISIBLE);
                        ed1.setHint("用户名");
                        ed2.setHint("密码");
                        but2.setText("用户注册");

                    }else {
                        Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    }

                }else if (butext2.equals("用户注册")){
                    String e1=ed1.getText().toString().trim();
                    String e2=ed2.getText().toString().trim();
                    String e3=ed3.getText().toString().trim();
                    if (!e1.equals(null)&&!e2.equals(null)&&!e3.equals(null)){
                        ed3.setVisibility(View.GONE);
                        ed2.setVisibility(View.GONE);
                        ed1.setVisibility(View.GONE);
                        but2.setText("确定");
                        lin.setVisibility(View.VISIBLE);
                    }
                }else if (butext2.equals("确定")){
                    Intent intent=new Intent(this,Main2Activity.class);

                    startActivity(intent);
                }


                break;
        }
    }
}
