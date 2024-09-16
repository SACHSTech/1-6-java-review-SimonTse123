package gr11review.part1;

import java.io.*;

public class Review7 {

    /** 
     *  Main method to execute the program logic
     *  
     *  @param args Comind-line arguements (not used).
     *  @throws IOException If thre is an error during input.
     */
    public static void main(String[] args) throws IOException{

        // Declaring variables
        String sentence;
        int numSpace = 0;
        int numA = 0;
        int numOdd =0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Recieving user input
        System.out.print("");
        sentence = keyboard.readLine();

        // Determining number of spaces, a's and odd characters
        for(int i = 0; i < sentence.length(); i ++) {
            if(sentence.charAt(i) == ' '){
                numSpace++;
            }
            if(sentence.charAt(i) == 'a') {
                numA++;
            }
            if (i % 2 == 0) {
                numOdd++;
            }
        }
        // Outputing results
        System.out.println("There are " + sentence.length() + " characters in the sentence.");
        System.out.println("There are " + numSpace + " spaces in the sentence.");
        System.out.println("There are " + numA + " letter a in the sentence.");
        for(int i = 0; i < numOdd; i++) {
            System.out.print("-");
        }


    }
}