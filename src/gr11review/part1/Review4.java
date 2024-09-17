package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/** 
 *  This program Review4 class that asks the user how many items he/she would like to purchase.The 
 *  program then gets the prices for the items one by one and finally outputs the total, tax, and grand total.
 *  
 *  The program utilizes for-loops to allow a certain amount of user input when inputing the price of an item 
 *  depending on the number of items the user wanted to add up in the first place.
 * 
 *  @author Simon Tse
 */
public class Review4 {

    /** 
     *  Main method to execute the program logic
     *  
     *  @param args Command-line arguements (not used).
     *  @throws IOException If thre is an error during input.
     */
    public static void main(String[] args) throws IOException{

    // Declare and Initialize variables 
    int numItems = 0;
    double price = 0;
    double tax = 0;
    double finalCost =0;
    DecimalFormat currencyFormat = new DecimalFormat("#,##0.00");
    
    // Recieving User Input for number of items
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("How many items do you want to buy? ");
    numItems = Integer.parseInt(keyboard.readLine()); 

    // Recieving User Input for the price of items
    for(int i = 1;i <= numItems;i++) {
        System.out.print("Enter the price for item " + i + ": ");
        price += Double.parseDouble(keyboard.readLine()); 
    }
    
    // Calculating tax and grand total
    tax = price * 0.13;
    finalCost =price * 1.13;

    // Outputing results to the reader
    System.out.println("Subtotal: $" + currencyFormat.format(price));
    System.out.println("Tax: $" + currencyFormat.format(tax));
    System.out.println("Total: $" + currencyFormat.format(finalCost));
    }
    
}