package com.example.terminalwork;

import android.support.v7.widget.RecyclerView;

public class RecyclerView_HomePage {
    private String name;
    private int imageId;

    public RecyclerView_HomePage(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
