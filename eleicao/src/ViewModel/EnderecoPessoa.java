/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

import java.sql.Date;

/**
 *
 * @author Alan Patriarca
 */
public class EnderecoPessoa {
    private int titEleitor;
    private String nome;
    private Date dataNasc;
    private int nmr;
    private int cep;
    private String logradouro;
    
    public int getTitEleitor(){
        return titEleitor;
    }
    public void setTitEleitor(int titEleitor){
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
    public int getNmr(){
        return nmr;
    }
    public void setNmr(int nmr) {
        this.nmr = nmr;
    }
    
    public int getCep(){
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    
    public String getLogradouro(){
        return logradouro;
    }
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
}
