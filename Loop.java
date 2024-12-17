package Ch4;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args)
    {
       // int n=1;
        int num,i=1,result=0;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter a number ");
        num=keyboard.nextInt();
        //logic to generate a multiplication table
        while(i<=12)//pretest loop
        {
            result=num*i;
            System.out.printf
               ("%d * %d = %d \n",num,i,result);
            ++i;
        }

    }
    
}
