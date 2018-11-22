/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import dao.DbConnection;
import java.sql.PreparedStatement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Partido;

/**
 *
 * @author Alan Patriarca
 */
public class PartidoDAO extends DbConnection{
    private Connection conn;
    private final String sqlInsert = "INSERT INTO PARTIDO(nmr,nome,sigla) VALUES (?,?,?)";
    private final String sqlUpdate = "UPDATE PARTIDO SET nmr = ?,nome = ?,sigla = ?  WHERE nmr = ?";
    private final String sqlRemove = "DELETE FROM PARTIDO WHERE nmr = ?";
    private final String sqlList   = "SELECT nmr,nome,sigla FROM PARTIDO ORDER BY nmr";
    private final String sqlFind   = "SELECT nmr,nome,sigla FROM PARTIDO WHERE nmr = ?";
    
     public void insert(Partido partido) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
        
            ps.setInt(1, partido.getNmr());
            ps.setString(2, partido.getNome());
            ps.setString(3, partido.getSigla());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }        
    }

    public void update(Partido partido) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setInt(1, partido.getNmr());
            ps.setString(2, partido.getNome());
            ps.setString(3, partido.getSigla());
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
    
    public ArrayList<Partido> list() throws SQLException, ClassNotFoundException, IOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<Partido> list = new ArrayList<>();
            Partido partido;
            while (rs.next()){
                partido = new Partido();
                partido.setNmr(rs.getInt("nmr"));
                partido.setNome(rs.getString("nome"));
                partido.setSigla(rs.getString("sigla"));
                list.add(partido);
            }
            return list;
        }
        finally{
            rs.close();
            ps.close();
            close(conn);
        }
    }
    
    public Partido find(int nmr)throws SQLException, ClassNotFoundException, IOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setInt(1, nmr);

            rs = ps.executeQuery();
            Partido partido = null ;
            if (rs.next()){
                partido = new Partido();
                partido.setNmr(rs.getInt("nmr"));
                partido.setNome(rs.getString("nome"));
                partido.setSigla(rs.getString("sigla"));
            }
            return partido;
        }
        finally{
            rs.close();
            ps.close();
            close(conn);
        }
        
    }
    
}
