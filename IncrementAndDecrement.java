package Ch4;
import java.util.Scanner;
public class IncrementAndDecrement{
public static void main(String []args){
    char input;
    String temp;
    int points = 0;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your choice y or n");
    System.out.println("y increass a point by 1 and n decrease point by 1");

    System.out.println("Are you a high school graduate?");
    temp=keyboard.nextLine();
    input=temp.charAt(0);
    if(input=='y'||input== 'Y')
        //points=points+1;
        ++points;
    else 
        //points=points-1;
        --points;

    System.out.println("Are you planning to work?");
    temp=keyboard.nextLine();
    input=temp.charAt(0);
    if(input=='y'||input== 'Y')
        //points=points+1;
        points++;
    else 
        //points=points-1;
        points--;
    
    System.out.println("Do you have 3.5 GPA?");
    temp=keyboard.nextLine();
    input=temp.charAt(0);
    if(input=='y'||input== 'Y')
        points=points+1;
    else 
        points=points-1;

    System.out.println("Do you have a drivers licence?");
    temp=keyboard.nextLine();
    input=temp.charAt(0);
    if(input=='y'||input== 'Y')
        points=points+1;
    else 
        points=points-1;

    System.out.println("Yout points are "+ points);
    }
}