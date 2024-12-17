package Ch7;
import java.util.Scanner;
public class Highest {
    
     public static void main(String[] args) {
        final int SIZE=6;
        int array1[]=new int[SIZE];
        inputArray(array1);
        findMax(array1);

    }
    public static void inputArray(int [] array1)
    {
        Scanner keyboard=new Scanner(System.in);
        for(int i=0;i<array1.length;i++)
        {
          System.out.println("Enter array1 values ");
          array1[i]=keyboard.nextInt();  
          
        }
    }
    public static void findMax(int [] array1)
    {
        int Highest=0;
        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]>Highest)
                        Highest=array1[i];
        }
        for(int i:array1)
        {
            System.out.println(i+"   ");
        }
        System.out.print("The highest value is "+Highest);
    }
}