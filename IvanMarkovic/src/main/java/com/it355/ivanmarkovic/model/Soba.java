/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.model;

import java.io.Serializable;
<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
=======
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77

/**
 *
 * @author Ivke
 */
<<<<<<< HEAD
@SuppressWarnings("unused")
@Entity
@Table(name = "sobe")
public class Soba{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "brojKreveta")
    private Integer brojKreveta;
    
    @Column(name = "velicina")
    private Integer velicina;
    
    @Column(name = "kupatilo")
    private String kupatilo;
    
    @Column(name = "tv")
    private String tv;
    
    @Column(name = "klima")
    private String klima;
    
    @Column(name = "cena")
    private Double cena;

    @ManyToOne
    @JoinColumn(name = "IDkategorije", referencedColumnName = "IDkategorije")
    private Kategorija kategorija;

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }
=======
@SuppressWarnings("serial")
public class Soba implements Serializable{
    private Integer id;
    private Integer brojKreveta;
    private Integer velicina;
    private String kupatilo;
    private String tv;
    private String klima;
    private Double cena;

>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
    
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
<<<<<<< HEAD
        return "Soba{" + "id=" + id + ", brojKreveta=" + brojKreveta + ", velicina=" + velicina + ", kupatilo=" + kupatilo + ", tv=" + tv + ", klima=" + klima + ", cena=" + cena + ", kategorija=" + kategorija + '}';
    }

  
=======
        return "Soba{" + "id=" + id + ", brojKreveta=" + brojKreveta + ", velicina=" + velicina + ", kupatilo=" + kupatilo + ", tv=" + tv + ", klima=" + klima + ", cena=" + cena + '}';
    }
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
    
    

}
