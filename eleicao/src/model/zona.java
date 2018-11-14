package model;

/**
 *
 * @author Henri
 */
public class zona {
    private int nmr;
    private Endereco endZona;
    private int qtdeEleitores;
    private String estado;
    
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
    
    public Endereco getEndZona() {
        return endZona;
    }

    public void setEndZona(Endereco endZona) {
        this.endZona = endZona;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setestado(String estado){
        this.estado = estado;
    }
}
