
public class Gerente extends Funcionario {
    
    public Gerente(String nombre,String documento,double salario){
        super(nombre,documento,salario);        
    }

    private String clave;

    public void setClave(String clave){
        this.clave=clave;
    }
    
    public boolean autenticar(String clave){
        return this.clave == clave;
        
    }
    
    public double getBonificacion(){
        return super.getSalario();
            
    }//End getBonificacion
   
}//End class Gerente
