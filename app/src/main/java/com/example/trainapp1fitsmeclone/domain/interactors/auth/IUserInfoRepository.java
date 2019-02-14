package com.example.trainapp1fitsmeclone.domain.interactors.auth;

import android.support.annotation.NonNull;

import com.example.trainapp1fitsmeclone.domain.entities.AuthInfo;
import com.example.trainapp1fitsmeclone.domain.entities.SignInInfo;

public interface IUserInfoRepository {

    @NonNull
    SignInInfo getSignInInfo();

    void setSignInInfo(SignInInfo signInInfo);

    @NonNull
    AuthInfo getAuthInfo();

    void setAuthInfo(@NonNull AuthInfo authInfo);
}
