import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size of Matrix A");
        int r1 = sc .nextInt();

        System.out.println("Enter column size of Matrix A");
        int c1 = sc .nextInt();

        System.out.println("Enter row size of Matrix B");
        int r2 = sc .nextInt();

        System.out.println("Enter column size of Matrix B");
        int c2 = sc .nextInt();

        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];
        int[][] ans = new int[r1][c2];

        if(c1 != r2){
            System.out.println("Matrix multiplication is not possible");
            return ;
        }


        System.out.println("Please enter "+ r1*c1 + " elements of first matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Please enter "+ r2*c2 + " elements of second matrix");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("First Matrix is ");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix is ");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Product of two matrix  is ");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                ans[i][j] = 0;
                for (int k = 0; k < c2; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
