package com.example.protobufdemo;

import android.app.Application;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        HttpSend.getInstance().initContext(this);
    }
}
