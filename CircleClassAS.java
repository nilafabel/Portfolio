package HWforCh6and7;
import java.util.Scanner;
public class CircleClassAS {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the circle radius?");//asks the user for the circle’s radius
        double radius = keyboard.nextDouble();
        CircleClassAS circle = new CircleClassAS(radius);//a Circle object
        System.out.println("Area of the circle: " + circle.getArea());//reporting the circle’s area 
        System.out.println("Diameter of the circle: " + circle.getDiameter());//reporting the circle’s diameter
        System.out.println("Circumference of the circle: " + circle.getCircumference());//reporting the circle’s circumference
    }
    private double radius;
    final private double PI = 3.14159;
    public CircleClassAS(double radius) {//Constructor. Accepts the radius of the circle as an argument.
        this.radius = radius;
    }
    public CircleClassAS() {//Constructor. A no-arg constructor that sets the radius field to 0.0.
        radius = 0.0;
    }
    public void setRadius(double radius) {//setRadius. A mutator method for the radius field.
        this.radius = radius;
    }
    public double getRadius() {//getRadius. An accessor method for the radius field.
        return radius;
    }
    public double getArea() {//area. Returns the area of the circle
        double area = PI * radius * radius;
        return area;
    }
    public double getDiameter() {//diameter. Returns the diameter of the circle
        double diameter = radius * 2;
        return diameter;
    }
    public double getCircumference() {//circumference. Returns the circumference of the circle
        double circumference = 2 * PI * radius;
        return circumference;
    }
}
/*
 * Write a circle class that has following fields:
 * radius: a double
 * PI: a final double initialized with the value 3.14159
 * The class should have the following methods:
    * Constructor. Accepts the radius of the circle as an argument.
    * Constructor. A no-arg constructor that sets the radius field to 0.0.
    * setRadius. A mutator method for the radius field.
    * getRadius. An accessor method for the radius field.
    * area. Returns the area of the circle, which is calculated as area = PI * radius * radius
    * diameter. Returns the diameter of the circle, which is calculated as diameter = radius * 2
    * circumference. Returns the circumference of the circle, which is calculated as circumference = 2 * PI * radius
* Write a program that demonstrates the Circle class by asking the user for the circle’s radius, 
    creating a Circle object, and then reporting the circle’s area, diameter, 
    and circumference should have the correct filename matching the name of 
    the class within the file and a .java file extension.
 */