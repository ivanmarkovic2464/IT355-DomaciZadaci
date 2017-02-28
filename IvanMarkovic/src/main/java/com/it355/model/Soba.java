/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.model;

/**
 *
 * @author Ivke
 */
public class Soba {
    private Integer brojKreveta;
    private Integer velicinaUMetrimaKvadratnim;
    private String kupatilo;
    private String tv;
    private String klima;
    private Double cenaPoDanu;

    public Soba() {
    }

    public Soba(Integer brojKreveta, Integer velicinaUMetrimaKvadratnim, String kupatilo, String tv, String klima, Double cenaPoDanu) {
        this.brojKreveta = brojKreveta;
        this.velicinaUMetrimaKvadratnim = velicinaUMetrimaKvadratnim;
        this.kupatilo = kupatilo;
        this.tv = tv;
        this.klima = klima;
        this.cenaPoDanu = cenaPoDanu;
    }

    public Integer getBrojKreveta() {
        return brojKreveta;
    }

    public void setBrojKreveta(Integer brojKreveta) {
        this.brojKreveta = brojKreveta;
    }

    public Integer getVelicinaUMetrimaKvadratnim() {
        return velicinaUMetrimaKvadratnim;
    }

    public void setVelicinaUMetrimaKvadratnim(Integer velicinaUMetrimaKvadratnim) {
        this.velicinaUMetrimaKvadratnim = velicinaUMetrimaKvadratnim;
    }

    public String getKupatilo() {
        return kupatilo;
    }

    public void setKupatilo(String kupatilo) {
        this.kupatilo = kupatilo;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getKlima() {
        return klima;
    }

    public void setKlima(String klima) {
        this.klima = klima;
    }

    public Double getCenaPoDanu() {
        return cenaPoDanu;
    }

    public void setCenaPoDanu(Double cenaPoDanu) {
        this.cenaPoDanu = cenaPoDanu;
    }
    
    

    
    
    
    
}
