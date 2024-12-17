import java.util.Scanner;
public class ChargeAccountValidationAS{
      public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a charge account number: ");
        int accountNumber = keyboard.nextInt();
        boolean numIsValid = ChargeAccountValidationAS.numIsValid(accountNumber);
            if (numIsValid){
                System.out.println("The number is valid.");
            } 
            else {
                System.out.println("The number is invalid.");
            }
    }
    private static final int[] validNumbers ={
        5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
        8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
        1005231, 6545231, 3852085, 7576651, 7881200, 4581002
    };
    public static boolean numIsValid(int accountNumber) {
        for (int validNumber : validNumbers){
            if (accountNumber == validNumber){
                return true;
            }
        }
            return false;
    }
}
/* 
* Charge Account Validation
* Create a class with a method that accepts a charge account number as its argument. 
* The method should determine whether the number is valid by comparing it to the following list of valid charge account numbers:
* 5658845    4520125    7895122    8777541    8451277    1302850
* 8080152    4562555    5552012    5050552    7825877    1250255
* 1005231    6545231    3852085    7576651    7881200    4581002
* These numbers should be stored in an array. Use a sequential search 
* to locate the number passed as an argument. 
* If the number is in the array, the method should return true, indicating the number is valid. 
* If the number is not in the array, the method should return false, indicating the number is invalid.
* Write a program that tests the class by asking the user to enter a charge account number. 
* The program should display a message indicating whether the number is valid or invalid.
*/
 