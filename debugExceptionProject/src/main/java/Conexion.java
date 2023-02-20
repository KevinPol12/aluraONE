
public class Conexion implements AutoCloseable {
    
    public Conexion(){
        System.out.println("Conectando");
    }//End conectar
    
    public void leerDatos(){
        
        System.out.println("Leyendo datos");
        throw new IllegalStateException("Gotha");
        
    }//End leyendo

    public void cerrar(){
        
        System.out.println("Cerrando Conexion");
        
        
    }//End leyendo

    @Override
    public void close() throws Exception {
        cerrar();
    }
    
    

}// End class
