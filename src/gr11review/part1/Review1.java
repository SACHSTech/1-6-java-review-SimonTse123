package gr11review.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review1 {
    public static void main(String[] args) throws IOException{
        int total = 0;

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader keyboard2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the month number: ");
        int month = Integer.parseInt(keyboard.readLine());

        System.out.print("Enter the day number: ");
        int day = Integer.parseInt(keyboard2.readLine());
        for(int i = month - 1; i > 0;i--){
            if(month == 1 || month == 3|| month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                total = total + 31;
            }
            else if (month == 2) {
                total = total +28;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                total = total + 30;
            }
        }
       System.out.println(total + day);
    }
}
