/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.mapper;

import com.it355.ivanmarkovic.model.Soba;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Ivan
 */
public class SobaMapper implements RowMapper<Soba>{

    @Override
    public Soba mapRow(ResultSet rs, int i) throws SQLException {
        Soba soba = new Soba();
        
 soba.setId(rs.getInt("id"));
 soba.setBrojKreveta(rs.getInt("brojKreveta"));
 soba.setVelicina(rs.getInt("velicina"));
 soba.setKupatilo(rs.getString("kupatilo"));
 soba.setTv(rs.getString("tv"));
 soba.setKlima(rs.getString("klima"));
 soba.setCena(rs.getDouble("cena"));
 
    return soba;
 
    }
    
}
