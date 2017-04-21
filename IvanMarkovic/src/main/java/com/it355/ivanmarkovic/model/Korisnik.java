/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.model;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
=======
import java.io.Serializable;
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77

/**
 *
 * @author Ivan
 */
<<<<<<< HEAD
@SuppressWarnings("unused")
@Entity
@Table(name = "users")
public class Korisnik{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "enabled")
=======
@SuppressWarnings("serial")
public class Korisnik implements Serializable {
    private String username;
    private String password;
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
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
