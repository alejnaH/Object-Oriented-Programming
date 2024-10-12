package Week2;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.println("Enter numbers (0 to stop): ");
            int number = scanner.nextInt();
            if(number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Total sum is: " + sum);
    }
}