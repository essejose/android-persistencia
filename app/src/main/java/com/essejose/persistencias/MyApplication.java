package com.essejose.persistencias;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by essejose on 14/06/2017.
 */

public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
