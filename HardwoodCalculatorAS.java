package HWforCh8;
import java.util.Scanner;
class RoomDimension {
    private double length;//length field
    private double width;//width field
    public RoomDimension(double length, double width) {//constructor for RoomDimension with length and width
        this.length = length;                          //as the parameters
        this.width = width;
    }
    public double getArea() {//method that returns the area of the room. 
        return length * width;
    }
}
/////////////////////////////////////////////////////////
class RoomHardwood {
    private RoomDimension roomDimension;//RoomDimension object as a field.
    private double costPerSquareFoot;
    public RoomHardwood(RoomDimension roomDimension, double costPerSquareFoot) {//constructor for RoomHardwood
        this.roomDimension = roomDimension;                          //w/ cost and roomsimension as parameters
        this.costPerSquareFoot = costPerSquareFoot;
    }
    public double getTotalCost() {//field for the cost of the hardwood per square foot. 
        return roomDimension.getArea() * costPerSquareFoot;//calculates the cost
    }
}
////////////////////////////////////////////////////////
public class HardwoodCalculatorAS {
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//Scanner created for user input
        System.out.print("Enter the length of the room in feet: ");//asks for length input
        double length = scanner.nextDouble();//takes input
        System.out.print("Enter the width of the room in feet: ");//asks for width input
        double width = scanner.nextDouble();//takes input
        System.out.print("Enter the price per square foot: $");//asks for price per sqare foot
        double costPerSquareFoot = scanner.nextDouble();//takes input
        RoomDimension roomDimension = new RoomDimension(length, width);//creates a roomDimension object 
        RoomHardwood roomHardwood = new RoomHardwood(roomDimension, costPerSquareFoot);//creates roomHardwood object
        double totalCost = roomHardwood.getTotalCost();//calculates the cost of wood
        System.out.printf("The total cost of hardwood for the room is: $%.2f%n", totalCost);//print out the cost
    }
}
/*
 * Please write below java programs and submit the programs with proper naming conventions.
 * Hardwood Calculator
 * The great floor hardwood company has asked you to write an application that calculates 
 *      the price of hardwood for rectangular rooms. 
 * To calculate the price, you multiply the area of the floor (width times length) by the 
 *      price per square foot of hardwood. 
 * For example, the area of floor that is 12 feet long and 10 feet wide is 120 square feet. 
 * To cover that floor with hardwood that costs $8 per square foot would cost $960.
 * (12 *10*8=960.)
 * First, you should create a class named RoomDimension that has two fields: 
 *      one for the length of the room and one for the width. 
 * The RoomDimension class should have a method that returns the area of the room. 
 * (The area of the room is the room’s length multiplied by the room’s width.) 
 * Next you should create a RoomHardwood class that has a RoomDimension object as a field. 
 * It should also have a field for the cost of the hardwood per square foot. 
 * The RoomHardwood class should have a method that returns the total cost of the hardwood.
 * Once you have written these classes, use them in an application that asks the user to enter 
 *      the dimensions of a room and the price per square foot of the desired hardwood. 
 * The application should display the total cost of the hardwood.
 */