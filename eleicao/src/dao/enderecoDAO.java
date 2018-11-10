/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Endereco;
/**
 *
 * @author alanrps
 */
public class enderecoDAO {
    private Connection conn;
    private final String sqlInsert  = "INSERT INTO ENDERECO(nmr,cep,logradouro) VALUES (?,?,?)";
    private final String sqlUpdate  = "UPDATE ENDERECO SET titEleitor = ?, nmr = ?, cep = ?, logradouro = ?";
    private final String sqlRemove  = "DELETE FROM ENDERECO WHERE nmr = ?";
    private final String sqlList    = "SELECT nmr,cep,logradouro FROM ENDERECO ORDER BY ENDERECO.nmr";
    private final String sqlFind    = "SELECT nmr,cep,logradouro FROM ENDERECO WHERE nmr = ?";
}

public void insert(Endereco endereco) throws SQLException{
        conn = connect();
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, pais.getSigla());
            ps.setString(2, pais.getNome());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }
        
    }
