package com.example.protobufdemo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.protobufdemo.R;
import com.example.protobufdemo.presenter.ILoginPresenter;
import com.example.protobufdemo.presenter.impl.LoginPresenterImpl;

/**
 * mvp结构的登录
 */
public class LoginMvpActivity extends AppCompatActivity implements ILoginPresenter.ILoginView {

    ILoginPresenter iLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iLoginPresenter = new LoginPresenterImpl(this);

        findViewById(R.id.btn_login_retrofit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iLoginPresenter.login("username", "pwd");
            }
        });
    }

    @Override
    public void refreshLoginSuccess(String msg) {
        Toast.makeText(LoginMvpActivity.this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void refreshLoginErr(String msg) {
        Toast.makeText(LoginMvpActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}