package model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Henri
 */
public class funcionario extends Pessoa{
    private String cargo;
    
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
