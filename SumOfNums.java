package Ch7;
import java.util.Scanner;
public class SumOfNums{
    public static void main (String[]args){
        //numbers array
        //[] means dimension
        //int[]numbers = {5,7,23,43,36,78,56,89,99,'v'};
        int[]numbers = new int[10];
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        int size = numbers.length;//length returns size of the array (how many #'s there are in the array)
        System.out.println("The size of the array is " + size + ".");
        //give input to the arrat elements
        for(int i=0;i<size; i++){
            System.out.println("Enter element " + (i+1));
            numbers[i]= keyboard.nextInt();
        }
        System.out.println("Last array element value is " + numbers[size-1] + ".");//to access each element (Prints out the 4th value)
        // array index starts from 1,2,3,4,5,6,7 (thats why you do [size-1])
        for(int i=0; i<size; i++){ 
            sum = sum+numbers[i];
            //System.out.println(numbers[i]); //Prints out every number 
        }
        System.out.println("The sum of elements is " + sum + ".");
        sum = 0;
        for(int i: numbers){
            sum = sum+i;
        }
        System.out.println("The sum of elements is " + sum + ".");
    }
}