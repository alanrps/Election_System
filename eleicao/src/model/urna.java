package model;

/**
 *
 * @author Henri
 */
public class urna {
    public int nmr;
    public String tipoUrna;
    public String modelo;
    
    public int getNmr(){
        return nmr;
    }
    public void setNmr(int nmr) {
        this.nmr = nmr;
    }
    
    public String getTipoUrna(){
        return tipoUrna;
    }
    public void setTipoUrna(String tipoUrna) {
        this.tipoUrna = tipoUrna;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
