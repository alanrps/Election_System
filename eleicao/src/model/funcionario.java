package model;

import java.text.ParseException;

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
}
