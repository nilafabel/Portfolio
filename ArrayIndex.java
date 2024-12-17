package Ch11;
import java.util.Scanner;
public class ArrayIndex {
    public static void main(String[] args) {
        try{
        int []numbers = new int [3];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<=numbers.length;i++){
            System.out.println("Enter an array input:");
            numbers[i] = s.nextInt();
            System.out.println(numbers[i]);
        }}
        catch(Exception e){
            System.out.println("Exception has occured, sorry for the technical issues");
        }
    }
}
