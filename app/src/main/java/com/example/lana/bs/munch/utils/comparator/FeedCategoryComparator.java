package com.example.lana.bs.munch.utils.comparator;

import com.example.lana.bs.munch.models.FeedItem;

import java.util.Comparator;

/**
 * Created by Lana on 01/01/2018.
 */
public class FeedCategoryComparator implements Comparator<FeedItem> {
    @Override
    public int compare(FeedItem feedItem1, FeedItem feedItem2) {
        String category1 = feedItem1.getItemCategory().toLowerCase();
        String category2 = feedItem2.getItemCategory().toLowerCase();
        if (category1 == category2) {
            return 0;
        }
        if (category1 == null) {
            return -1;
        }
        if (category2 == null) {
            return 1;
        }
        return category1.compareTo(category2);
    }
}
