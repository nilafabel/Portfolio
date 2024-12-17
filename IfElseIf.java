import java.util.Scanner;
public class IfElseIf {
    public static void main(String[] args) {
        //Roman numbers
        int number;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter a number between (1 to 5) to convert to roman");
        number=keyboard.nextInt();
        //number>0 and number<6
        if((number>0)&&(number<6))
        {
          if(number==1)
             System.out.println("I");
          else if(number==2)
             System.out.println("II");
          else if(number==3)
             System.out.println("III");
          else if(number==4)
             System.out.println("IV");
          else if(number==5)
             System.out.println("V");
        }
        else
        System.out.println("Entered number is not in the range."+ 
                            "Please check");

    }


}
