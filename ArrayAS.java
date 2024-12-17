package HWforCh6and7;
public class ArrayAS {
    public static void main (String[]args){
        int numbers[] = {11,25,78,88,92};//array of numbers
        int n = 69;//The number that the program will check if the array has greater numbers
        boolean greater = false;//assigns the variable greater to false
        System.out.println("The number(s) greater than " + n + " are: ");
        for(int index=0;index<numbers.length;index++){//A loop that checks if the numbers are greater than n
            if(numbers[index]>n){//if the numbers are greater than n
                System.out.println(numbers[index]);//then prints out the numbers that are
                greater = true;//assignes the varaiable greater to true
            }
        }
        if(!greater){//If the numbers are not greater
            System.out.println("The are no numbers that are greater than " + n);//Then print that there are none
        }
    } 
}
/* 
* In a program, write a method that accepts two arguments: an array and a number n. 
* Assume that the array contains integers. 
* The method should display all of the numbers in the array that are greater than the number n.
*/