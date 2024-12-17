package Ch7;
import java.util.Scanner;
public class ChangeA {
    public static void main(String[] args) {
        int a=0;
        inputA(a);
        changeA(a);
        System.out.println(a);
    }
    public static void inputA(int a)
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Input a value ");
        a=keyboard.nextInt();
        System.out.println("input A "+a);
    }
    public static void changeA(int a)
    {
        a=200;
        System.out.println("In changeA method "+a);
    }

    
}
