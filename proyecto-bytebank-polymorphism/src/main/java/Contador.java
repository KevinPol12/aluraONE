
public class Contador extends Funcionario {
    
    public Contador(String nombre, String documento, double salario) {
        super(nombre, documento, salario);
    }
      
   
    @Override
    public double getBonificacion(){
        return 200;
            
    }//End getBonificacion


}// End class Contador