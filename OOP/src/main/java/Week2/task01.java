package Week2;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String password = "carrot";

        System.out.println("Enter password: ");
        password = scanner.nextLine();

        while(!password.equals("carrot")) {
            System.out.println("Enter password: ");
            password = scanner.nextLine();
        }
        System.out.println("Correct! The secret message is: 'GOLDEN MINECRAFT CARROT'");
    }
}
