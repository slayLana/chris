package com.example.lana.bs.munch.utils.comparator;

import com.example.lana.bs.munch.models.FeedItem;
import com.example.lana.bs.munch.utils.DateUtil;

import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Lana on 01/01/2018.
 */
public class FeedPubDateComparator implements Comparator<FeedItem> {
    //Reverse date sorting(latest to oldest)
    @Override
    public int compare(FeedItem feedItem1, FeedItem feedItem2) {
        try {
            Date date1 = new DateUtil().getDateObj(feedItem1.getItemPubDate());
            Date date2 = new DateUtil().getDateObj(feedItem2.getItemPubDate());
            if (date1 == date2) {
                return 0;
            }
            if (date1 == null) {
                return 1;
            }
            if (date2 == null) {
                return -1;
            }

            if (date1.compareTo(date2) > 0) {
                return -1;
            } else if (date1.compareTo(date2) < 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
