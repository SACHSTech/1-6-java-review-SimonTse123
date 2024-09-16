package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/** 
 *  A program Review4 
 *  @author Simon Tse
 */
public class Review4 {

    /** 
     *  Main method to execute the program logic
     *  
     *  @param args Comind-line arguements (not used).
     *  @throws IOException If thre is an error during input.
     */
    public static void main(String[] args) throws IOException{

    //Declare variables 
    int numItems = 0;
    double price = 0;
    double tax = 0;
    double finalCost =0;
    DecimalFormat df = new DecimalFormat("#,##0.00");

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("How many items do you want to buy? ");
    numItems = Integer.parseInt(keyboard.readLine()); 
    for(int i = 1;i <= numItems;i++) {
        System.out.print("Enter the price for item " + i + ": ");
        price += Double.parseDouble(keyboard.readLine()); 
    }
    tax = price * 0.13;
    finalCost =price * 1.13;
    System.out.println("Subtotal: $" + df.format(price));
    System.out.println("Tax: $" + df.format(tax));
    System.out.println("Total: $" + df.format(finalCost));
    }
    
}