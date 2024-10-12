package Week2;
import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times to print the text?");
        int times = scanner.nextInt();

        printText(times);

    }

        static void printText(int times) {
            for(int i=0;i<times;i++) {
                System.out.println("In the beginning there were the swamp, the hoe and Java.");
            }
        }
 }
