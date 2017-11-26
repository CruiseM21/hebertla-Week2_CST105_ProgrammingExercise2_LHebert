/**Program:Sum of Five Digit Number Program
 * File: SumOfFiveDigitNumber.java
 * Summary: sum up a 5 digit number from user
 * Author: Vincent Christaldi
 * Date: 11/25/2017
 */
package sumoffivedigitnumber;

//classes to import
import java.util.Scanner; //for user input

public class SumOfFiveDigitNumber 
{

   
    public static void main(String[] args) 
    {
        //declare variables used to capture and display user input
        int firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;
        int totalofnumbers;
        
        //create input from Scanner class
        Scanner input = new Scanner(System.in);
        
        //Prompt user for inout
        System.out.print("Enter a positive 5 digit number: ");
        int userNumber = input.nextInt();
        
        //break down user number into individual numbers for sum up
        //firstNumber
        firstNumber = (userNumber / 10000);
        //second number
        secondNumber = (userNumber % 10000) / 1000;
        //third number
        thirdNumber = ((userNumber % 10000) % 1000) / 100;
        //fourth number
        fourthNumber = (((userNumber % 10000) % 1000) % 100) / 10;
        //fifthNumber
        fifthNumber = (((userNumber % 10000) % 1000) % 100) % 10;
        
        //sum up numbers
        totalofnumbers = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        
        //display results
        System.out.println(firstNumber + " + " + secondNumber + " + " +
                thirdNumber + " + " + fourthNumber + " + " + fifthNumber +
                " = " + totalofnumbers);
        
    }
    
}
