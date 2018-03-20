package com.example.lana.bs.munch.curatedfeeds;

import android.content.Context;

/**
 * Created by Lana on 01/01/2018.
 */
public interface ICuratedFeedsInteractor {
    void fetchCuratedFeedsFromServer(OnCuratedFeedsRetrievedListener onCuratedFeedsRetrievedListener, Context context);
}
