package com.example.trainapp1fitsmeclone.domain.entities;

public class SignInInfo {
    private String login;
    private String passwordHash;

    public SignInInfo(String login, String password){
        this.login = login;
        this.passwordHash = convertToSha256(password);
    }

    private String convertToSha256(String password) {
        return password+ "_temp_hash";
    }

    public String getLogin() {return login;}

    public String getPasswordHash() {return passwordHash;}


}
