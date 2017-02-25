package com.example.admin.recylerview;

import java.io.Serializable;

/**
 * Created by admin on 2/24/2017.
 */

public class Student implements Serializable {

    private int img;

    private  String name;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
