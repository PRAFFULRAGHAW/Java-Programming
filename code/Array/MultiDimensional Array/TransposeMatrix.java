import java.util.Scanner;

public class TransposeMatrix {

    static void printArray(int[][] arr, int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose(int[][] arr, int row, int col){

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row ; j++) {
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size of Matrix ");
        int row = sc.nextInt();

        System.out.println("Enter column size of Matrix ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Please enter " + row * col + " elements of first matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("Original Matrix is ");
        printArray(arr, row, col);

        System.out.println("Transpose Matrix is");
        transpose(arr,row,col);

    }
}