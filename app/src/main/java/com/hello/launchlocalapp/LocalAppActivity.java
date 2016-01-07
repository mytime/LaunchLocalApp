package com.hello.launchlocalapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LocalAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_app);

        //web工具：webstorm
        // 从网络启动本地App
        //手机浏览器输入：10.0.2.2:端口号/路径/index.html
        Uri uri = getIntent().getData();
        System.out.println(uri);

    }
}
