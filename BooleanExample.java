import java.util.Scanner;
public class BooleanExample {
    public static void main (String[]args){
        Scanner keyboard = new Scanner(System.in); {
        int a = 0,b = 45; 
        boolean result = a==b;
        boolean input;
        System.out.println("The result of a and b " + result);
        System.out.println("The result of a and b is " + result);

        /*
        == is a comparison operator, when you write an expression
        it returens a boolean value.
        It means either true of false.
        */
        System.out.println("Enter true or false");
        input = keyboard.nextBoolean();
        System.out.println("You entered " + input);

        String temp;
        char groupA = 72, groupB = 'B', groupC = 89;
        //char variable is 1 byte. (0-225)
        //The variable can hold a character as an input or small number 
        //
        keyboard.nextLine();//This line is to bypass the enter from the previous input
        System.out.println("Enter a character for groupA");
        temp = keyboard.nextLine();
        groupA = temp.charAt(1);

        System.out.println("groupA members are in " + groupA);
        System.out.println("groupB members are in " + groupB);
        System.out.println("groupC members are in " + groupC);

        //A number example of char 
        char age = '7';
        System.out.println("This girl is " + age + " years old");

        /*  
        The Java char data type provides access to single characters.
        char literals are enclosed in single quote marks.
        EX: ‘a’, ‘Z’, ‘\n’, ‘1’
         */
        }
    }
}
