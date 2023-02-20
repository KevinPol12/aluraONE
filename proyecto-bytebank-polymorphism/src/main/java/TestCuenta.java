
public class TestCuenta {
    
    public static void main(String[] args) {
        
        CuentaCorriente cc = new CuentaCorriente(2000, 1, 2);
        
        CuentaAhorros ca = new CuentaAhorros(50, 2, 3);
        
        cc.transfer(1000, ca);
        
        cc.saldo=0; 
        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
        
        
        
        
        
        
        
       
        
        
    }//End main
  

}//End class TestCuenta
