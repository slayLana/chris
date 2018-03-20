package com.example.lana.bs.munch.curatedfeeds;

import android.content.Context;

import com.example.lana.bs.munch.models.SourceItem;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public class CuratedFeedsPresenter implements ICuratedFeedsPresenter, OnCuratedFeedsRetrievedListener {
    private ICuratedFeedsView mView;

    public CuratedFeedsPresenter(ICuratedFeedsView mView) {
        this.mView = mView;
    }

    public void attemptCuratedFeedsLoading(Context context) {
        CuratedFeedsInteractor curatedFeedsInteractor = new CuratedFeedsInteractor();
        curatedFeedsInteractor.fetchCuratedFeedsFromServer(this, context);
    }

    @Override
    public void onSuccess(List<SourceItem> sourceItems) {
        mView.onFeedsLoaded(sourceItems);
    }

    @Override
    public void onFailure(String message) {
        mView.onFeedsLoadingFailure(message);
    }
}
