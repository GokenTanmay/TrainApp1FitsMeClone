package com.example.trainapp1fitsmeclone.Domain.Interactors.Auth;

import android.support.annotation.NonNull;

import com.example.trainapp1fitsmeclone.Domain.Entities.AuthInfo;
import com.example.trainapp1fitsmeclone.Domain.Entities.SignInInfo;

interface IUserInfoRepository {

    @NonNull
    SignInInfo getSignInInfo();

    void setSignInInfo(SignInInfo signInInfo);

    @NonNull
    AuthInfo getAuthInfo();

    void setAuthInfo(@NonNull AuthInfo authInfo);
}
