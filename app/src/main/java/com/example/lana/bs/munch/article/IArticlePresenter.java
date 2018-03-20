package com.example.lana.bs.munch.article;

import com.example.lana.bs.munch.models.FeedItem;

/**
 * Created by Lana on 01/01/2018.
 */
public interface IArticlePresenter {
    void attemptArticleLoading(String url);

    void archiveArticle(FeedItem feedItem, String article);

    void removeArticle(FeedItem feedItem);
}
