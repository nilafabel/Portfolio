import java.util.Scanner;
public class MiniCal {
    public static void main(String[]args)
    {
        initcall();
    }
    public static void initcall()
    {
        int a,b;
        Scanner input = new Scanner (System.in);
        System.out.println("Input a and b with an integer:");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Output is displaying below.");
        add(a,b);//Method call with parameters
        sub(a,b);
        mul(a,b);
        div(a,b);
    }
    public static void add(int a, int b)//You must define every argument type; cannot do (int a, b)
                                        //void method with arguments or args
    {
        System.out.println("Addition : " + (a+b));   
    }
    public static void sub(int a, int b)
    {
        a = 800; //changing in a value 'a' and 'b' will be applicable only for sub method.
        b = 30;
        System.out.println("Substraction : " + (a<b?b-a:a-b));  
    }
    public static void mul(int a, int b)
    {
        System.out.println("Multiplication : " + (a*b));
    }
    public static void div(int a, int b)
    {
        System.out.println("Division : " + (a<b?b/a:a/b));
    }
}