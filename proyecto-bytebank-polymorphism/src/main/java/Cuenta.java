
public abstract class Cuenta {

    protected double saldo;
    private int agencia, numero;
    private Cliente titular = new Cliente();
    
    private static int total;
    
    public Cuenta(double saldo, int agencia, int numero){
        this.saldo=saldo;
        this.agencia=agencia;
        this.numero=numero;
        this.titular=new Cliente();
    }
    
    double getSaldo(){
      return saldo;
    }
    
    public abstract void setDeposit(double depo);
    
    public void saca(double cantidad){
        this.saldo-=cantidad;
    }
    
    public int getAgencia(){
        return agencia;
    }
    
    public void setAgencia(int age){
        this.agencia = age;
    }

    public boolean transfer(double amount, Cuenta cuenta){
        
        
        if(this.saldo >= amount){
            this.saca(amount);
            cuenta.setDeposit(amount);
            System.out.printf("The transfer of %.1f%s%n",amount,
                    " was successful.");
//            System.out.printf("There is now a deduction of %.1f%s%n",
//                    tFee," dollars.");
            return true;
        }else{
            System.out.println("Transfer was not successful due"
                    + " to insufficient funds.");
            return false;
        }
    }//End boolean tranfer
    

    

    
    
    
    
}//End Class Cuenta
