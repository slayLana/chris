package com.example.lana.bs.munch.models;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.ContextCompat;

import com.example.lana.bs.munch.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public class Categories {
    private Context mContext;

    public Categories(Context context) {
        this.mContext = context;
    }

    public List<CategoryItem> getCategoryItems() {
        List<CategoryItem> categoryItems = new ArrayList<>();

        String[] categoryNames = mContext.getResources().getStringArray(R.array.category_names);
        TypedArray categoryImgs = mContext.getResources().obtainTypedArray(R.array.category_drawables);

        for (int i = 0; i < categoryNames.length; i++) {
            CategoryItem categoryItem = new CategoryItem();
            categoryItem.setCategoryName(categoryNames[i]);
            categoryItem.setCategoryImg(ContextCompat.getDrawable(mContext, categoryImgs.getResourceId(i, -1)));
            categoryItems.add(categoryItem);
        }

        return categoryItems;
    }

    public int getDrawableId(String category) {
        System.out.print("BOOK:"+ R.drawable.ic_book_24dp);
        switch (category) {
            case "汽车":
//                System.out.print(R.drawable.ic_automobile_24dp);
                return R.drawable.ic_automobile_24dp;
            case "阅读":
                return R.drawable.ic_book_24dp;
            case "商务":
                return R.drawable.ic_business_24dp;
            case "气候":
                return R.drawable.ic_climate_24dp;
            case "漫画":
                return R.drawable.ic_comics_24dp;
            case "经济":
                return R.drawable.ic_economics_24dp;
            case "教育":
                return R.drawable.ic_education_24dp;
            case "娱乐":
                return R.drawable.ic_entertainment_24dp;
//                94
            case "潮流":
                return R.drawable.ic_fashion_24dp;
            case "养生":
                return R.drawable.ic_fitness_24dp;
            case "美食":
                return R.drawable.ic_food_24dp;
            case "技术宅":
                return R.drawable.ic_gadgets_24dp;
            case "游戏":
                return R.drawable.ic_gaming_24dp;
            case "音乐":
                return R.drawable.ic_music_24dp;
            case "政治":
                return R.drawable.ic_politics_24dp;
            case "运动":
                return R.drawable.ic_sports_24dp;
            case "科技":
                return R.drawable.ic_technology_24dp;
            case "其他":
                return R.drawable.ic_unknown_24dp;
            default:
                return 0;
        }
    }
}
