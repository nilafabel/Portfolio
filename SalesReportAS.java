package HWforCh5;
import java.util.Scanner;
import java.io.*;
public class SalesReportAS {
    public static void main (String[]args)throws IOException{
        final int NUM_DAYS = 30;
        String fileName;
        double totalSales;
        double averageSales;
        fileName = getFileName();
        totalSales = getTotalSales(fileName);
        averageSales = totalSales/NUM_DAYS;
        displayResults(totalSales, averageSales);
    }
    public static String getFileName(){
        String fileName;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        fileName = keyboard.nextLine();
        keyboard.close();
        return fileName;
    }
    public static double getTotalSales(String fileName)throws IOException{
        double total = 0.0;
        double sales;
        try (Scanner inputFile = new Scanner(new File(fileName))){
            while (inputFile.hasNext()){
                sales = inputFile.nextDouble();
                total+=sales;
            }

        }
        return total;
    }
    public static void displayResults(double total, double avg){
        System.out.printf("Total sales: $%,.2f\n", total);
        System.out.printf("Average daily sales: $%,.2f\n", avg);
    }
}
/*
*Please read 5.5 Problem solving with methods and redo the salesreport.java 
* and submit it with you first and last initials.
*/