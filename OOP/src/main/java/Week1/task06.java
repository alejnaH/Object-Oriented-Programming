package Week1;

import java.util.Scanner;

public class task06 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        System.out.println("Enter two numbers to check the greater one or if they are equal: ");
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();

        if(firstNumber == secondNumber) {
            System.out.println("Both numbers are equal.");
        }
            else if (firstNumber > secondNumber) {
                System.out.println(firstNumber + " is bigger than " + secondNumber);
            }
            else {
                System.out.println(secondNumber + " is bigger than " + firstNumber );
            }
    }
}
