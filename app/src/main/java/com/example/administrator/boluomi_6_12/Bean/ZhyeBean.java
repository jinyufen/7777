package com.example.administrator.boluomi_6_12.Bean;

import android.widget.TextView;

/**
 * Created by Administrator on 2017/6/12 0012.
 */

public class ZhyeBean {
    int ima;
    String title;
    String content;

    public int getIma() {
        return ima;
    }

    public void setIma(int ima) {
        this.ima = ima;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ZhyeBean{" +
                "ima=" + ima +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
