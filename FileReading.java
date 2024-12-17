package Ch11;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
public class FileReading {
    public static void main(String[] args) {
        String temp;
        //try with resource
        try(Scanner inFile = new Scanner(new File("abc.txt"))){
            while(inFile.hasNext()){
                temp = inFile.nextLine();
                System.out.println(temp);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Exception has occured");
        }
        catch(IOException e){
            System.out.println("Exception has occured" + e.getMessage());
        }
    }
}
