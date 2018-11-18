package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dao.DbConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Endereco;
import model.Pessoa;
import ViewModel.EnderecoPessoa;
import java.sql.PreparedStatement;
/**
 *
 * @author alanrps
 */
public class EnderecoDAO1 extends DbConnection{
    private Connection conn;
//    private final String sqlInsert  = "INSERT INTO ENDERECO(nmr,cep,logradouro) VALUES (?,?,?)";
//    private final String sqlUpdate  = "UPDATE ENDERECO SET  nmr = ?, cep = ?, logradouro = ?";
//    private final String sqlRemove  = "DELETE FROM ENDERECO WHERE nmr = ?";
//    private final String sqlList    = "SELECT nmr,cep,logradouro FROM ENDERECO ORDER BY ENDERECO.nmr";
//    private final String sqlFind    = "SELECT nmr,cep,logradouro FROM ENDERECO WHERE nmr = ?";
    private final String sqlInsertEndereco  = "INSERT INTO ENDERECO(nmr,cep,logradouro) VALUES (?,?,?)";
    private final String sqlInsertPessoa  = "INSERT INTO PESSOA(idEnd,titEleitor,nome) VALUES (?,?,?)";
    private final String sqlUpdateEndereco  = "UPDATE ENDERECO SET  nmr = ?, cep = ?, logradouro = ?";
    private final String sqlUpdatePessoa  = "UPDATE PESSOA SET  titEleitor = ?, nome = ?, dataNasc = ?";
    private final String sqlRemovePessoa  = "DELETE FROM PESSOA WHERE titEleitor = ?";
    private final String sqlRemoveEndereco  = "DELETE ENDERECO SET  id = ?";
    private final String sqlList   = "SELECT titEleitor,nome,dataNasc,nmr,cep,logradouro FROM ENDERECO E,PESSOA P   ORDER BY PESSOA.titEleitor"; //WHERE P.nmrEnd = E.nmr
    private final String sqlFind   = "SELECT titEleitor,nome,dataNasc,nmr,cep,logradouro FROM ENDERECO E,PESSOA P WHERE titEleitor = ?";
    private final String sqlFindId = "SELECT id FROM ENDERECO WHERE nmr = ? AND cep = ? AND logradouro = ?";
    /**
     *
     * @param endereco
     * @throws SQLException
     */
    public int insertEndereco(Endereco endereco) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlInsertEndereco);
            ps.setInt(1, endereco.getNmr());
            ps.setInt(2, endereco.getCep());
            ps.setString(3, endereco.getLogradouro());
            ps.execute();
            
            return findIdEndereco(endereco.getNmr(),endereco.getCep(),endereco.getLogradouro());
        }
        finally{
            ps.close();
            close(conn);
        }   
        
    }
    public int findIdEndereco(int nmr,int cep,String logradouro)throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlFindId);
            ps.setInt(1, nmr);
            ps.setInt(2, cep);
            ps.setString(3, logradouro);
            

            rs = ps.executeQuery();
            EnderecoPessoa enderecoPessoa = null ;
            if (rs.next()){
                
                return rs.getInt("id");
                
            }
            return 0; //refatorar
        }
        finally{
            rs.close();
            ps.close();
            close(conn);
        }
    }
     
     public void insertPessoa(Pessoa pessoa,int id) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlInsertPessoa);
            ps.setInt(1,id);
            ps.setInt(2, pessoa.getTitEleitor());
            ps.setString(3, pessoa.getNome());
            
//          ps.setDate(3, pessoa.getDataNasc());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }        
    }
     
    public void updateEndereco(Endereco endereco) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlUpdateEndereco);
            ps.setInt(1, endereco.getNmr());
            ps.setInt(2, endereco.getCep());
            ps.setString(3, endereco.getLogradouro());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }
    }
    
    public void updatePessoa(Pessoa pessoa) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlUpdatePessoa);
            ps.setInt(1, pessoa.getTitEleitor());
            ps.setString(2, pessoa.getNome());
//            ps.setDate(3, pessoa.getDataNasc());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }
    }
    
    public void removePessoa(int titEleitor) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlRemovePessoa);
            ps.setInt(1, titEleitor);
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }
    }
    
    public void removeEndereco(int id) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlRemoveEndereco);
            ps.setInt(1, id);
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }
    }

    public ArrayList<EnderecoPessoa> list() throws SQLException, ClassNotFoundException, IOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlList);
            rs = ps.executeQuery();
            ArrayList<EnderecoPessoa> list = new ArrayList<>();
            EnderecoPessoa enderecoPessoa;
            while (rs.next()){
                enderecoPessoa = new EnderecoPessoa();
                enderecoPessoa.setNmr(rs.getInt("nmr"));
                enderecoPessoa.setCep(rs.getInt("cep"));
                enderecoPessoa.setLogradouro(rs.getString("logradouro"));
                enderecoPessoa.setTitEleitor(rs.getInt("titulo eleitor"));
                enderecoPessoa.setNome(rs.getString("nome"));
//                enderecoPessoa.setDataNasc(rs.getDate("data de nascimento"));
                list.add(enderecoPessoa);
            }
            return list;
        }
        finally{
            rs.close();
            ps.close();
            close(conn);
        }
    }
    
        public EnderecoPessoa find(int titEleitor)throws SQLException, ClassNotFoundException, IOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlFind);
            ps.setInt(1, titEleitor);

            rs = ps.executeQuery();
            EnderecoPessoa enderecoPessoa = null ;
            if (rs.next()){
                enderecoPessoa = new EnderecoPessoa();
                enderecoPessoa.setNmr(rs.getInt("nmr"));
                enderecoPessoa.setCep(rs.getInt("cep"));
                enderecoPessoa.setLogradouro(rs.getString("logradouro"));
                enderecoPessoa.setTitEleitor(rs.getInt("titulo de eleitor"));
                enderecoPessoa.setNome(rs.getString("nome"));
//                enderecoPessoa.setDataNasc(rs.getDate("data nascimento"));
            }
            return enderecoPessoa;
        }
        finally{
            rs.close();
            ps.close();
            close(conn);
        }
        
    }
}
       
