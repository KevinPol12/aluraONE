
public class Cliente implements Autenticable {

    private String nombre;
    private String documento;
    private String telefono;
    
    public AutenticacionUtil util;
    
    public Cliente(){
        this.util= new AutenticacionUtil();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String doucmento) {
        this.documento = doucmento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void setClave(String clave) {
        util.setClaveUtil(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return util.AutenticaUtil(clave);
    }//End boolean iniciar Sesion
    
    
    
    
}//End class Cliente
