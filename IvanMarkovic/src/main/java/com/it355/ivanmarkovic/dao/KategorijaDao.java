/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.dao;

import com.it355.ivanmarkovic.model.Kategorija;
import java.util.List;

/**
 *
 * @author Ivan
 */
public interface KategorijaDao {
    public Kategorija addKategoriju(Kategorija kategorija);
    public void editKategoriju(Kategorija kategorija);
    public List<Kategorija> getAllKategorije();
    public void deleteKategoriju(Kategorija kategorija);
    public Kategorija getKategorijaById(int IDkategorije);
}
