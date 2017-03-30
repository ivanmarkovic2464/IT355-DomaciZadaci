/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.dao.impl;

import com.it355.ivanmarkovic.dao.KorisnikDao;
import com.it355.ivanmarkovic.mapper.KorisnikMapper;
import com.it355.ivanmarkovic.model.Korisnik;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Ivan
 */
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
    }
    
}

