package HWforCh5;
import java.util.Scanner;
public class TestGradeAverageAS {
    public static void main (String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first test score: ");
        int Score1 = keyboard.nextInt();
        System.out.println("Enter your second test score: ");
        int Score2 = keyboard.nextInt();
        System.out.println("Enter your third test score: ");
        int Score3 = keyboard.nextInt();
        System.out.println("Enter your fourth test score: ");
        int Score4 = keyboard.nextInt();
        System.out.println("Enter your fifth test score: ");
        int Score5 = keyboard.nextInt();
        calcAverage(Score1,Score2,Score3,Score4,Score5);
        determineGrade(Score1);
        determineGrade(Score2);
        determineGrade(Score3);
        determineGrade(Score4);
        determineGrade(Score5);
        }
    public static void calcAverage(int Score1, int Score2, int Score3, int Score4, int Score5){
        int average;
        average = (Score1+Score2+Score3+Score4+Score5)/5;
        System.out.println("Your score average is " + average + "!");
    }
    public static void determineGrade(int grade){
        if(grade >= 90 && grade <=100)
                System.out.println("You scored " + grade + ". You got an A!");
            else if(grade >= 80 && grade <= 89)
                System.out.println("You scored " + grade + ". You got an B!");
            else if(grade >= 70 && grade <=79)
                System.out.println("You scored " + grade + ". You got an C!");
            else if(grade >= 60 && grade <=69)
                System.out.println("You scored " + grade + ". You got an D!");
            else if (grade < 60)
                System.out.println("You scored " + grade + ". You got an F!");
        }
    }
/*
* Test Average and Grade: 
* Write a program that asks the user to enter five test scores. 
* The program should display a letter grade for each score and the average test score. 
* Write the following methods in the program:
* calcAverage—This method should accept five test scores as arguments and return the average of the scores.
* determineGrade—This method should accept a test score as an argument and return a letter grade for the score, 
* based on the following grading scale:
* Score Letter Grade
* 90–100 A
* 80–89 B
* 70–79 C
* 60–69 D
* Below 60 F
*/