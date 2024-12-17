package Ch7;
import java.util.Scanner;

public class DoubleDim {
    public static void main(String[] args){
        final int ROW = 3;
        final int COL = 4;
        double[][] testScores = new double[ROW][COL];
        Scanner keyboard = new Scanner(System.in);

        /*
        testScores[0][0]=99;
        testScores[0][1]=79;
        testScores[0][2]=90;
        testScores[0][3]=81;

        testScores[1][0]=67;
        testScores[1][1]=88;
        testScores[1][2]=34;
        testScores[1][3]=78;

        testScores[2][0]=100;
        testScores[2][1]=56;
        testScores[2][2]=67;
        testScores[2][3]=90;
        */

        for(int i=0;i<ROW;i++){//this loops takes the input 
            System.out.println("Enter student " + (i+1)+ " test scores");
            for(int j=0;j<COL;j++){
                testScores[i][j]=keyboard.nextInt();
            }
            System.out.print("\n");
        }
        double total = 0;
        for(int i=0;i<ROW;i++){
            for(int j=0;j<COL;j++){//this loop displays the output
                System.out.print(testScores[i][j]+"\t");
                total += testScores[i][j]; // Add each score to the total
            }
        }
            System.out.print("\n");
            System.out.println("The total for the scores is " + total);
    }
}