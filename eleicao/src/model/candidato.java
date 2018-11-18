package model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setDataNasc(String dataNasc) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        this.dataNasc = (Date) format.parse(dataNasc);
    }
    //    public void setData(String dataNasc) throws ParseException{
    //        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    //        this.dataNasc =  new java.sql.Date(format.parse(dataNasc).getTime());
    //    }
}
