import java.util.Scanner;

public class numericalRectangularPattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please specify number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                if( (i + j) % 2 == 0){
                    System.out.print(1);
                }
                else{
                    System.out.print(2);
                }

            }
            System.out.println();
        }
    }
}
