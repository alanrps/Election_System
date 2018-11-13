package model;

/**
 *
 * @author Henri
 */
public class zona {
    public int nmr;
    public Endereco endZona;
    public int qtdeEleitores;
    public String estado;
    
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
    
    public String setestado(){
        this.estado = estado;
    }
}
