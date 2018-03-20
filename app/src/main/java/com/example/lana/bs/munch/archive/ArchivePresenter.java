package com.example.lana.bs.munch.archive;

import android.content.Context;

import com.example.lana.bs.munch.models.FeedItem;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public class ArchivePresenter implements IArchivePresenter, OnArticleRetrievedListener {
    private IArchiveView mView;
    private ArchiveInteractor mArchiveInteractor;

    public ArchivePresenter(IArchiveView view) {
        this.mView = view;
        mArchiveInteractor = new ArchiveInteractor();
    }

    public void attemptArchiveRetrieval(Context context) {
        mArchiveInteractor.retrieveArchiveFromDb(this, context);
    }

    @Override
    public void onSuccess(List<FeedItem> feedItems) {
        mView.onArchiveRetrieved(feedItems);
    }

    @Override
    public void onFailure(String message) {
        mView.onArchiveRetrievalFailed(message);
    }
}
