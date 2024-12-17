package HWforCh4;
import java.util.Scanner;
public class CharacterCounterAS {
    public static void main(String[]args){
        String sentence;
        char character;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");//asks the user to enter a string
        sentence = input.nextLine();
        System.out.println("Enter a character:");//asks the user to enter a character.
        character = input.nextLine().charAt(0);
        for(int i = 0; i < sentence.length(); i++){
			if(sentence.charAt(i) == character){
                count++;
                System.out.println("The character " + character + " appears " + count + " times in the string.");
                //Prints out the number of times that the specified character appears in the string
			}
        }
        if(count == 0){
                System.out.println("This character does not appear in the string.");
            }
		}
    }
/*Character Counter
* Write a program that asks the user to enter a string, 
* and then asks the user to enter a character. 
* The program should count and display the number of times that the specified character appears in the string.
*/