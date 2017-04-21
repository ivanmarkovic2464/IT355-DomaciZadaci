/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.service.impl;

import com.it355.ivanmarkovic.dao.KorisnikDao;
import com.it355.ivanmarkovic.model.Korisnik;
import com.it355.ivanmarkovic.service.KorisnikService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Ivan
 */
public class KorisnikServiceImpl implements KorisnikService{

    @Autowired
    KorisnikDao korisnikDao;
    
    @Override
    public int getCount() {
        return korisnikDao.getCount();
    }

    @Override
    public List<Korisnik> getAllUsers() {
        return korisnikDao.getAllUsers();
    }

    @Override
    public boolean addKorisnika(Korisnik korisnik) {
        return korisnikDao.addKorisnika(korisnik);
    }
    
}
