package model;

/**
 *
 * @author Henri
 */
public class Secao {
    private int nmr;
    private int qtdeEleitores;
    private String localizacao;
    
    public int getNmr(){
        return nmr;
    }
    public void setNmr(int nmr) {
        this.nmr = nmr;
    }
    
    public int getQtdeEleitores(){
        return qtdeEleitores;
    }
    public void setQtdeEleitores(int qtdeEleitores) {
        this.qtdeEleitores = qtdeEleitores;
    }
 
    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
}