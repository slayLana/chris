package com.example.lana.bs.munch.archive;

import android.content.Context;

/**
 * Created by Lana on 01/01/2018.
 */
public interface IArchiveInteractor {
    void retrieveArchiveFromDb(OnArticleRetrievedListener onArticleRetrievedListener, Context context);
}
