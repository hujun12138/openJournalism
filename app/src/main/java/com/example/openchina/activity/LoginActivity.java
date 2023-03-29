package com.example.openchina.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.VoiceInteractor;
import android.os.Bundle;

import com.example.openchina.AppConfig;
import com.example.openchina.Bean.DetailBean;
import com.example.openchina.R;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import okhttp3.Headers;
import retrofit2.Call;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Request request = ItheimaHttp.newGetRequest(AppConfig.loginURL);//apiUrl格式："xxx/xxxxx"
        request.putParams("keep_login",1)
                .putParams("username","18107385733")
                .putParams("pwd","hujun730103");
        Call call = ItheimaHttp.send(request, new HttpResponseListener<String>() {
            @Override
            public void onResponse(String string, Headers headers) {
                  System.out.print("json="+string);
            }
        });
    }
}