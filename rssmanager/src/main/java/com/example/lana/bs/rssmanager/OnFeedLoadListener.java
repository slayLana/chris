package com.example.lana.bs.rssmanager;

import org.jsoup.select.Elements;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnFeedLoadListener {
    void onSuccess(Elements elements);

    void onFailure(String message);
}
