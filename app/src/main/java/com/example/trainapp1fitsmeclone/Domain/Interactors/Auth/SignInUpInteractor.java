package com.example.trainapp1fitsmeclone.Domain.Interactors.Auth;

import com.example.trainapp1fitsmeclone.Domain.Entities.SignInInfo;

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
