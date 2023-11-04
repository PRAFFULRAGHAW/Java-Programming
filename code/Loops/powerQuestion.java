import java.util.Scanner;

public class powerQuestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter base number");
        int base = sc.nextInt();

        System.out.println("please enter power number");
        int power = sc.nextInt();
        int res=1;

        for( int i = 1; i <= power; i++){
            res= res * base;
        }

        System.out.println("final result is "+ res);
    }
}
