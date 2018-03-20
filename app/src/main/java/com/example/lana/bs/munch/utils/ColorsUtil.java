package com.example.lana.bs.munch.utils;

import com.example.lana.bs.munch.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Lana on 01/01/2018.
 */
public class ColorsUtil {
    private List<Integer> getColors() {
        List<Integer> colors = new ArrayList<>();
        colors.add(R.color.md_cyan_500);
        colors.add(R.color.md_green_500);
        colors.add(R.color.md_red_500);
        colors.add(R.color.md_orange_500);
        colors.add(R.color.md_lime_500);
        colors.add(R.color.md_teal_500);
        colors.add(R.color.md_purple_500);
        colors.add(R.color.md_grey_500);
        return colors;
    }

    public int getRandomColor() {
        return getColors().get(getRandomIndex(0, getColors().size() - 1));
    }

    private int getRandomIndex(int start, int end) {
        Random random = new Random();
        return random.nextInt(end - start) + start;
    }
}
