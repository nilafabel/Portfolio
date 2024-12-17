import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        
        int x,y,z;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter x and y values");
        x=keyboard.nextInt();
        y=keyboard.nextInt();
        //compare x and y, now assign 
        //bigger value to z
        // if(x<y)
        //    z=y;
        // else
        //    z=x;
        z=(x<y)?y:x;
        System.out.println(z);


    }
    
}
