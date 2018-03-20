package com.example.lana.bs.munch.feeds;

import com.example.lana.bs.munch.models.FeedItem;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnFeedsLoadedListener {
    void onSuccess(List<FeedItem> feedItems, boolean loadedNewFeeds);

    void onFailure(String message);
}
