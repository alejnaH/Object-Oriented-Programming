package Week2;
import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to calculate 2^ of that number: ");
        int n = scanner.nextInt();

        int result = (int)Math.pow(2, n);
        System.out.println(result);


    }

}
