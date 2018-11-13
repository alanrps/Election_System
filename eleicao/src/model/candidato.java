package model;

/**
 *
 * @author Henri
 */
public class candidato extends Pessoa{
       public int nmr;
       public String nomeFantasia;
       public int nroVotos;
       public String cargo;
       
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
}
