package Ch4;
import java.io.*;
import java.util.Scanner;
public class InputFileHandling {
    public static void main(String[]min)throws IOException{
        //File myFile = new File("numbers.txt");
        String fileName;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the file name");
        fileName = keyboard.nextLine();
        File myFile = new File(fileName);
        if(myFile.exists()){
            Scanner inputFile = new Scanner(myFile);
            int n, sum = 0;
            System.out.println("Printing the total from thehe input");
            System.out.println("File opening and reading the info");
            while(inputFile.hasNext()){//Read the file until the end of it 
                n = inputFile.nextInt();
                sum+=n;//summ = sum+n
            }
            System.out.println(sum);
            inputFile.close();
        }
        else{
            System.out.println("File was not there!");
        }
    }
}