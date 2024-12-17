package Ch11;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class BankAccountSerialize {
    public static void main(String[] args) {
        double balance;
        final int NUM_CUST = 5;
        Scanner s = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[NUM_CUST];
        try{
        for(int i = 0; i<NUM_CUST;i++){
            System.out.println("Enter balance for account" +(i+1) + ":");
            balance = s.nextDouble();
            accounts[i] = new BankAccount(balance);
        }
        System.out.println("all coustomer accounts created");
        }
        catch(NavigateStartingBalance e){
            System.out.println(e.getMessage());
        }
        try(FileOutputStream fileOutput = new FileOutputStream("CoustomerObjects.dat");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)){
                for(int i=0; i<NUM_CUST; i++){
                    objectOutput.writeObject(accounts[i]);
                    System.out.println("The serialized objects written in a file");
                }
            
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
    }
}