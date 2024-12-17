package Ch4;
import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        int Num_Students, Num_Courses;
        double score,total=0.0,average=0.0;
        System.out.println("Enter how many students you have?");
        Num_Students=keyboard.nextInt();
        System.out.println("How many course grades do you want to enter?");
        Num_Courses=keyboard.nextInt();
        for(int s=0;s<Num_Students;s++){
            total=0.0;
            for(int c=0;c<Num_Courses;c++) {
               System.out.printf("Enter student %d test score %d\n",(s+1),(c+1));
                score=keyboard.nextDouble();
                total+=score;
            }
            average=(total/Num_Courses);
            System.out.printf("The average score %.2f\n",average);
        }
    }    
}
