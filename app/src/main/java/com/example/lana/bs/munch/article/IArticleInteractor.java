package com.example.lana.bs.munch.article;

import android.content.Context;

import com.example.lana.bs.munch.models.FeedItem;

/**
 * Created by Lana on 01/01/2018.
 */
public interface IArticleInteractor {
    void loadArticleAsync(OnArticleLoadedListener onArticleLoadedListener, Context context, String url);

    void articleLoaded(String articleBody);

    void articleLoadingFailed(String message);

    void archiveArticleInDb(OnArticleArchivedListener onArticleArchivedListener, Context context, FeedItem feedItem, String article);

    void deleteArticleInDb(OnArticleRemoveListener onArticleRemoveListener, Context context, FeedItem feedItem);
}
