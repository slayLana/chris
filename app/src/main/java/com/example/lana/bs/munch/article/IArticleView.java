package com.example.lana.bs.munch.article;

/**
 * Created by Lana on 01/01/2018.
 */
public interface IArticleView {
    void onArticleLoaded(String article);

    void onArticleFailedToLoad(String message);

    void onArticleSaved(String message);

    void onArticleSavingFailed(String message);

    void onArticleRemoved(String message);

    void onArticleRemovalFailed(String message);
}
