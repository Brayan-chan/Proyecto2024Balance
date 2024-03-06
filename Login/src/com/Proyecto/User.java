package com.Proyecto;
import java.io.Serializable;

public class User implements Serializable{
    private String username = "";
    private String password = "";
    private String companyName = "";
    private String email = "";

    // Constructor
    public User(String username, String password, String companyName1, String email1) {
        this.username = username;
        this.password = password;
        this.companyName = companyName;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

