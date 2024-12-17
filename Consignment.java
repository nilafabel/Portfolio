package Exams;
import java.util.Scanner;
public class Consignment {
public static void main(String []args){
int weight = 0;                                        
double miles = 0.0;                                
double rate; 
int milesCalculator = (int)miles / 500;  
int milesTotal;                                  
Scanner input = new Scanner(System.in);        
System.out.println("What is the weight of the package?");//asks the user to enter the weight of a package, 
weight = input.nextInt();
System.out.println("How many miles are you shipping your package?");//asks the user to enter the milage 
miles = input.nextDouble();
milesTotal = (int)miles % 500;
    if (milesTotal == 0){
        if (weight <= 2){
            System.out.println("Total Shipping Cost is: $" + (milesCalculator * 1.10));
        }
    }
    else if (weight > 2 && weight <= 6){
        System.out.println("Total Shipping Cost is: $" + (milesCalculator * 2.20));//displays the shipping charges.
    }
    else if (weight > 6 && weight <= 10){
        System.out.println("Total Shipping Cost is: $" + (milesCalculator * 3.70));//displays the shipping charges.
    }
    else{
        System.out.println("Total Shipping Cost is: $" + (milesCalculator * 3.80));//displays the shipping charges.
    }
    if (milesTotal != 0){
        if (weight <= 2){
            System.out.println("Total Shipping Cost is: $" +(milesCalculator + 1) * 1.10);//displays the shipping charges.
        }
    }
    else if (weight > 2 && weight <= 6){
        System.out.println("Total Shipping Cost is: $" +(milesCalculator + 1) * 2.20);//displays the shipping charges.
    }
    else if (weight > 6 && weight <= 10){
        System.out.println("Total Shipping Cost is: $" +(milesCalculator + 1) * 3.70);//displays the shipping charges.
    }
    else{
        System.out.println("Total Shipping Cost is: $" +(milesCalculator + 1) * 3.80);//displays the shipping charges.
    }
}
}
/*
* The UPS Consignment Company charges the following rates:
* Weight of Package:                                             Rate per 500 Miles Shipped:
* 2 pounds or less                                                       $1.10
* Over 2 pounds but not more than 6 pounds                               $2.20
* Over 6 pounds but not more than 10 pounds                              $3.70
* Over 10 pounds                                                         $3.80

* The shipping charges per 500 miles are not prorated. 
* For example, if a 2-pound package is shipped 550 miles, the charges would be $2.20. 
* Write a program that asks the user to enter the weight of a package, 
* miles and then displays the shipping charges.
*/