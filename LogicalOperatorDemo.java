import java.util.Scanner;
public class LogicalOperatorDemo{
public static void main(String[]args){
    //Load Qualifier
    //salary should be more than 50000
    //years of eqperience should be more than 2 
    Scanner keyboard = new Scanner(System.in);
    final int MINEEXP = 2;
    final double MINSAL = 50000;
    String name;
    double salary;
    int experience;
    System.out.println("Welcome to Loan Qualifier check.");
    System.out.println("Enter your name: ");
    name = keyboard.nextLine();
    System.out.println("Enter your years of experience ");
    experience = keyboard.nextInt();
    System.out.println("Enter your salary:");
    salary = keyboard.nextDouble();
    System.out.println("---validating your input---");
    if(salary>=MINSAL && experience>=MINEEXP)
        System.out.println(name + " You are qualified to apply for a loan.");
    else
        System.out.println("Sorry " + name + "you are not qualified.");
}
}