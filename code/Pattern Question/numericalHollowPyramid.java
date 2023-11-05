import java.util.Scanner;

public class numericalHollowPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter height of pyramid");
        int r = sc.nextInt();

        for( int i = 1; i <= r; i++){
            for (int j = 0; j < 5; j++) {
                System.out.print("");

            }
            System.out.println();
        }
    }
}
