package Ch7;
import java.util.Scanner;
public class SumandAvggrades {
        private int[]testScores;
        Scanner keyboard;
        private int total;
        private int avg;
        public SumandAvggrades(){
             keyboard = new Scanner(System.in);
             testScores = new int[5];
             int total=0;
             int avg=0;
            }
        public void result(){
            System.out.println("Enter student grades:");
            for(int i=0;i<testScores.length;i++){
                testScores[i] = keyboard.nextInt();
            }
            int smallest= testScores[0];
            int biggest = testScores[0];
            for(int i=0; i<testScores.length;i++){
                if(testScores[i]<smallest){
                    smallest=testScores[i];//to find the lowest score
                }
                if(testScores[i]>biggest){
                    biggest=testScores[i];//to find the highest score 
                }
            total = testScores[i]+total;
            }
        avg = total/testScores.length;
        System.out.printf("The total score is %d and the average is %d\n",total,avg);
        System.out.printf("The lowest grade is %d and the highest grade is %d\n",smallest,biggest);
        }
    }

