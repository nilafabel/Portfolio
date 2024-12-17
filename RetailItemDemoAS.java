package Exam1;
import java.util.Scanner;
//This program demonstrates a solution to the RetailItem Exceptions programming challenge.
public class RetailItemDemoAS{
   public static void main(String[] args){
      String description;// To hold the item description
      int units;// To hold the item units
      double price;// To hold the item price
      boolean goodInput;// Flag for validating input
////////////////////////////////////////////////////////////
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
////////////////////////////////////////////////////////////
      // Create a RetailItem object....
      RetailItemAS item = new RetailItemAS();
////////////////////////////////////////////////////////////
      // Get the item description.
      System.out.print("Enter item description: ");
      description = keyboard.nextLine();
      item.setDescription(description);
////////////////////////////////////////////////////////////
      // Get the item units.
      goodInput = false;
        while (!goodInput){
            try{
                System.out.print("Enter number of units: ");
                units = keyboard.nextInt();
                item.setUnitsOnHand(units);
                goodInput = true;
            } 
            catch (RetailItemAS.NegativeUnitsException e){
                System.out.println("Error: " + e.getMessage());
                keyboard.nextLine();
            }
        }
////////////////////////////////////////////////////////////
        // Get the item price.
        goodInput = false;
        while (!goodInput){
            try{
                System.out.print("Enter price of item: ");
                price = keyboard.nextDouble();
                item.setPrice(price);
                goodInput = true;
            } 
            catch(RetailItemAS.NegativePriceException e){
                System.out.println("Error: " + e.getMessage());
                keyboard.nextLine();
            }
        }
////////////////////////////////////////////////////////////
        // Display the info for item.
        System.out.println("\nItem Information:");
        System.out.println("Description: " + item.getDescription());
        System.out.println("Units on Hand: " + item.getUnitsOnHand());
        System.out.println("Price: $" + item.getPrice());
    }
}
/*
 * RetailItem Class – Handling Exceptions (40pts)
 * Refer to the attached pseudocode RetailItem that holds data about an item in a retail store. 
 * The class should have the following fields:
 * Description – String object that holds a description of the item (Example – Jacket, Designer Jeans, Shirt…)
 * UnitsOnHand – int variable that holds the number of units currently in the inventory.
 * Price – double variable that holds the item’s retail price
 * Write a constructor that accepts arguments for each field, appropriate mutator methods that store values 
 * 		in these fields, accessor methods that return the values in these fields. 
 * Write an exception class that can be instantiated and thrown when a negative number is given for the price. 
 * Write another exception class that can be instantiated and thrown when a negative number is given for the 
 * 		units in hand. 
 * Demonstrate the exception class in a program.
 */