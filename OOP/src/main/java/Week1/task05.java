package Week1;

import java.util.Scanner;

public class task05 {
    public static void main (String[] args ) {

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Enter a number to check if its positive or negative: ");
        number = scanner.nextInt();

        if(number > 0) {
            System.out.println("The number " + number + " is positive.");
        }
            else {
                System.out.println("The number " + number + " is negative.");
            }
    }
}
