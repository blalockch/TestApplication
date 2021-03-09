package com.example.testapplication;

public interface RestCallback {
    void onSuccess(Object o);
    void  onFailure(Throwable T);
}
