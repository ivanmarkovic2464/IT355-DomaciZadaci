/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.dao.impl;

import com.it355.ivanmarkovic.dao.KategorijaDao;
import com.it355.ivanmarkovic.model.Kategorija;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ivan
 */
@Repository("kategorijaDao")
@Service
public class KategorijaDaoImpl implements KategorijaDao {

     @SuppressWarnings("unused")
 private final Log logger = LogFactory.getLog(getClass());
 
 //Instanciramo sesiju
 @Autowired
 private SessionFactory sessionFactory;
 
 //kreiramo seter za sesiju
 @Autowired
 public void setSessionFactory(SessionFactory sessionFactory) {
 this.sessionFactory = sessionFactory;
 }
 
 //kreiramo geter za sesiju
 public Session getSession() {
 return sessionFactory.getCurrentSession();
 }
 
    @Transactional
    @Override
    public Kategorija addKategoriju(Kategorija kategorija) {
        return (Kategorija)getSession().merge(kategorija);
    }

    @Transactional
    @Override
    public void editKategoriju(Kategorija kategorija) {
        getSession().saveOrUpdate(kategorija);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Kategorija> getAllKategorije() {
        List<Kategorija> results = (List<Kategorija>) getSession().createCriteria(Kategorija.class).list();
        return results;
    }

    @Override
    public void deleteKategoriju(Kategorija kategorija) {
        getSession().delete(kategorija);
    }
    
    @Transactional
    @Override
    public Kategorija getKategorijaById(int IDkategorije) {
        Kategorija category = (Kategorija) getSession().createCriteria(Kategorija.class).add(Restrictions.eq("idKategorija", IDkategorije))
        .uniqueResult();
        System.out.println("Vracam kategoriju: " + category);
        return category;
    }
}
