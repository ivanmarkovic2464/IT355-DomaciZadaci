/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.dao;

import com.it355.ivanmarkovic.model.Korisnik;
import java.util.List;

/**
 *
 * @author Ivan
 */
public interface KorisnikDao {
<<<<<<< HEAD
    public Korisnik addKorisnika(Korisnik korisnik);
    public void editKorisnika(Korisnik korisnik);
    public List<Korisnik> getAllKorisnici();
    public int getCountKorisnici();
    public void deleteKorisnika(Korisnik korisnik);
    public Korisnik getKorisnikByName(String id);
=======
    public int getCount();
    public List<Korisnik> getAllUsers();
    public boolean addKorisnika(Korisnik korisnik);
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
}
