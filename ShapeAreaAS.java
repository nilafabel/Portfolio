package HWforCh8;
public class ShapeAreaAS{
    public static void areaCircle(double r){//static method that passes r as the parameter
        double circleArea = Math.PI*r*r;//calculates the area for circle
        System.out.printf ("\n%.2f", circleArea);//prints out the area 
    }
    public static void areaCircle(){//overloaded static method that passes no parameter
        double r = 0;//r is defined as 0
        double circleArea = Math.PI*r*r;//calculates the area for circle
        System.out.printf ("\n%.2f", circleArea);//prints out the area 
    }
////////////////////////////////////////////////////////////////
    public static void areaRectangle(double w,double l){//static method that passes w and l
        double rectArea = w*l;//calculates the area for rectangle
        System.out.printf ("\n%.2f", rectArea);//prints out the area 
    }
    public static void areaRectangle(double l){//overloaded static method that passes l as a parameter
        double w = 0;//w is defined as 0
        double rectArea = w*l;//calculates the area for rectangle
        System.out.printf ("\n%.2f", rectArea);//prints out the area 
    }
////////////////////////////////////////////////////////////////
    public static void areaCylinder(double r,double h){//static method that passes r and h
        double cyliArea = 2 * Math.PI * r * (h+r);//calculates the area for cylinder
        System.out.printf ("\n%.2f\n", cyliArea);//prints out the area 
    }
    public static void areaCylinder(){//overloaded static method that passes no pararmeters
        double r = 0,h = 0;//defines double r and h as a 0 
        double cyliArea = 2 * Math.PI * r * (h+r);//calculates the area for cylinder
        System.out.printf ("\n%.2f", cyliArea);//prints out the area 
    }
    public static void main(String args[])//main method
    {
        ShapeAreaAS s1= new ShapeAreaAS();//object s1 created
        s1.areaCircle(4);//calls the areaCircle method 
        s1.areaRectangle(30,5);//calls the RectangleCircle method 
        s1.areaCylinder(18,9);//calls the CylinderCircle method 
    }
}
/* 
 * Write a class that has two overloaded static methods for calculating the areas of the following geometric shapes:
 *      circles
 *      rectangles
 *      cylinder
 * Here are the formulas for calculating the area of the shapes.
 * Area of a circle: Area=pr2. Where p is Math.PI and r is the circle’s radius
 * Area of a rectangle: Area=Width*Length
 * Area of a cylinder: Area=pr2h. Where p is Math.
 * PI, r is the radius of the cylinder’s base, and h is the cylinder’s height because 
 *      the two methods are to be overloaded, they should each have the same name, 
 *      but different parameter lists. 
 * Demonstrate the class in a complete program.
 */