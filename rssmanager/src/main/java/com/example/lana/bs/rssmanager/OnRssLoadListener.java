package com.example.lana.bs.rssmanager;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnRssLoadListener {
    void onSuccess(List<RssItem> rssItems);

    void onFailure(String message);
}
