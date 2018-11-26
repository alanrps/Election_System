package model;

/**
 *
 * @author alanrps
 */
public class Endereco{
    private int nmr;
    private int cep;
    private String logradouro;
  
   
    
    public int getNmr(){
        return nmr;
    }
    public void setNmr(int nmr) {
        this.nmr = nmr;
    }
    
    public int getCep(){
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    
    public String getLogradouro(){
        return logradouro;
    }
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    
    
    
}
