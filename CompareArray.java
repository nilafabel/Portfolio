package Ch7;
import java.util.Scanner;
public class CompareArray {
    
    public static void main(String[] args) {
        final int SIZE=6;
        int array1[]=new int[SIZE];
        int array2[]=new int[SIZE];
        inputArray(array1, array2);
        compare(array1,array2,SIZE);

    }
    public static void inputArray(int [] array1,int []array2)
    {
        Scanner keyboard=new Scanner(System.in);
        for(int i=0;i<array2.length;i++)
        {
          System.out.println("Enter array1 values ");
          array1[i]=keyboard.nextInt();  
          System.out.println("Enter array2 values ");
          array2[i]=keyboard.nextInt();  
        }
    }
    public static void compare(int [] array1, int[] array2,int size)
    {
        int flag=0;
        for(int i=0;i<size;i++)
        {
            if(array1[i]==array2[i])
                        flag++;
        }
        if(flag==size)
        {
         System.out.println("All the elements in the arrays are same");
        }
        else
        {
            System.out.println("ALl Elements are not same ");
        }

    }
    
}
