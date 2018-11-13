/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Date;

/**
 *
 * @author alanrps
 */
public class Pessoa{
    private int titEleitor;
    private String nome;
    private Date dataNasc;
    
//    public Pessoa(int titEleitor,String nome,Date dataNasc) {
//        this.titEleitor = titEleitor;
//        this.nome = nome;
//        this.dataNasc = dataNasc;
//    }
    
    public int getTituloEleitor(){
        return titEleitor;
    }
    public void setNumero(int titEleitor) {
        this.titEleitor = titEleitor;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Date getDataNasc(){
        return dataNasc;
    }
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
}
