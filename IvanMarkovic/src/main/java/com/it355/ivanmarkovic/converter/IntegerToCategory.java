/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.converter;

import com.it355.ivanmarkovic.dao.KategorijaDao;
import com.it355.ivanmarkovic.model.Kategorija;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ivan
 */
@Component
final class IntegerToCategory implements Converter<String , Kategorija> {
 
 @Autowired
 KategorijaDao kategorijaDao;
 
 @Override
 public Kategorija convert(String s) {
 if(s.isEmpty()){
 return null;
 }
 Integer vrednost = Integer.valueOf(s);
 System.out.println("Konvertujem u kategoriju");
 Kategorija kat = kategorijaDao.getKategorijaById(vrednost);
 return kat;
 }
}
