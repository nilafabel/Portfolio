package Exams;
import java.util.Scanner;
public class ConsignmentChargesAS {
public static void main(String []args){
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");//asks the user to enter the weight of a package
        double weight = scanner.nextDouble();
        System.out.print("Enter the mile distance of the package that is being shiped: ");//asks the user to enter the milage
        int miles = scanner.nextInt();
        double rate = 0;
        if (weight <= 2) {
            rate = 1.10;
        } else if (weight <= 6) {
            rate = 2.20;
        } else if (weight <= 10) {
            rate = 3.70;
        } else {
            rate = 3.80;
        }
        int distance = miles / 500;
        if (miles % 500 > 0) {
            distance += 1;
        }
        double totalCost = rate * distance;
        System.out.println("The total shipping cost is: $" + totalCost + "0");//displays the shipping charges.
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