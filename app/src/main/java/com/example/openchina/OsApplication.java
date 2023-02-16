package com.example.openchina;

import android.app.Application;

import com.itheima.retrofitutils.ItheimaHttp;

public class OsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ItheimaHttp.init(this, "https://www.oschina.net/");//使用前必须调用（如果调用过则不需要重复调用）
    }
}
