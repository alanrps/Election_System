package model;

/**
 *
 * @author Henri
 */
public class secao {
    private int nmr;
    private int qtdeEleitores;
    private Endereco localizacao;
    
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
 
    public Endereco getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Endereco localizacao) {
        this.localizacao = localizacao;
    }
    
}