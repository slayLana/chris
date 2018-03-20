package com.example.lana.bs.munch.feeds;

import com.example.lana.bs.munch.models.FeedItem;

/**
 * Created by Lana on 01/01/2018.
 */
public interface IFeedsPresenter {
    void attemptFeedLoading();

    void attemptFeedLoading(String source);

    void attemptFeedLoadingFromDb();

    void attemptFeedLoadingFromDbBySource(String source);

    void deleteFeeds();

    void deleteSelectedFeed(FeedItem feedItem);
}
