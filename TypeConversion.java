import java.util.Scanner; 
public class TypeConversion {
    public static void main (String[]args){
        Scanner keyboard = new Scanner(System.in);

        float a=5.2F; 
        System.out.println("input a float value");
        a = keyboard.nextFloat();

        int b=2, result=0;
        System.out.println("inpit a int value");
        b = keyboard.nextInt();
        result = (int)a/b; 
        System.out.println(result);
        
        
    }
}
