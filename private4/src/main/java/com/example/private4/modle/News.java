package com.example.private4.modle;

/**
 * Created by w1565 on 2017/6/12.
 */

public class News {
    int img;
    String text;

    public News() {
    }

    public News(int img, String text) {

        this.img = img;
        this.text = text;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
