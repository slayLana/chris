package com.example.lana.bs.munch.curatedfeeds;

import com.example.lana.bs.munch.models.SourceItem;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnCuratedFeedsRetrievedListener {
    void onSuccess(List<SourceItem> sourceItems);

    void onFailure(String message);
}
