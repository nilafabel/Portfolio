package Ch7;
import java.util.Scanner;
public class SalesAS {
    public static void main(String[]args){
        final int ONE_WEEK = 7;
        double[]sales = new double[ONE_WEEK];
        getValues(sales);
        SalesDataAS week = new SalesDataAS(sales);
        System.out.printf("Total Sales:   $%,.2f\n", week.getTotal());
        System.out.printf("Average Sales: $%,.2f\n", week.getAverage());
        System.out.printf("Highest Sales: $%,.2f\n", week.getHighest());
        System.out.printf("Lowest Sales:  $%,.2f\n", week.getLowest());
    }
    private static void getValues(double[]array){
        Scanner keyboard = new Scanner (System.in);
        for(int i = 0; i<array.length;i++){
            System.out.print("Enter the sales for day " + (i+1) + ": ");
            array[i] = keyboard.nextDouble();
        }
    }
}
