


public class Cuenta {

    public double saldo;
    int agencia, numero;
    String titular;
    
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
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String name){
        this.titular = name;
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
    }
    

    
    
    
    
}//End Class Cuenta
