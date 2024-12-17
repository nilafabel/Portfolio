package Exams;
import java.util.Scanner;
public class Big {
    public static void main(String[] args){ 
    int number;
    int largestNumber = Integer.MIN_VALUE;
    int smallestNumber = Integer.MAX_VALUE;
    Scanner keyboard = new Scanner(System.in); 
        while (true) {
            System.out.print("Enter an integer or enter -99 to stop: ");//Lets the user enter a series of integers. 
            number = keyboard.nextInt();
            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            if (number == -99) { 
                break;
            }
        }
        if (largestNumber == Integer.MIN_VALUE || smallestNumber == Integer.MAX_VALUE) {}
            else {
                System.out.println("Largest number entered: " + largestNumber);
                System.out.println("Smallest number entered: " + smallestNumber);//Displays the largest and smallest numbers entered.
            }
    }   
}
/* 
* Write a program with a loop that lets the user enter a series of integers. 
* The user should enter -99 to signal the end of the series. 
* After all the numbers have been entered, 
* the program should display the largest and smallest numbers entered.
*/