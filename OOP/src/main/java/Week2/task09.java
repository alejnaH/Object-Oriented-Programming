package Week2;

public class task09 {
    public static void main(String[] args) {

        int n;
        drawStarsPyramid(5);

    }

    static void drawStarsPyramid(int n) {
        for(int i=1;i<=n; i++) {
            for(int j=1; j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
