
public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(double saldo, int agencia, int numero) {
        super(saldo, agencia, numero);
    }

    @Override
    public void setDeposit(double depo) {
        this.saldo += depo;
    }

    

}
