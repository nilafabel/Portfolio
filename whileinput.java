package Ch4;
import java.util.Scanner;

public class whileinput {
 public static void main(String[] args) {
    int n=0;
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter a number between 1 to 100");
    n=keyboard.nextInt();
    while(n<1 || n>100)
    {
        System.out.println("Wrong number entered please reenter");
        System.out.println("Enter a number between 1 to 100");
         n=keyboard.nextInt();
    }
    System.out.println("You are good for the next steps");
    
 }   
}
