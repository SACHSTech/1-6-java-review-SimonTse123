package gr11review.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review6 {
    public static void main(String[] args) throws IOException{ 

        // Declare variables
        double price = 0.01;
        double totalCost = 0;
        double tax = 0;
        double finalCost =0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        while(price > 0){
            System.out.print("Enter the price for item: ");
            price = Double.parseDouble(keyboard.readLine()); 
            totalCost += price;
        }

        tax = Math.round(totalCost * 0.13 * 100.0) / 100.0;
        finalCost = Math.round(totalCost * 1.13 * 100.0) / 100.0;

        System.out.println("Subtotal: " + totalCost);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + finalCost);
    }
}