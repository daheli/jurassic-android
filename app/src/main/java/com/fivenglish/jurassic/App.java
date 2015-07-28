package com.fivenglish.jurassic;

import android.app.Application;

import com.fivenglish.jurassic.util.LogUtils;

/**
 * Created by lidahe on 15/7/22.
 */
public class App extends Application {
    public static App ctx;
    public static boolean debug = true;

    @Override
    public void onCreate() {
        super.onCreate();
        ctx = this;

        init();
    }

    private void init() {
        LogUtils.debugEnabled = debug;
    }

}
