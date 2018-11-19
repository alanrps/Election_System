package model;

import java.text.ParseException;

/**
 *
 * @author alanrps
 */
public class Pessoa{
    private int titEleitor;
    private String nome;
//    private Date dataNasc;
    
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
    
//    public Date getDataNasc(){
//        return dataNasc;
//    }
//    public void setDataNasc(Date dataNasc) {
//        this.dataNasc = dataNasc;
//    }
    
}
