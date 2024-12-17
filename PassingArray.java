package Ch7;
import java.util.Scanner;
public class PassingArray {
    public static void main(String[] args) {
        double []wages=new double[6];
        inputArray(wages,wages.length);
        TotalWage(wages, wages.length);
    }
    public static void inputArray(double []wages,int size)
    {
        Scanner keyboard=new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter wages ");
            wages[i]=keyboard.nextDouble();
        }
    }
    public static void TotalWage(double []wages,int size)
    {
        double sum=0;
        for(int i=0;i<size;i++)
        {
           sum+=wages[i];
        }
        System.out.println("Total Wage "+sum);

    }
    
}
