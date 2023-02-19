
public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(double saldo, int agencia, int numero) {
        super(saldo, agencia, numero);
    }
    
    @Override
    public void saca(double cantidad){
        double tFee=0.2;
        super.saca(cantidad+tFee);
        System.out.println("Transfer fee is "+tFee+" dollars.");
        
    }

    @Override
    public void setDeposit(double depo) {
        this.saldo += depo;
    }
    

    

}
