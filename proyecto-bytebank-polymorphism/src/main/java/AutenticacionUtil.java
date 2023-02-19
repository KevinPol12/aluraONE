
public class AutenticacionUtil {

    private String clave;
    
    public void setClaveUtil(String clave){
    this.clave = clave;
}
    
    public boolean AutenticaUtil(String clave){
        
       return this.clave==clave;
       
    }//End boolean AutenticaUtil
    

}//End class AutenticacionUtil
