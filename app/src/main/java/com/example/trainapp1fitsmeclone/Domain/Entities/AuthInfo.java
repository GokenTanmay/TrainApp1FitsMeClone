package com.example.trainapp1fitsmeclone.domain.entities;

public class AuthInfo {
    private String login;
    private String token;

    public  AuthInfo (String login, String token){
        this.login = login;
        this.token = token;
    }

    public String getLogin(){ return login;}
    public String getToken(){ return token;}
}
