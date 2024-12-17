package Ch4;
import java.util.Scanner;

public class Sentinals {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int i=0;
        while(i!=-1){
            System.out.println("Enter -1 to terminate the loop");
            i=keyboard.nextInt();
            if(i==20)
                //break;  
                continue; 
           System.out.println("i is "+i);             
        }
    }
}

