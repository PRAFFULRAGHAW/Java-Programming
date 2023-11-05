import java.util.Scanner;

public class rectangularPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter row and column");
        int r = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}