package com.example.trainapp1fitsmeclone.domain.interactors.auth;

import com.example.trainapp1fitsmeclone.domain.entities.SignInInfo;

import io.reactivex.Completable;

public class SignInUpInteractor implements ISignInUpInteractor {
    private ISignInUpInteractor signInUpInteractor;
    private IUserInfoRepository userInfoRepository;

    @Override
    public Completable register(SignInInfo signInInfo) {
        return null;
    }

    @Override
    public Completable authorize(SignInInfo authInfo) {
        return null;
    }

    @Override
    public Completable authorizeAuto() {
        return null;
    }
}
