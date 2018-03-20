package com.example.lana.bs.munch.article;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnArticleArchivedListener {
    void onArticleSaved(String message);

    void onArticleSavingFailed(String message);
}
