/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.model;

import java.io.Serializable;

/**
 *
 * @author Ivke
 */
@SuppressWarnings("serial")
public class Soba implements Serializable{
    private Integer id;
    private Integer brojKreveta;
    private Integer velicina;
    private String kupatilo;
    private String tv;
    private String klima;
    private Double cena;

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrojKreveta() {
        return brojKreveta;
    }

    public void setBrojKreveta(Integer brojKreveta) {
        this.brojKreveta = brojKreveta;
    }

    public Integer getVelicina() {
        return velicina;
    }

    public void setVelicina(Integer velicina) {
        this.velicina = velicina;
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

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Soba{" + "id=" + id + ", brojKreveta=" + brojKreveta + ", velicina=" + velicina + ", kupatilo=" + kupatilo + ", tv=" + tv + ", klima=" + klima + ", cena=" + cena + '}';
    }
    
    

}
