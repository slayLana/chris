package com.example.lana.bs.munch.feeds;

import com.example.lana.bs.munch.models.FeedItem;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public interface IFeedsView {
    void feedsLoaded(List<FeedItem> feedItems);

    void loadingFailed(String message);
}
