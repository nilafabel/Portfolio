package Ch7;
import java.util.Scanner;
public class Students {
    public static void main (String[]args){
        String[]students = new String[5];
        final int SIZE = students.length;
        Scanner input = new Scanner(System.in);
         for(int i=0; i<students.length; i++){
            System.out.println("Input student name:"+ (i+1)+ " name");
            students[i] = input.next();
        }
        //Say hello and welcome to every student
        for(int i=0;i<SIZE;i++){
            System.out.println("Hello, Welcome " + students[i]);
        }
        //alternative loop designed fro the arrays
        for(String i:students){
            System.out.println("Hello, Welcome " + i);
        }
    }
}
//take student name so a string 
//read 5 names
//print out welcome student name 