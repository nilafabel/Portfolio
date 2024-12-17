package Ch4;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        final double MAXTEMP=102.5;
        double temp=0;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("What is the temp? ");
        temp=keyboard.nextInt();
        while(temp>MAXTEMP)
        {
            System.out.println("Temp is too high, decrease the thermostat");
            System.out.println(" Please check back after 5 mins");
            System.out.println("What is the temp now ");
            temp=keyboard.nextInt();
        }
        System.out.println
                 ("Temp is in limit check back after 15 mins");
    }
    
}
