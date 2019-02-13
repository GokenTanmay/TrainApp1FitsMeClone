package com.example.trainapp1fitsmeclone.Domain.Interactors.Auth;

import android.support.annotation.NonNull;

import com.example.trainapp1fitsmeclone.Domain.Entities.AuthInfo;
import com.example.trainapp1fitsmeclone.Domain.Entities.SignInInfo;

public interface ISignInRepository {

    @NonNull
    AuthInfo register(@NonNull SignInInfo signInInfo);

    @NonNull
    AuthInfo authorize(@NonNull SignInInfo signInInfo);
}
