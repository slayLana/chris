package com.example.lana.bs.munch.archive;

import com.example.lana.bs.munch.models.FeedItem;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public interface IArchiveView {
    void onArchiveRetrieved(List<FeedItem> feedItems);

    void onArchiveRetrievalFailed(String message);
}
