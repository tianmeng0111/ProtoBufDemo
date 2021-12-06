package com.example.protobufdemo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.protobufdemo.HttpSend;
import com.example.protobufdemo.R;
import com.example.protobufdemo.ResultCallbackListener;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import io.reactivex.disposables.Disposable;
import tm.LoginRequestOuterClass;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * 对于protobuf使用
                 */
                LoginRequestOuterClass.LoginRequest.Builder builder = LoginRequestOuterClass.LoginRequest.newBuilder();
                builder.setUsername("username");
                builder.setPwd("password");
                LoginRequestOuterClass.LoginRequest build = builder.build();
                // LoginRquest对象.toByteArray()作为body即可
                byte[] bytes = build.toByteArray();
                onLogin1(bytes);
            }
        });

        findViewById(R.id.btn_login_retrofit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLogin("username", "password");
            }
        });


        /**
         * 对于protobuf使用
         */
        // enum
        int success_value = LoginRequestOuterClass.ErrorCode.Success_VALUE;
    }

    /**
     * 开始登录（基于HttpURLConnection）
     *
     * @param data
     */
    public void onLogin1(final byte[] data) {
        new Thread() {
            @Override
            public void run() {
                OutputStream os = null;
                try {
                    URL url = new URL("http://192.168.0.162:8080/protobuf/login.action");
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("POST");
                    os = conn.getOutputStream();
                    os.write(data);
                    if (conn.getResponseCode() == 200) {
                        InputStream is = conn.getInputStream();
                        //解析结果
                        final LoginRequestOuterClass.LoginResponse loginResponse = LoginRequestOuterClass.LoginResponse.parseFrom(is);
                        Log.e(TAG, "登陆结果：code = " + loginResponse.getCode() + "\tmsg = " + loginResponse.getMsg());
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, loginResponse.getMsg(), Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (os != null) {
                            os.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
//                        progressDialog.dismiss();
                    }
                });
            }
        }.start();
    }

    /**
     * 登录
     *
     * @param username
     * @param pwd
     */
    public void onLogin(String username, String pwd) {
//        progressDialog.show();
        //开始请求
        HttpSend.getInstance().login(username, pwd, new ResultCallbackListener<LoginRequestOuterClass.LoginResponse>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(LoginRequestOuterClass.LoginResponse value) {
                Log.e(TAG, "登陆结果：code = " + value.getCode() + "\tmsg = " + value.getMsg());
                Toast.makeText(MainActivity.this, value.getMsg(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
                Log.e(TAG, "e-->" + e.getMessage());
            }

            @Override
            public void onComplete() {
//                progressDialog.dismiss();
                Log.e(TAG, "onComplete");
            }
        });
    }
}