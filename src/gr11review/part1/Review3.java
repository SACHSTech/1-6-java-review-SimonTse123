package gr11review.part1;

import java.io.IOException;

public class Review3 {
    public static void main(String[] args) throws IOException{

        // Listing all odd numbers from 20 - 100
        for(int i = 21; i < 100;i+=2) {
            System.out.print(i +", ");
        }
        // Line break
        System.out.println("" +"\n");

        // Lising all numbers 29 - 2
        for(int i = 29; i >=2;i--) {
            System.out.print(i +", ");
        }
    }
}