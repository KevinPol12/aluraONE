
public class Test {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        Administrador admin1 = new Administrador("Kevin", "a5125adf1", 20_000);
        Gerente gerente1 = new Gerente("Wilmer", "a23325adf1", 19_000);
        
        cliente1.setClave("Kevin es Tigre");
        admin1.setClave("Kevin es Tigre");
        gerente1.setClave("Kevin es Tigre");
        
        try{
        
        System.out.println(1/0);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        
        SistemaInterno loginSistema = new SistemaInterno();
        
        loginSistema.autentica(cliente1);
        loginSistema.autentica(admin1);
        loginSistema.autentica(gerente1);
        
        System.out.println("El salario de "+admin1.getNombre()+
                                        " es "+admin1.getSalario());
        
        
        
    }//End main

    

}// End class
