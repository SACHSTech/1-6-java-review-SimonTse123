package gr11review.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Review2 {
    public static void main(String[] args) throws IOException{

        System.out.println("0 - print a joke abnout your hair");
        System.out.println("1 - print a joke abnout your feet");
        System.out.println("2 - print a joke abnout your clothes");
        System.out.println("3 - print a joke abnout your teacher");

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Choose a menu option: ");
        int choice = Integer.parseInt(keyboard.readLine()); 
        if (choice == 0) {
            System.out.println("Why do bees have sticky hair?");
            System.out.println("They always use honeycombs.");
        }
        else if (choice == 1) {
            System.out.println("What sort of snack do feet like?");
            System.out.println("Dori-toes.");
        }
        else if (choice == 2) {
            System.out.println("What metal can you use to make leggings?");
            System.out.println("Tightanium.");
        }
        else if (choice == 3) {
            System.out.println("What is a Math teacher's favourite snake?");
            System.out.println("A Pi-thon.");
        }
        else if (choice > 3) {
            System.out.println("Invalid menu option");
        }
    }
}