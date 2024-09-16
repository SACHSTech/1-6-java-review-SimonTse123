package gr11review.part1;

import java.io.*;

/** 
 *  A program Review3.java that lists all of the odd numbers from 20-100 and then lists all numbers from 29-2 in descending order
 *  @author Simon Tse
 */
public class Review3 {

    /** 
     *  Main method to execute the program logic
     *  
     *  @param args Comind-line arguements (not used).
     *  @throws IOException If thre is an error during input.
     */
    public static void main(String[] args) throws IOException{

        // Listing all odd numbers from 20 - 100
        for(int i = 21; i < 100;i+=2) {
            System.out.println(i);
        }
        // Line break
        System.out.println();

        // Lising all numbers 29 - 2
        for(int i = 29; i >=2;i--) {
            System.out.println(i);
        }
    }
}