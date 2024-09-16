package gr11review.part1;

import java.io.*;

/** 
 *  The program Review class prints a list of 4 different options for jokes 
 *  and allows the user to pick one of them to print out a joke.
 *  
 * This program utilizes 
 *  @author Simon Tse
 */
public class Review2 {

    /** 
     *  Main method to execute the program logic
     *  
     *  @param args Command-line arguements (not used).
     *  @throws IOException If thre is an error during input.
     */
    public static void main(String[] args) throws IOException{

        // Outputing the options to the user
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");

        // Allowing user input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Recieving User input
        System.out.print("Choose a menu option: ");
        int intChoice = Integer.parseInt(keyboard.readLine()); 

        // Outputing the corresponding joke to the option
        switch (intChoice) {
            case 0:
            System.out.println("Why do bees have sticky hair?");
            System.out.println("They always use honeycombs");
            break;
        
            case 1:
            System.out.println("What sort of snack do feet like?");
            System.out.println("Dori-toes.");
            break;
        
            case 2:
            System.out.println("What metal can you use to make leggings?");
            System.out.println("Tightanium.");
            break;
        
            case 3:
            System.out.println("What is a Math teacher's favourite snake?");
            System.out.println("A Pi-thon.");
            break;
            
            // Failsafe if none of the options were chosen
            default:
            System.out.println("Invalid menu option");
            break;
        }
    }
}