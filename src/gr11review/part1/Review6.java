package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/** 
 *  
 * 
 */
public class Review6 {

    /** 
     *  Main method to execute the program logic
     *  
     *  @param args Comind-line arguements (not used).
     *  @throws IOException If thre is an error during input.
     */
    public static void main(String[] args) throws IOException{ 

        // Declare variables
        double price = 0.01;
        double totalCost = 0;
        double tax = 0;
        double finalCost =0;
        DecimalFormat df = new DecimalFormat("#,##0.00");

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        while(price > 0){
            System.out.print("Enter the price for an item: ");
            price = Double.parseDouble(keyboard.readLine()); 
            totalCost += price;
        }

        tax = totalCost * 0.13;
        finalCost =totalCost * 1.13;

        System.out.println("Subtotal: $" + df.format(totalCost));
        System.out.println("Tax: $" + df.format(tax));
        System.out.println("Total: $" + df.format(finalCost));
    }
}