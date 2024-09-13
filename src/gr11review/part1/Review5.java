package gr11review.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review5 {
    public static void main(String[] args) throws IOException{
        // Declare Variables
        double yearAmount = 0;
        double interestRate = 0;
        double targetAmount = 0;
        double accumulate = 0;
        int years = 0;

        // Adding Keyboard Input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Gaining values for variables from input
        System.out.print("Enter the yearly invested amount: ");
        yearAmount = Double.parseDouble(keyboard.readLine()); 

        System.out.print("Enter the compound interest rate: ");
        interestRate = Double.parseDouble(keyboard.readLine()); 

        System.out.print("Enter the target amount: ");
        targetAmount =Double.parseDouble(keyboard.readLine()); 

        // Determining how many years it takes to reach goal
        while(accumulate < targetAmount){
            accumulate = (accumulate + yearAmount) * ((interestRate/100) + 1);
            years++;
        }
        
        // Ouputing result
        System.out.println("The target amount will be earned in " + years + " years.");
    }
}