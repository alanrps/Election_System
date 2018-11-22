/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.DbConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Secao;
import java.sql.PreparedStatement;

/**
 *
 * @author Alan Patriarca
 */
public class SecaoDAO extends DbConnection{
        private Connection conn;
        private final String sqlInsert  = "INSERT INTO SECAO(nmr,localizacao) VALUES (?,?)";
        private final String sqlUpdate  = "UPDATE SECAO SET  nmr = ?, localização = ?";
        private final String sqlRemove  = "DELETE FROM SECAO WHERE nmr = ?";
        private final String sqlList   = "SELECT nmr,localizacao FROM SECAO ORDER BY SECAO.nmr"; 
        private final String sqlFind   = "SELECT nmr,localizacao FROM SECAO WHERE nmr = ?";
        
        
        
        public void insert(Secao secao) throws SQLException{
        PreparedStatement ps = null;
        
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
        
            ps.setInt(1, secao.getNmr());
            ps.setString(2,secao.getLocalizacao());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }        
    }
      
    public void update(Secao secao) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setInt(1, secao.getNmr());
            ps.setString(2, secao.getLocalizacao());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }
    }
    
    public void remove(int nmr) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlRemove);
            ps.setInt(1, nmr);
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }

    }
    
    public ArrayList<Secao> list() throws SQLException, ClassNotFoundException, IOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Secao> list = new ArrayList<>();
            Secao secao;
            while (rs.next()){
                secao = new Secao();
                secao.setNmr(rs.getInt("nmr"));
                secao.setLocalizacao(rs.getString("localizacao"));
                list.add(secao);
            }
            return list;
        }
        finally{
            rs.close();
            ps.close();
            close(conn);
        }
    }
    
    public Secao find(int nmr)throws SQLException, ClassNotFoundException, IOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setInt(1, nmr);

            rs = ps.executeQuery();
            Secao secao = null;
            if (rs.next()){
                secao = new Secao();
                secao.setNmr(rs.getInt("nmr")); //Verificar
                secao.setLocalizacao(rs.getString("localizacao"));
            }
            return secao;
        }
        finally{
            rs.close();
            ps.close();
            close(conn);
        }
        
    }
    
}
