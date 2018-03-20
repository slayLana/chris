package com.example.lana.bs.munch.sources;

import android.content.Context;

import com.example.lana.bs.munch.models.SourceItem;

/**
 * Created by Lana on 01/01/2018.
 */
public interface ISourcePresenter {
    void addSource(SourceItem sourceItem);

    void getSources();

    void getSourceItems();

    void modifySources(Context context, SourceItem sourceItem);

    void deleteSource(SourceItem sourceItem);
}
