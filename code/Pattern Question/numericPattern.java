import java.util.Scanner;

public class numericPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= r+2; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
