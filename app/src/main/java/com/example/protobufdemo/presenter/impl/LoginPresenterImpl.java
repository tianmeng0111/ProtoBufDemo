package com.example.protobufdemo.presenter.impl;

import android.util.Log;

import com.example.protobufdemo.HttpSend;
import com.example.protobufdemo.ResultCallbackListener;
import com.example.protobufdemo.presenter.ILoginPresenter;

import io.reactivex.disposables.Disposable;
import tm.LoginRequestOuterClass;

/**
 * 登录的业务处理类
 */
public class LoginPresenterImpl implements ILoginPresenter {
    private static final String TAG = "LoginPresenterImpl";

    private ILoginView iLoginView;

    public LoginPresenterImpl(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
    }

    @Override
    public void login(String username, String pwd) {
        HttpSend.getInstance().login(username, pwd, new ResultCallbackListener<LoginRequestOuterClass.LoginResponse>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(LoginRequestOuterClass.LoginResponse value) {
                Log.e(TAG, "登陆结果：code = " + value.getCode() + "\tmsg = " + value.getMsg());
                iLoginView.refreshLoginSuccess(value.getMsg());
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
                iLoginView.refreshLoginErr(e.getMessage());
            }

            @Override
            public void onComplete() {
//                progressDialog.dismiss();
                Log.e(TAG, "onComplete");
            }
        });
    }

    @Override
    public void logout() {

    }
}
