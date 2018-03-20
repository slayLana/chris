package com.example.lana.bs.munch.feeds;

import com.example.lana.bs.munch.models.SourceItem;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public interface IFeedsLoaderInteractor {
    void loadFeedsFromDb(final OnFeedsLoadedListener onFeedsLoadedListener);

    void loadFeedsFromDbBySource(final OnFeedsLoadedListener onFeedsLoadedListener, String source);

    void loadFeedsAsync(OnFeedsLoadedListener onFeedsLoadedListener, List<SourceItem> sourceItems);
}
