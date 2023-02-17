
public class PruebaMetodos {

    public static void main(String[] args) {
        
        Cuenta miCuentaK = new Cuenta();
        miCuentaK.saldo = 500;
        System.out.println("Initial balance on Kevin's account is "+
                miCuentaK.getSaldo());
        
        System.out.println(miCuentaK.saldo);
        
        Cuenta cuentaJimena = new Cuenta();
        cuentaJimena.setDeposit(1000);
        System.out.println("Jimena's account on the other hand just got a "
                + " transfer for a thousand dollars, being her new balance: "
        +cuentaJimena.getSaldo());
        
        cuentaJimena.transfer(200, miCuentaK);
        
        System.out.println("Now cuenta K has "+miCuentaK.getSaldo()
        + " and Cuenta Jimena has "+cuentaJimena.getSaldo());
        
    }
    
}
