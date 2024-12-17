public class SalePredictionAS {
    public static void main(String[]args){
/*The Blue whale's sales division of the company generates 48 percent of total sale. 
* Based on that percentage, write a program that will predict how much the blue whale's division 
  will generate if the company has $3.6 million in sales this year. 
* Hint: Use the value 0.48 to represent 48 percent.
* Test Average (File name should be TestAverage and add your first name and last name initials as a suffix. 
* Example- TestAverageSK.java)
*/
    double salesThisYear = 3600000.00;
    double percentage = 0.48;
    System.out.println(salesThisYear*percentage + "0$");
/*
* Write program that asks the user to enter three test scores. 
* The program should display each test score, as well as the average of the scores.
* Submit your completed assignment files here. 
* Source code files should have the correct filename matching the name of the class within the file
  and a .java file extension.
 */
    int studentTestScore1 = 76, studentTestScore2 = 80, studentTestScore3 = 99;
    System.out.println("First Score is " +studentTestScore1+ ".");
    System.out.println("Second score is " +studentTestScore2+ ".");
    System.out.println("Third score is " +studentTestScore3+ ".");
    int averageOfScores = ((studentTestScore1 + studentTestScore2 + studentTestScore3)/3);
    System.out.println("The average of scores is " +averageOfScores+ ".");





     
    
    }
    
}
