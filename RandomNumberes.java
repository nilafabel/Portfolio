import java.util.Random;
import java.util.Scanner;
public class RandomNumberes {
    //-sing line comment
    /*
     * document comment
     * muli line comments
     * flipAcoind() - void method prints either heads or tails
     */
    public static void main(String[]args)//void method with Arguments or args
    {
        int choice;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter yoyr choice ");
        System.out.println("1. Roll dice\n2. Flip a coin");
        choice = keyboard.nextInt();
        switch(choice)
        {
            case 1: rollDice();
                    break;
            case 2: flipAcoin();
                    break;
            default: System.out.println("Invalid choice");
                    break;
        }
    }
    public static void flipAcoin()//void methid without Arguments or agrs
    {
        //choice = 2; This line gives an error becasue the variable is a local to the main
        //And cannot be used ouside of the main. 
        int n1;
        Random random = new Random();
        n1 = random.nextInt(2)-1;
        if(n1==0)
            System.out.println("Tails!");
        else
            System.out.println("Heads!");
    }
    public static void rollDice()
    {
        int n1, n2, sum;
        Random random = new Random();
        n1 = random.nextInt(100)-50;//random numbers between -50 to + 49
        n2 = random.nextInt(100);
        System.out.printf("n1 = %d and n2 = %d and total = %d ", n1,n2,(n1+n2));
        String input;
        char userInput;
        int dice;
        final int SIDES = 6;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("\nRolling a dice... ");
            dice = random.nextInt(SIDES)+1;//+1 means it generates 1-6, instead of 0-5
            System.out.printf("It is %d. ",dice);
            System.out.println("\nDo you want to roll the dice again?" +
                                " y for yes and n for no");
            input= keyboard.nextLine();
            userInput = input.charAt(0);
        }while(userInput == 'y'|| userInput =='Y');
        System.out.println("Thanks for playing");
        }
    }