package com.example.lana.bs.munch.sources;

import com.example.lana.bs.munch.models.SourceItem;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public interface ISourceView {
    void dataSourceSaved(String message);

    void dataSourceSaveFailed(String message);

    void dataSourceLoaded(List<String> sourceNames);

    void dataSourceItemsLoaded(List<SourceItem> sourceItems);

    void dataSourceLoadingFailed(String message);

    void sourceItemModified(SourceItem sourceItem, String oldName);

    void sourceItemModificationFailed(String message);

    void sourceItemDeleted(SourceItem sourceItem);

    void sourceItemDeletionFailed(String message);
}
