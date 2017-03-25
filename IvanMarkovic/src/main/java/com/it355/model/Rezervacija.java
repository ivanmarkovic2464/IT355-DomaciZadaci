/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.model;

import java.io.Serializable;

/**
 *
 * @author Ivan
 */
public class Rezervacija implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String imeIPrezime;
    private String brojOsoba;
    private String brojDece;
    private String brojDanaOdsedanja;

    public Rezervacija() {
    }

    public Rezervacija(String imeIPrezime, String brojOsoba, String brojDece, String brojDanaOdsedanja) {
        this.imeIPrezime = imeIPrezime;
        this.brojOsoba = brojOsoba;
        this.brojDece = brojDece;
        this.brojDanaOdsedanja = brojDanaOdsedanja;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojOsoba() {
        return brojOsoba;
    }

    public void setBrojOsoba(String brojOsoba) {
        this.brojOsoba = brojOsoba;
    }

    public String getBrojDece() {
        return brojDece;
    }

    public void setBrojDece(String brojDece) {
        this.brojDece = brojDece;
    }

    public String getBrojDanaOdsedanja() {
        return brojDanaOdsedanja;
    }

    public void setBrojDanaOdsedanja(String brojDanaOdsedanja) {
        this.brojDanaOdsedanja = brojDanaOdsedanja;
    }
    
    
}
