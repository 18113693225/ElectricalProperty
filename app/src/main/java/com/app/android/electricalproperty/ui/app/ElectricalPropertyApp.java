package com.app.android.electricalproperty.ui.app;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;


public class ElectricalPropertyApp extends Application {

    @Override
    public void onCreate() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
