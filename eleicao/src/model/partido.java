package model;

/**
 *
 * @author Henri
 */
public class partido {
    
    private int nmr;
    private String nome;
    private String sigla;
    private int nmrVotos;
    
    public int getNmr(){
        return nmr;
    }
    public void setNmr(int nmr) {
        this.nmr = nmr;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSigla(){
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
     public int getNmrVotos(){
        return nmrVotos;
    }
    public void setNmrVotos(int nmrVotos) {
        this.nmrVotos = nmrVotos;
    }    
}
