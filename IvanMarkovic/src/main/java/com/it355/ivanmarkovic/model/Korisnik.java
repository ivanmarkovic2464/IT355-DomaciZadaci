/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.model;

import java.io.Serializable;

/**
 *
 * @author Ivan
 */
@SuppressWarnings("serial")
public class Korisnik implements Serializable {
    private String username;
    private String password;
    private Integer enabled;

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

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "Korisnik{" + "username=" + username + ", password=" + password + ", enabled=" + enabled + '}';
    }
    
    
}
