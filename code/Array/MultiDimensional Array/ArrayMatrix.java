import java.util.Scanner;

public class ArrayMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows ");
        int r = sc .nextInt();

        System.out.println("Enter size of columns ");
        int c = sc .nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Please enter "+ r*c + " elements of matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered Matrix is");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
