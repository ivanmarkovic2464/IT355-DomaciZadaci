/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ivan
 */
@SuppressWarnings("unused")
@Entity
@Table(name = "kategorije")
public class Kategorija {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDkategorije")
    private Integer idKategorija;
    
    @Column(name="nazivKategorije")
    private String nazivKategorije;

    public Kategorija() {
    }

    public Integer getIdKategorija() {
        return idKategorija;
    }

    public void setIdKategorija(Integer idKategorija) {
        this.idKategorija = idKategorija;
    }

   

   

    public String getNazivKategorije() {
        return nazivKategorije;
    }

    public void setNazivKategorije(String nazivKategorije) {
        this.nazivKategorije = nazivKategorije;
    }

    @Override
    public String toString() {
        return nazivKategorije;
    }
    
    
}
