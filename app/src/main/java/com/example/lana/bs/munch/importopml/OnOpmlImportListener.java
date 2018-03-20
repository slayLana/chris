package com.example.lana.bs.munch.importopml;

import com.example.lana.bs.munch.models.SourceItem;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnOpmlImportListener {
    void onSuccess(List<SourceItem> sourceItems);

    void onFailure(String message);
}
