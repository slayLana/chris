package com.example.lana.bs.munch.sources;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnSourceSavedListener {
    void onSuccess(String message);

    void onFailure(String message);
}
