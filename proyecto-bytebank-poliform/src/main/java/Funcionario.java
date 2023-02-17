
public class Funcionario {
    
    private String nombre;
    private String documento;
    private double salario;
    
    public Funcionario(String nombre,String documento,double salario){
        
        this.nombre=nombre;
        this.documento=documento;
        this.salario=salario;
        
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

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getBonificacion(){
        return salario *0.1;
    }


    
    
    
}//End class funcionario
