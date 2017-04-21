/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.dao.impl;

import com.it355.ivanmarkovic.dao.KorisnikDao;
<<<<<<< HEAD
import com.it355.ivanmarkovic.model.Korisnik;
import java.util.List;
import javax.sql.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
=======
import com.it355.ivanmarkovic.mapper.KorisnikMapper;
import com.it355.ivanmarkovic.model.Korisnik;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77

/**
 *
 * @author Ivan
 */
<<<<<<< HEAD
@Repository("korisnikDao")
@Service
public class KorisnikDaoImpl implements KorisnikDao{

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
    
    @Override
    @Transactional
    public int getCountKorisnici() {
        String sql = "SELECT COUNT(*) FROM users";
        Number count = (Number) getSession().createSQLQuery(sql).uniqueResult();
        return Integer.parseInt(count.toString());
    }
    
    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Korisnik> getAllKorisnici() {
        List<Korisnik> korisnik = (List<Korisnik>) getSession().createCriteria(Korisnik.class).list();
        return korisnik;
    }

    @Override
    public Korisnik addKorisnika(Korisnik korisnik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void editKorisnika(Korisnik korisnik) {
        getSession().saveOrUpdate(korisnik);
    }

    @Override
    @Transactional
    public void deleteKorisnika(Korisnik korisnik) {
        getSession().delete(korisnik);
    }
    @Transactional
    @Override
    public Korisnik getKorisnikByName(String username) {
        Korisnik k = (Korisnik) getSession().createCriteria(Korisnik.class).add(Restrictions.eq("username", username))
        .uniqueResult();
        return k;
=======
public class KorisnikDaoImpl implements KorisnikDao{

    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;
 
    public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
    this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM users";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<Korisnik> getAllUsers() {
        String sql = "SELECT * FROM USERS";
        List<Korisnik> korisnici = jdbcTemplate.query(sql, new KorisnikMapper());
        return korisnici;
    }

    @Override
    public boolean addKorisnika(Korisnik korisnik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
    }
    
}

