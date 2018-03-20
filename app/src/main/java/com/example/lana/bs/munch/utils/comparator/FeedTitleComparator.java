package com.example.lana.bs.munch.utils.comparator;

import com.example.lana.bs.munch.models.FeedItem;

import java.util.Comparator;

/**
 * Created by Lana on 01/01/2018.
 */
public class FeedTitleComparator implements Comparator<FeedItem> {
    @Override
    public int compare(FeedItem feedItem1, FeedItem feedItem2) {
        String title1 = feedItem1.getItemTitle().toLowerCase();
        String title2 = feedItem2.getItemTitle().toLowerCase();
        if (title1 == title2) {
            return 0;
        }
        if (title1 == null) {
            return -1;
        }
        if (title2 == null) {
            return 1;
        }
        return title1.compareTo(title2);
    }
}
