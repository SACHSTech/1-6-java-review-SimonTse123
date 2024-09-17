package gr11review.part1;
import java.io.*;


/**
 * A progam Review1.java that asks the user to enter a month and a day number 
 * and determines what day of the year it is, assuming it is not a leap year.
 * 
 * The program utilizes arrays to store the number of days in each month and reads user input from the console 
 * to compute the total number of days that has passed since the beginning of the year to the inputted date
 * 
 * @author Simon Tse
 */
public class Review1 {

    /** 
     *  Main method to execute the program logic
     *  
     *  @param args Command-line arguements (not used).
     *  @throws IOException If thre is an error during input.
     */
    public static void main(String[] args) throws IOException{

        // Decalring variables
        int totalDays = 0;
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
           totalDays += daysInMonths[i];
        }

        // Adding in the remaining days and outputing result
       System.out.println(totalDays + day);
    }
}
