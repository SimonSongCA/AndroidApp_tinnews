package com.tinnews;

import android.app.Application;

import com.ashokvarma.gander.Gander;
import com.ashokvarma.gander.imdb.GanderIMDB;
import com.facebook.stetho.Stetho;

public class TinNewsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // TODO: new code here.
        Gander.setGanderStorage(GanderIMDB.getInstance());
        Stetho.initializeWithDefaults(this);
    }
}
