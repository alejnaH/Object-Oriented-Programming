package Week2;
import java.util.Scanner;

public class task04 {
    public static void main (String[] args ) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second: ");
        int num2 = scanner.nextInt();

        if(num1<=num2) {
            int i = num1;
            while (i <= num2) {
                System.out.println(i);
                i++;
            }
        }
        else {
            int i = num1;
            while(i>=num2) {
                System.out.println(i);
                i--;
                    }

                 }
            }
        }




