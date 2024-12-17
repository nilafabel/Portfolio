package Exams;
import java.util.Scanner;
public class BigsmallAS {
    public static void main(String[] args) {
		int number; 		
		int smallestNumber;
        int largestNumber = 0;
		Scanner input = new Scanner(System.in);			
		System.out.print("Enter a number or Enter -99 to stop.");//lets the user enter a series of integers		
		number = input.nextInt();
		smallestNumber = number;
		while(number != -99){							
			System.out.print("Enter a number: ");//lets the user enter a series of integers
			number = input.nextInt();
			if(number != -99){
				if (number > smallestNumber){
					largestNumber = number;
				}
				else{
					smallestNumber = number;					
				}		
			}
		}
		System.out.println("Smallest value is " + smallestNumber + " and the largest value is " + largestNumber + ".");//displays the largest and smallest numbers entered.
	}
}       
/* 
* Write a program with a loop that lets the user enter a series of integers. 
* The user should enter -99 to signal the end of the series. 
* After all the numbers have been entered, 
* the program should display the largest and smallest numbers entered.
*/