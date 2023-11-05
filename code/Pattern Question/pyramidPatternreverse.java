import java.util.Scanner;

public class pyramidPatternreverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for (int k =1; k <= i; k++){
                System.out.print(" ");

            }
            for(int k = 1; k <= 2*r-2*i +1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
