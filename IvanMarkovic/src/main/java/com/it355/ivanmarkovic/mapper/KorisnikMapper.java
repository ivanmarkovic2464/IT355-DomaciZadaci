/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.ivanmarkovic.mapper;

/**
 *
 * @author Ivan
 */
import com.it355.ivanmarkovic.model.Korisnik;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Ivan
 */
public class KorisnikMapper implements RowMapper<Korisnik>{

    @Override
    public Korisnik mapRow(ResultSet rs, int i) throws SQLException {
        Korisnik korisnik = new Korisnik();
        korisnik.setUsername(rs.getString("username"));
        korisnik.setPassword(rs.getString("password"));
        korisnik.setEnabled(1);
        return korisnik;
    }
    
}
