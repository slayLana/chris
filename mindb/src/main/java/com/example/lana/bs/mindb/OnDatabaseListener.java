package com.example.lana.bs.mindb;

import android.database.Cursor;

import java.util.List;

/**
 * Created by Lana on 01/01/2018.
 */
public interface OnDatabaseListener {
    void onSuccess(String message, List<String> values, Cursor cursor);

    void onFailure(String message);
}
