import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size of Matrix");
        int r = sc .nextInt();

        System.out.println("Enter column size of Matrix ");
        int c = sc .nextInt();
        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];

        System.out.println("Please enter "+ r*c + " elements of first matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Please enter "+ r*c + " elements of second matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("First Matrix is ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix is ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of two matrix  is ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((arr1[i][j]+ arr1[i][j]) + " ");
            }
            System.out.println();
        }

    }
}
