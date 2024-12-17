package HWforCh11; 
import java.util.Scanner; 
class InvalidTestScore extends Exception { // Exception class named InvalidTestScore
    public InvalidTestScore(String message) { // Constructor for InvalidTestScore class
        super(message); // Calls the constructor of the Exception class with a custom message
    }
}
////////////////////////////////////////////////////////////////
class TestScoresAS { // Class named TestScoresAS
    private int[] scores; // Private array to store test scores
    public TestScoresAS(int[] array) throws InvalidTestScore { // Constructor that accepts an array of test scores
        scores = new int[array.length];
        for (int i = 0; i < array.length; i++) { 
            if (array[i] < 0 || array[i] > 100) { // Checks if the test score is invalid
                throw new InvalidTestScore("Invalid test score detected."); // Throws an InvalidTestScore exception
            } else { // If the test score is valid
                scores[i] = array[i]; // Assigns the test score to the scores array
            }
        }
    }
    public double average() { // Method to calculate the average of test scores
        double sum = 0; 
        for (int score : scores) { 
            sum += score; 
        }
        return sum / scores.length; // Calculates and returns the average
    }
    public static void main(String[] args) { // Main method to demonstrate the class
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number of test scores: ");// Asks the user to enter the number of test scores
        int numScores = scanner.nextInt(); 
        int[] testScores = new int[numScores]; 
        for (int i = 0; i < numScores; i++) { // Loop to input each test score
            System.out.print("Enter test score " + (i + 1) + ": "); //Asks the user to enter the test scores
            testScores[i] = scanner.nextInt();
        }
        try { // Tries to create an instance of TestScoresAS
            TestScoresAS test = new TestScoresAS(testScores); // Creates an instance of TestScoresAS with the provided test scores
            double average = test.average(); // Calculates the average of test scores
            System.out.println("Average test score is: " + average); // Displays the average test score
        } catch (InvalidTestScore e) { // Catches InvalidTestScore exception
            System.out.println(e.getMessage()); // Displays the error message
        }
    }
}
/*
1. TestScores Class
 * Write a class named TestScores.
 * The class constructor should accept an array of test scores as its argument.
 * The class should have a method that returns the average of the test scores. 
 * If any test score in the array is negative or greater than 100, 
 *      the class should throw an IllegalArgumentException. 
 * Demonstrate the class in a program.
 
2. TestScores Class Custom Exception 
 * Write an exception class named InvalidTestScore. 
 * Modify the TestScores class you wrote in Programming Challenge 1 so that it throws 
 *      an InvalidTestScore exception if any of the test scores in the array are invalid. 
 */