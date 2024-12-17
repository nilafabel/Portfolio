package Ch7;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PartialArray {
    public static void main(String[] args) throws IOException{
        int[]temp = new int[200];
        System.out.println(temp.length);
        temp = new int[30];//redefining the array
        int n,c=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(temp.length);
        System.out.println("Enter -1 to terminate");
        n=keyboard.nextInt();
        while(n!=-1&&c<temp.length)//entering data until u enter -1
        {
            temp[c]=n;
            c++;
            System.out.println("Enter -1 to terminate");
            n=keyboard.nextInt();
        }
        try(PrintWriter outputfile = new PrintWriter("Output.txt"))
        {
            for(int i=0;i<c;i++)//displaying content from the array
            {
                System.out.println(temp[i]);
                outputfile.println(temp[i]);
            }
        }
    }
}
