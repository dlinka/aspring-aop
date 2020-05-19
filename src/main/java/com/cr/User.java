package com.cr;

public class User {

    private int uid;
    private String username;

    public User() {
    }

    public User(int uid) {
        this.uid = uid;
    }

    public User(String username) {
        this.username = username;
    }

    public User(int uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                '}';
    }
}
