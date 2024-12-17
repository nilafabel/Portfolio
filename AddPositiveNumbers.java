package Ch4;
import java.util.Scanner;
public class AddPositiveNumbers {
    public static void main(String[]args){
        int n, sum=0;
        Scanner keyboard = new Scanner(System.in);
        do{
            //System.out.println("The number in invalid");
            System.out.println("Enter any positive number");
            n=keyboard.nextInt();
            if(n>0)
                sum+=n;
            System.out.println("Positive number sum is "+sum);
        }while(n>0);
    }
}
