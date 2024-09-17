package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/** 
 *  The program Review6 is a cash register program where the user is able to keep entering item prices until they enter 0 
 *  At the end of entering items, print out the total, the tax (13%) and the grand total. 
 * 
 *  The program utilizes while-loops to allow users to continuously input the price of items
 *  and stop whenever they want to. After a few calculations, the program outputs the total, the tax (13%) and the grand total. 
 *  
 *  @author Simon Tse
 */
public class Review6 {

    /** 
     *  Main method to execute the program logic
     *  
     *  @param args Command-line arguements (not used).
     *  @throws IOException If thre is an error during input.
     */
    public static void main(String[] args) throws IOException{ 

        // Declare variables
        double price = 0.01;
        double totalCost = 0;
        double tax = 0;
        double finalCost =0;
        DecimalFormat currencyFormat = new DecimalFormat("#,##0.00");

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        while(price > 0){
            System.out.print("Enter the price for an item: ");
            price = Double.parseDouble(keyboard.readLine()); 
            totalCost += price;
        }

        tax = totalCost * 0.13;
        finalCost =totalCost * 1.13;

        System.out.println("Subtotal: $" + currencyFormat.format(totalCost));
        System.out.println("Tax: $" + currencyFormat.format(tax));
        System.out.println("Total: $" + currencyFormat.format(finalCost));
    }
}