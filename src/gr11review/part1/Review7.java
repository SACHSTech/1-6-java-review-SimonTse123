package gr11review.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review7 {
    public static void main(String[] args) throws IOException{

        String sentence;
        int numSpace = 0;
        int numA = 0;
        int numOdd =0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("");
        sentence = keyboard.readLine();

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

        System.out.println("There are " + sentence.length() + " characters in the sentence.");
        System.out.println("There are " + numSpace + " spaces in the sentence.");
        System.out.println("There are " + numA + " letter a in the sentence.");
        for(int i = 0; i < numOdd; i++) {
            System.out.print("-");
        }


    }
}