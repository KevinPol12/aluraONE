
public class CreaCuenta {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        
        primeraCuenta.saldo = 200;
        System.out.println(primeraCuenta.saldo);
        
        primeraCuenta.saldo += 100;
        System.out.println(primeraCuenta.saldo);
    }
    
}
