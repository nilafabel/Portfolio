package HWforCh5;
import java.util.Scanner;
public class RectangleAreaAS {
    public static void main (String[]args){
        double width = getWidth();
        double length = getLength();
        double area = getArea(width, length);
        displayData(width, length, area);
        
    }
    public static double getWidth(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the width of a rectangle:");
        double width = keyboard.nextDouble();
        return width;
    }
    public static double getLength(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length = keyboard.nextDouble();
        return length;
    }
    public static double getArea(double width, double length){
         double area = width * length;
         System.out.println("Your area is: " + area);
         return area;
    }
    public static void displayData(double width, double length, double area){
        System.out.println("The width of the rectangle is: " + width);
        System.out.println("The length of the rectangle is: " + length);
        System.out.println("The area of the rectangle is: " + area);
    }
}
/*
* Area of a Rectangle— The program will ask the user to enter the width and length of a rectangle, 
*   and then display the rectangle’s area. 
* The program calls the following methods, which have not been written:
* getLength—This method should ask the user to enter the rectangle’s length, 
*   and then return that value as a double.
* getWidth—This method should ask the user to enter the rectangle’s width, 
*   and then return that value as a double.
* getArea—This method should accept the rectangle’s length and width as arguments, 
*   and return the rectangle’s area. The area is calculated by multiplying the length by the width.
* displayData—This method should accept the rectangle’s length, width, and area as arguments, 
*   and display them in an appropriate message on the screen
*/