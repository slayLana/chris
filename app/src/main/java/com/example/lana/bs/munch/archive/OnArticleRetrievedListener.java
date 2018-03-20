package com.example.lana.bs.munch.archive;

import com.example.lana.bs.munch.models.FeedItem;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnArticleRetrievedListener {
    void onSuccess(List<FeedItem> feedItems);

    void onFailure(String message);
}
