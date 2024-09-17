package gr11review.part1;

import java.io.*;

/** 
 *  This program Review7 will input a sentence from the user and give certain stats about it. This 
 *  will include how many characters, spaces and letter a's the sentence has. In addition to this, 
 *  the program will print dashes based on how many odd numbered characters
 *  
 *  The program utilizes a for-loop combined with Java's charAt function to keep a counter 
 *  on how many characters, odd-numbered characters spaces and letter a's
 * 
 *  @author Simon Tse
 */
public class Review7 {

    /** 
     *  Main method to execute the program logic
     *  
     *  @param args Comind-line arguements (not used).
     *  @throws IOException If thre is an error during input.
     */
    public static void main(String[] args) throws IOException{

        // Declaring variables
        String theSentence;
        int numSpace = 0;
        int numA = 0;
        int numOdd =0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Recieving user input
        System.out.print("");
        theSentence = keyboard.readLine();

        // Determining number of spaces, a's and odd characters
        for(int i = 0; i < theSentence.length(); i ++) {
            if(theSentence.charAt(i) == ' '){
                numSpace++;
            }
            if(theSentence.charAt(i) == 'a') {
                numA++;
            }
            if (i % 2 == 0) {
                numOdd++;
            }
        }
        // Outputing results
        System.out.println("There are " + theSentence.length() + " characters in the sentence.");
        System.out.println("There are " + numSpace + " spaces in the sentence.");
        System.out.println("There are " + numA + " letter a in the sentence.");
        for(int i = 0; i < numOdd; i++) {
            System.out.print("-");
        }


    }
}