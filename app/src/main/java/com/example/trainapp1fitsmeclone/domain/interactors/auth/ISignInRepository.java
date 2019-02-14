package com.example.trainapp1fitsmeclone.domain.interactors.auth;

import android.support.annotation.NonNull;

import com.example.trainapp1fitsmeclone.domain.entities.AuthInfo;
import com.example.trainapp1fitsmeclone.domain.entities.SignInInfo;

public interface ISignInRepository {

    @NonNull
    AuthInfo register(@NonNull SignInInfo signInInfo);

    @NonNull
    AuthInfo authorize(@NonNull SignInInfo signInInfo);
}
