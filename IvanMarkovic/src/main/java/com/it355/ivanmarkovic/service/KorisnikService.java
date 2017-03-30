/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.service;

import com.it355.ivanmarkovic.model.Korisnik;
import java.util.List;

/**
 *
 * @author Ivan
 */
public interface KorisnikService {
    public int getCount();
    public List<Korisnik> getAllUsers();
    public boolean addKorisnika(Korisnik korisnik);
}
