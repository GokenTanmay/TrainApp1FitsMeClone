package com.example.trainapp1fitsmeclone.Presentation.View;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.trainapp1fitsmeclone.App;
import com.example.trainapp1fitsmeclone.Domain.Interactors.Auth.SignInUpInteractor;
import com.example.trainapp1fitsmeclone.Presentation.presenter.MainPresenter;
import com.example.trainapp1fitsmeclone.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SignInUpInteractor signInUpInteractor;

    public MainActivity(){
        App.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainPresenter mainPresenter = ViewModelProviders.of(this).get(MainPresenter.class);
    }
}
