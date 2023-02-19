
public class Gerente extends Funcionario implements Autenticable {
    
    public AutenticacionUtil util ;
    
    public Gerente(String nombre,String documento,double salario){
        super(nombre,documento,salario);        
        util = new AutenticacionUtil();
    }

    @Override
    public void setClave(String clave){
        util.setClaveUtil(clave);
    }
    
    @Override
    public boolean iniciarSesion(String clave){
        return util.AutenticaUtil(clave);
        
    }
    
    @Override
    public double getBonificacion(){
        return super.getSalario();
            
    }//End getBonificacion
   
}//End class Gerente
