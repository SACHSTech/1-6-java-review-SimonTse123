package gr11review.part1;

import java.io.*;
import java.util.Random;

/** 
 *  The program Review8 simulates 1000 pulls of a slot machine, 
 *  such that 3 random numbers (between 0 and 8) are generated for each pull. Then, it outputs 
 *  the result of each pull and prints the number of times a triple (all 3 numbers equal) was pulled.
 *  
 *  The program utilizes Java's Random function to imitate a slot machine and uses a for-loop to 
 *  keep track on how many triples are pulled.
 * 
 *  @author Simon Tse
 */
public class Review8 {

    /** 
     *  Main method to execute the program logic
     *  
     *  @param args Comind-line arguements (not used).
     *  @throws IOException If thre is an error during input.
     */
    public static void main(String[] args) throws IOException{

        // Declare and initialize variables
        Random ranSlot = new Random();
        int intFirst;
        int intSecond;
        int intThird;
        int intTriple = 0;

        // Creating the random slot machine
        for(int i = 0; i < 1000; i++){
            intFirst = ranSlot.nextInt(8);
            intSecond = ranSlot.nextInt(8);
            intThird = ranSlot.nextInt(8);
            System.out.println( intFirst + " " + intSecond + " " + intThird);
            if(intFirst == intSecond && intFirst == intThird) {
                intTriple++;
            }
        }

        // Printing number of triples
        System.out.println(intTriple);
    }

}