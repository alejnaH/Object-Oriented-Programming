package Week2;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Enter three numbers to print their sum: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println(sum);



    }
}
