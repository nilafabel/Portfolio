package Ch11;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteReadBinary {
    public static void main (String[]args){
        int[]n = {334,12,32,54,63,75,45,89};
        try{
            FileOutputStream fileOutput = new FileOutputStream("N.dat");
            DataOutputStream dataOutput = new DataOutputStream(fileOutput);
            for(int i:n){
                dataOutput.writeInt(i);
            }
            System.out.println("Done-data loaded into binary file");
            dataOutput.close();
            System.out.println("Reading data from the bianry file");
            boolean EOFstatus = false;
            int temp;
            FileInputStream fileInput = new FileInputStream("N.dat");
            DataInputStream dataInput = new DataInputStream(fileInput);
            while(!EOFstatus){
                try{
                    temp = dataInput.readInt();
                    System.out.println(temp);
                }
                catch(EOFException e){
                    EOFstatus = true;
                }
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}