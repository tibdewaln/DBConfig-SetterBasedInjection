package com.spring.app;

public class DBConfig {
    private String drivernName;
    private String url;
    private String userName;
    private String password;

    public String getDrivernName() {
        return drivernName;
    }

    public void setDrivernName(String drivernName) {
        this.drivernName = drivernName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DBConfig{" + "drivernName=" + drivernName + ", url=" + url + ", userName=" + userName + ", password=" + password + '}';
    }
}

