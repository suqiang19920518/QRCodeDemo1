package com.thinkive.bank.qrcodedemo1;


import android.app.Application;

import com.vondear.rxtools.RxUtils;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RxUtils.init(this);//初始化
    }
}
