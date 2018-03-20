package com.example.lana.bs.munch.importopml;

import android.content.Context;

import java.io.File;

/**
 * Created by Lana on 01/01/2018.
 */
public interface IImportOpmlInteractor {
    void retrieveFeed(OnOpmlImportListener onOpmlImportListener, Context context, String url);

    void retrieveFeeds(OnOpmlImportListener onOpmlImportListener, Context context, File file);
}
