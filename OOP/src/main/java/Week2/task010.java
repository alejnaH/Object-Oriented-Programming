package Week2;
import java.util.Scanner;

public class task010 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int number =9;
        int counter = 0;
        int userGuess;

        System.out.println("Guess the number: ");
        userGuess = scanner.nextInt();

        while(true) {

        if(userGuess == number){
            counter++;
            System.out.println("You are correct!\nYou made " + counter + " guesses!");
            break;
        }
        if(userGuess > number) {
            counter++;
            System.out.println("Lower! - This is your " + counter + ". guess!");
            userGuess = scanner.nextInt();
        }
        if(userGuess < number) {
            counter++;
            System.out.println("Higher! - This is your " + counter + ". guess!");
            userGuess = scanner.nextInt();
            }
        }
    }
}
