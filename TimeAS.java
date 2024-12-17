import java.util.Scanner;
public class TimeAS {
    public static void main(String[]args){
        int seconds; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of seconds:");//Asks the user to enter a number of seconds. 
        seconds = input.nextInt();
        if(seconds >= 60){
           int minutes = seconds/60;//There are 60 seconds in a minute. 
           System.out.println("You entered " + minutes + " minutes.");
           //Program should display the number of minutes in that many seconds.
        }
        if(seconds >= 3600){
                int hours = seconds/3600;//There are 3,600 seconds in an hour. 
                System.out.println("Your entered " + hours + " hours.");
                //Program should display the number of hours in that many seconds.
        }
        if (seconds >= 86400){
                int days = seconds/ 86400;//There are 86,400 seconds in a day.
                System.out.println("You entered " + days + " days.");
                //Program should display the number of days in that many seconds.
        }
    }
}