package com.example.lana.bs.munch.article;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnArticleRemoveListener {
    void onArticleDeleted(String message);

    void onArticleDeletionFailed(String message);
}
