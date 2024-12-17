import java.util.Scanner;

public class Localvariable {
    public static void main(String[] args) 
    {
        begin();
    }
    public static void begin()
    {
        int a, b,option;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter a and b values ");
        a=keyboard.nextInt();
        b=keyboard.nextInt();
        System.out.println("----------------");
        System.out.println("Choose the following option");
        System.out.println("1: Addition");
        System.out.println("2: Substraction");
        System.out.println("3: Division");
        System.out.println("4: Multiplication");
        switch (option)
            {
                case 1: add(a, b);
                         break;
                case 2: sub(a, b);
                         break;
                case 3: division(a, b);
                         break;
                case 4: mul(a, b);
                        break;
               default:System.out.println("Wrong choice");
                        break;
            }
    }
    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void sub(int a,int b)
    {
        if(a>b)
            System.out.println(a-b);
        else
            System.out.println(b-a);
    }
    public static void division(int a,int b)
    {
        if(a>b)
            System.out.println(a/b);
        else
            System.out.println(b/a);
    }
    public static void mul(int a,int b)
    {
        System.out.println(a*b);
    } 
}
