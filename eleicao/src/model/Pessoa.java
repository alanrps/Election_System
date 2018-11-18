/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author alanrps
 */
public class Pessoa{
    protected int titEleitor;
    protected String nome;
    protected Date dataNasc;
//    public void setData(String dataNasc) throws ParseException{
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        this.dataNasc =  new java.sql.Date(format.parse(dataNasc).getTime());
//    }
    
    
    public int getTitEleitor(){
        return titEleitor;
    }
    public void setTitEleitor(int titEleitor) {
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
