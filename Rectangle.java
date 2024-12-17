public class Rectangle
{
   private double length;//can also write: private double length, width;
   private double width;
   private final double WIDTH = 13.5;
   //Constructor
   public Rectangle(){//Constructer is always a public class and is not a return type. Only for initializing.
      length = 0.0;//also has to have the same class name as the class.
      width = 0.0;
   }//constructer implicitly call when you create a rectangle object 
   //Cannot be called late in the program, not a method, can't be called multiple times.
   public Rectangle(double l, double w){//also a constructer but w/ parameters
      this.length = l;
      this.width = w;
   }
   public void setLegthAndWidth(double l, double w){
      //double length = l; This creates a shadowing issue 
      //double width = w;
      this.length = l;
      this.width = w;
   }
   public Rectangle(Rectangle r){//constructor with an object
      this.length = r.length;
      this.width = r.width;
   }
   /////////////////////////////////
   public void setLength(double l){
      length = l;
   }
   public double getLength(){
      return length;
   }
   /////////////////////////////////
   public void setWidth(double w){
      width = w;
   }
   public double getwidth(){
      return width;
   }
   /////////////////////////////////
   //getArea Method overloading - 2 or more methods have a same name w/ a diff parameters(signature)
   public double getArea(){
      return width * length;
   }
   public double getArea(double l){
      return l*WIDTH;
   }
   public double getArea(double l, double w){
      return l*w;
   }
   public double getArea(Rectangle r){
      return r.length*r.width;
   }
}