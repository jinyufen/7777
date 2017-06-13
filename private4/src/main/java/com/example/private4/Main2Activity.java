package com.example.private4;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.example.private4.adapter.MyViewAdapter;
import com.example.private4.fragmnet.AFragment;
import com.example.private4.fragmnet.BFragment;
import com.example.private4.fragmnet.CFragment;
import com.example.private4.fragmnet.DFragment;
import com.example.private4.fragmnet.EFragment;
import com.example.private4.fragmnet.FFragment;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private ViewPager viewPager;
    private MyViewAdapter adapter;
    private ArrayList<Fragment> list;
    private RadioButton man2_img1,man2_img2,man2_img3,man2_img4,man2_img5,man2_img6;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        list=new ArrayList<>();
        list.add(new AFragment());
        list.add(new BFragment());
        list.add(new CFragment());
        list.add(new DFragment());
        list.add(new EFragment());
        list.add(new FFragment());

        adapter=new MyViewAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(adapter);

        viewPager.setCurrentItem(2);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        man2_img1.setChecked(true);
                        break;
                    case 1:
                        man2_img2.setChecked(true);
                        break;
                    case 2:
                        man2_img3.setChecked(true);
                        break;
                    case 3:
                        man2_img4.setChecked(true);
                        break;
                    case 4:
                        man2_img5.setChecked(true);
                        break;
                    case 5:
                        man2_img6.setChecked(true);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initView() {
        viewPager= (ViewPager) findViewById(R.id.viewpage);
        man2_img1= (RadioButton) findViewById(R.id.man2_img1);
        man2_img2= (RadioButton) findViewById(R.id.man2_img2);
        man2_img3= (RadioButton) findViewById(R.id.man2_img3);
        man2_img4= (RadioButton) findViewById(R.id.man2_img4);
        man2_img5= (RadioButton) findViewById(R.id.man2_img5);
        man2_img6= (RadioButton) findViewById(R.id.man2_img6);
        radioGroup= (RadioGroup) findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (group.getCheckedRadioButtonId()){
            case R.id.man2_img1:
                viewPager.setCurrentItem(0);
                break;
            case R.id.man2_img2:
                viewPager.setCurrentItem(1);
                break;
            case R.id.man2_img3:
                viewPager.setCurrentItem(2);
                break;
            case R.id.man2_img4:
                viewPager.setCurrentItem(3);
                break;
            case R.id.man2_img5:
                viewPager.setCurrentItem(4);
                break;
            case R.id.man2_img6:
                viewPager.setCurrentItem(5);
                break;

        }
    }
}
