package com.example.trainapp1fitsmeclone.Domain.Interactors.Auth;

import com.example.trainapp1fitsmeclone.Domain.Entities.SignInInfo;

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
