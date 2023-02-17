
public class Cuenta {

    private double saldo;
    private int agencia, numero;
    public Cliente titular;
    
    public Cuenta(double saldo, int agencia, int numero){
        this.saldo=saldo;
        this.agencia=agencia;
        this.numero=numero;
        this.titular=new Cliente();
    }
    
    double getSaldo(){
      return saldo;
    }
    
    public void setDeposit(double depo){
        this.saldo += depo;
    }
    
    public int getAgencia(){
        return agencia;
    }
    
    public void setAgencia(int age){
        this.agencia = age;
    }

    public boolean transfer(double amount, Cuenta cuenta){
        
        if(this.saldo >= amount){
            this.saldo -= amount;
            cuenta.setDeposit(amount);
            System.out.printf("The transfer of %.1f%s%n",amount,
                    " was successful.");
            return true;
        }else{
            System.out.println("Transfer was not successful due"
                    + " to insufficient funds.");
            return false;
        }
    }//End boolean tranfer
    
    public void getTitular(){
        
    }
    

    
    
    
    
}//End Class Cuenta
