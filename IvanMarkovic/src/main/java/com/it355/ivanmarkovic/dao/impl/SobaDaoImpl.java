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
import com.it355.ivanmarkovic.mapper.SobaMapper;
import com.it355.ivanmarkovic.model.Soba;
import java.util.List;

/**
 *
 * @author Ivan
 */
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
    }
    

    
    
}
