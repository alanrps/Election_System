package model;

import java.text.ParseException;
/**
 *
 * @author Henri
 */
public class candidato extends Pessoa{
       private int nmr;
       private String nomeFantasia;
       private int nroVotos;
       private String cargo;
       
    public int getNmr(){
        return nmr;
    }
    public void setNmr(int nmr) {
        this.nmr = nmr;
    }
    
    public String getNomeFantasia(){
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    public int getNroVotos(){
        return nroVotos;
    }
    public void setNroVotos(int nroVotos) {
        this.nroVotos = nroVotos;
    }
    
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String Cargo) {
        this.cargo = Cargo;
    }

    public int getTitEleitor() {
        return titEleitor;
    }

    public void setTitEleitor(int titEleitor) {
        this.titEleitor = titEleitor;
    }
}
