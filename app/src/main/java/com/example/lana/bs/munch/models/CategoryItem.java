package com.example.lana.bs.munch.models;

import android.graphics.drawable.Drawable;

/**
 * Created by Lana on 01/01/2018.
 */
public class CategoryItem {
    private String categoryName;
    private Drawable categoryImg;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Drawable getCategoryImg() {
        return categoryImg;
    }

    public void setCategoryImg(Drawable categoryImg) {
        this.categoryImg = categoryImg;
    }
}
