package com.example.trainapp1fitsmeclone.domain.interactors.auth;

import com.example.trainapp1fitsmeclone.domain.entities.SignInInfo;

import io.reactivex.Completable;
import io.reactivex.annotations.NonNull;

public interface ISignInUpInteractor {
    @NonNull
    Completable register(@NonNull SignInInfo signInInfo);

    @NonNull
    Completable authorize(@NonNull SignInInfo authInfo);

    @NonNull
    Completable authorizeAuto();
}
