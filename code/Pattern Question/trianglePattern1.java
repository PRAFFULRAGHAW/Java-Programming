import java.util.Scanner;

public class trianglePattern1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter height of triangle");
        int h = sc.nextInt();

        for(int i = 1; i <= h; i++){
            for(int j = i; j <= h; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
