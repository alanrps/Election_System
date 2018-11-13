package model;

/**
 *
 * @author Henri
 */
public class funcionario extends Pessoa{
    public String cargo;
    
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String Cargo) {
        this.cargo = Cargo;
    }
}
