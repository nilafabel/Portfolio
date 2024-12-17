import java.util.Scanner;

public class StringManipulatorAS {
    public static void main (String[]args){
//Write a program that asks the user to enter the name of his or her favorite city. 
//Use a string variable to store the input. The program should display the following. 
//(Hint: Use string methods like toUpperCase )
        Scanner keyboard = new Scanner(System.in); {
        String city;
        System.out.println("What is your favorite city?");
        city = keyboard.nextLine();
        System.out.println("Number of characters in city is " + city.length());
        //The number of characters in the city name
        System.out.println("City in upper case " + city.toUpperCase());
        //The name of the city in all uppercase letters
        System.out.println("City in lower case " + city.toLowerCase());
        //The name of the city in all lowercase letters
        System.out.println("The 1st character of city is " + city.charAt(0));
        //The first character in the name of the city
            }
        }
    }