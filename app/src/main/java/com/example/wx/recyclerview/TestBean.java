package com.example.wx.recyclerview;

/**
 * Created by wx on 2018/3/23.
 */

public class TestBean {
    private int imgId;
    private String name;

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestBean(int imgId, String name) {

        this.imgId = imgId;
        this.name = name;
    }
}
