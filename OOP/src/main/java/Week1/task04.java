package Week1;

import java.util.Scanner;

public class task04 {
    public static void main(String [] args ) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;


        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum );

    }
}
