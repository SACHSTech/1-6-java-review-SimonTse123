package gr11review.part1;

import java.io.IOException;
import java.util.Random;

public class Review8 {
    public static void main(String[] args) throws IOException{

        // Declare variables
        Random ranSlot = new Random();
        int intFirst;
        int intSecond;
        int intThird;
        int intTriple = 0;

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