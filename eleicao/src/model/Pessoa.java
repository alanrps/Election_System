package model;

import java.text.ParseException;

/**
 *
 * @author alanrps
 */
public class Pessoa{
    private int titEleitor;
    private String nome;
    private Secao secao;
    private Partido partido;
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
    
    public Secao getSecao(){
        return secao;
    }
    public void setSecao(Secao secao){
        this.secao = secao;
    }
    
    public Partido getPartido(){
        return partido;
    }
    public void setPartido(Partido partido){
        this.partido = partido;
    }
    

    
}
