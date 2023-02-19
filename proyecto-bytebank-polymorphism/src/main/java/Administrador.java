
public class Administrador extends Funcionario implements Autenticable{

    private AutenticacionUtil util;
    
    public Administrador(String nombre, String documento, double salario) {
        super(nombre, documento, salario);
        this.util = new AutenticacionUtil();
    }
    
    
    @Override
    public double getBonificacion() {
        return super.getSalario();
    }

    @Override
    public void setClave(String clave) {
        util.setClaveUtil(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return util.AutenticaUtil(clave);
    }
    
    
    

}//End administrador
