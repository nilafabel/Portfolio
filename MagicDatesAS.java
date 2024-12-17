import java.util.Scanner;
public class MagicDatesAS {
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input your birth month in numeric form:");//Asks the user to enter a month.
        int month;
        month = keyboard.nextInt();
        System.out.println("Input your birth day:");//Asks the user to enter a day.
        int day;
        day = keyboard.nextInt();
        System.out.println("Input your two-digit birth year:");//Asks the user to enter a year.
        int year;
        year = keyboard.nextInt();
        if(month*day==year){//Does the month times the day is equal to the year?
            System.out.println("The date is magic;)");//Displays a message saying the date is magic.
        }
        else{
            System.out.println("The date is not magic;(");//Displays a message saying the date is not magic.
        }
    }
}