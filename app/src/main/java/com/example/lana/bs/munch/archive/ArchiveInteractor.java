package com.example.lana.bs.munch.archive;

import android.content.Context;

import com.example.lana.bs.munch.models.FeedItem;
import com.example.lana.bs.munch.utils.DatabaseUtil;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public class ArchiveInteractor implements IArchiveInteractor {
    public void retrieveArchiveFromDb(OnArticleRetrievedListener onArticleRetrievedListener, Context context) {
        DatabaseUtil databaseUtil = new DatabaseUtil(context);
        try {
            List<FeedItem> feedItems = databaseUtil.getSavedArticles();
            onArticleRetrievedListener.onSuccess(feedItems);
        } catch (Exception e) {
            e.printStackTrace();
            onArticleRetrievedListener.onFailure(e.getMessage());
        }
    }
}
