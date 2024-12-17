import java.util.Scanner;
//step 1 = import libraries
//create object for scanner class
//use object to read input from the keyboard
public class StringExamples {
    public static void main (String []args){

        Scanner keyboard = new Scanner(System.in);
        //Scanner is a class, we created a keyboard object to make use of its functionality
        String name;
        System.out.println("Enter a string");
        name = keyboard.nextLine();
        System.out.println("Langth is" + name.length());
        System.out.println("Upper case " + name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("The 9th index location " + name.charAt(5));

    }
    
}
