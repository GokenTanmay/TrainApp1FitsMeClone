package com.example.trainapp1fitsmeclone;

import android.app.Application;

import com.example.trainapp1fitsmeclone.Domain.Interactors.Auth.ISignInRepository;
import com.example.trainapp1fitsmeclone.Domain.Interactors.Auth.ISignInUpInteractor;
import com.example.trainapp1fitsmeclone.Domain.Interactors.Auth.IUserInfoRepository;
import com.example.trainapp1fitsmeclone.Domain.Interactors.Auth.SignInUpInteractor;

import timber.log.Timber;
import toothpick.Scope;
import toothpick.Toothpick;
import toothpick.config.Module;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
    }

    public static <T> void inject (T object){
        Scope appScope = Toothpick.openScope(object);
        appScope.installModules(new Module() {{
            bind(ISignInUpInteractor.class).to(SignInUpInteractor.class);
            bind(ISignInRepository.class).to(ISignInRepository.class);
            bind(IUserInfoRepository.class).to(IUserInfoRepository.class);
        }});
        Toothpick.inject(object, appScope);



    }
}
