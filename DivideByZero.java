package Ch11;
import java.util.Scanner;
public class DivideByZero {
    public static void main(String[]args){
        try{
            Scanner s = new Scanner(System.in); 
            int a = 1, b=1;
            if(a>0&&b>0){
                System.out.println("Enter a and b values");
                a = s.nextInt();
                b = s.nextInt();
                System.out.println(a/b);   
            }
            else{
                System.out.println("Every number should be above 0.");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Exception has occured, check your input");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Calls the end");
        }
    }
}