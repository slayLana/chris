package com.example.lana.bs.munch.sources;

import com.example.lana.bs.munch.models.SourceItem;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnSourcesModifyListener {
    void onSourceModified(SourceItem sourceItem, String oldName);

    void onSourceModifiedFailed(String message);

    void onSourceDeleted(SourceItem sourceItem);

    void onSourceDeletionFailed(String message);
}
