package com.example.protobufdemo.presenter;

public interface ILoginPresenter {

    interface ILoginView {
        void refreshLoginSuccess(String msg);
        void refreshLoginErr(String msg);
    }

    void login(String userName, String pwd);

    void logout();
}
