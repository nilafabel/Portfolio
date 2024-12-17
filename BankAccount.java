package Ch11;
import java.io.Serializable;
public class BankAccount implements Serializable{
    private double balance;
    public BankAccount(){
        balance = 0.0;
    }
    public BankAccount (double balance)throws NavigateStartingBalance {
        if(balance<0){
            throw new NavigateStartingBalance(balance);
        }
        this.balance = balance;
    }
    public void deposit(double amount)throws NavigateStartingBalance {
        if(amount<0){
            throw new NavigateStartingBalance();
        }
        balance = balance+amount;
    }
    public void withdraw(double amount){
        balance = balance-amount; 
    }
    public double getBalance(){
        return balance;
    }
}