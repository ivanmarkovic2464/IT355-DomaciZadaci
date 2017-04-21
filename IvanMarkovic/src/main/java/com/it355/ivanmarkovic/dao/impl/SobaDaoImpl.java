/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.it355.ivanmarkovic.dao.SobaDao;
<<<<<<< HEAD
import com.it355.ivanmarkovic.model.Soba;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
=======
import com.it355.ivanmarkovic.mapper.SobaMapper;
import com.it355.ivanmarkovic.model.Soba;
import java.util.List;
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77

/**
 *
 * @author Ivan
 */
<<<<<<< HEAD
@Repository("sobaDao")
@Service
public class SobaDaoImpl implements SobaDao{

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
    
    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public Soba addSoba(Soba soba) {
        return (Soba)getSession().merge(soba);
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public List<Soba> getAllRooms() {
        List<Soba> sobe = (List<Soba>) getSession().createCriteria(Soba.class).list();
        return sobe;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public int getCountSobe() {
        String sql = "SELECT COUNT(*) FROM SOBE";
        Number count = (Number) getSession().createSQLQuery(sql).uniqueResult();
        return Integer.parseInt(count.toString());
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public void editSobu(Soba soba) {
        getSession().saveOrUpdate(soba);
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public void deleteSobu(Soba soba) {
        getSession().delete(soba);
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public Soba getSobaById(int id) {
        Soba soba = (Soba) getSession().createCriteria(Soba.class).add(Restrictions.eq("id", id))
        .uniqueResult();
        return soba;
=======
public class SobaDaoImpl implements SobaDao{

    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;
    
    public void setDataSource(javax.sql.DataSource dataSource) {
    this.dataSource = dataSource;
    this.jdbcTemplate = new JdbcTemplate(dataSource);
    }    
    
    @Override
    @Transactional
    public boolean addSoba(Soba soba) {
        String sql = "INSERT INTO `sobe`(`ID`, `brojKreveta`, `Velicina`, `Kupatilo`, `TV`, `Klima`, `Cena`) VALUES(?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[] {
            soba.getId(), 
            soba.getBrojKreveta(), 
            soba.getVelicina(), 
            soba.getKupatilo(),
            soba.getTv(),
            soba.getKlima(),
            soba.getCena()
        });
        return true;
    }
    
    @Override
    public List<Soba> getAllRooms() {
        String sql = "SELECT * FROM SOBE";
        List<Soba> sobe = jdbcTemplate.query(sql, new SobaMapper());
        return sobe;
    }

    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM SOBE";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
    }
    

    
    
}
