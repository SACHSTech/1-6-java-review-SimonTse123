package gr11review.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *  
 * @author Simon Tse
 */
public class Review1 {
    public static void main(String[] args) throws IOException{

        // Decalring variables
        int total = 0;
        int month;
        int day;
        int[] daysInMonths = { 0 , 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Adding keyboard input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        // Recieving user input for variables
        System.out.print("Enter the month number: ");
        month = Integer.parseInt(keyboard.readLine());

        System.out.print("Enter the day number: ");
        day = Integer.parseInt(keyboard.readLine());
        
        // Caculating the total number of days in each of the months
        for(int i = 0; i < month;i++){
           total += daysInMonths[i];
        }

        // Adding in the remaining days and outputing result
       System.out.println(total + day);
    }
}
