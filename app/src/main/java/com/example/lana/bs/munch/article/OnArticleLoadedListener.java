package com.example.lana.bs.munch.article;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnArticleLoadedListener {
    void onSuccess(String message, String articleBody);

    void onFailure(String message);
}
