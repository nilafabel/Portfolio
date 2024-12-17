public class Division {
    public static void main(String[]args){

        final int CLASS_SIZE = 22; //CONSTANT, The value remains unchanged
        int enrolled = 18, remaining = CLASS_SIZE - enrolled;
        System.out.println("The CISP 1010 class size is " + CLASS_SIZE);
        System.out.println("The remaining seats are " + remaining);

        double a = 24; 
        int b = 0;
        System.out.println("Modulus = " + a%b);
        System.out.println("Division =  " + a/b);

        int equation = -4+4%3*13+2;
        System.out.println(-4+4%3*13+2);
        System.out.println("The answer is " + equation);

        /* 
        Reminder that int produces round number 
        And double produces decimal numbers of real numbers
        */


        int x=9; x=x+10; 
        /*
        can also write x+=10  
        other examples include +=, -=, *=, /=, %=
        */                    
        System.out.println(x);                  
        System.out.println("x is equal to " + x);

        int y=9; y+=10; 
        System.out.println(x);
        System.out.println("y is equal to " + x);


    }
}
