package Week2;
import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pyramid: ");
        int n = scanner.nextInt();

        drawStarsPyramid(n);


    }

    static void drawStarsPyramid(int n) {

        for(int i=0;i<n;i++) {
            for(int j= 0; j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
