package Exam1;
//The RetailItem class stores data about a retail item for the RetailItem Exceptions programming challenge.
public class RetailItemAS{
   private String description;// Item description
   private int unitsOnHand;// Number of units on hand
   private double price;// Unit price
////////////////////////////////////////////////////////////
	//This constructor initializes the item's description with an empty string, units on hand to 0, and price to 0.0.
    public RetailItemAS(){
        this.description = "";
        this.unitsOnHand = 0;
        this.price = 0.0;
    }
////////////////////////////////////////////////////////////
	//This constructor initializes the item's description, units on hand, and price with values passed as arguments.
    public RetailItemAS(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
////////////////////////////////////////////////////////////
	//The setDescription method sets the item's description.
    public void setDescription(String description){
        this.description = description;
    }
////////////////////////////////////////////////////////////
	//The setUnitsOnHand method sets the item's number of units on hand.
    public void setUnitsOnHand(int unitsOnHand){
        if (unitsOnHand < 0){//Checks if units on hand is negative
            throw new NegativeUnitsException("Units on hand cannot be negative.");
        }
        this.unitsOnHand = unitsOnHand;
    }
////////////////////////////////////////////////////////////
	//The setPrice method sets the item's price.
    public void setPrice(double price){
        if (price < 0){//Checks if units on hand is negative
            throw new NegativePriceException("Price cannot be negative.");
        }
        this.price = price;
    }
////////////////////////////////////////////////////////////
	//The getDescription method returns the item's description.
    public String getDescription(){
        return description;
    }
////////////////////////////////////////////////////////////
	//The getUnitsOnHand method returns the item's number of units on hand.
    public int getUnitsOnHand(){
        return unitsOnHand;
    }
////////////////////////////////////////////////////////////
	//The getPrice method rerurns the item's price.
    public double getPrice(){
        return price;
    }
////////////////////////////////////////////////////////////
    //Exception class that can be instantiated and thrown when a negative number is given for the price. 
    public static class NegativePriceException extends RuntimeException{
        public NegativePriceException(String message){
            super(message);
        }
    }
////////////////////////////////////////////////////////////
    //Exception class that can be instantiated and thrown when a negative number is given for the units in hand. 
    public static class NegativeUnitsException extends RuntimeException{
        public NegativeUnitsException(String message){
            super(message);
        }
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