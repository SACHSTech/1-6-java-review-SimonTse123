package gr11review.part1;

import java.io.*;
import java.util.Random;

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
        System.out.println(intTriple);
    }

}