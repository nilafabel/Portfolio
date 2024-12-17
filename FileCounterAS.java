package HWforCh4;
import java.io.*;
import java.util.Scanner;
public class FileCounterAS {
    public static void main(String[]args) throws IOException{
        String sentence;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name:");//asks the user to enter the name of a file
        String fileName = input.nextLine();
        File myFile = new File(fileName);
        if(!myFile.exists()){
            System.out.println("File does not exist.");
        }
        Scanner inputFile = new Scanner(myFile);
        System.out.println("Enter a character:");//asks the user to enter a character.
        char character = input.nextLine().charAt(0);
        if(myFile.exists()){
            while(inputFile.hasNext()){
                sentence = inputFile.nextLine();
                for(int i = 0; i < sentence.length(); i++){
			        if(sentence.charAt(i) == character){
                    count++;
                    System.out.println("The character " + character + " appears " + count + " times in the string.");
                    //Prints out the number of times that the specified character appears in the file. 
                    }
                }
            }
            if(count == 0){
                System.out.println("This character does not appear in the string.");
            }
        }   
            inputFile.close();
    }
}
/*
 * File Character Counter
* Write a program that asks the user to enter the name of a file, 
* and then asks the user to enter a character. 
* The program should count and display the number of times that the specified character appears in the file. 
* Use Notepad or another text editor to create a simple file that can be used to test the program.
 */