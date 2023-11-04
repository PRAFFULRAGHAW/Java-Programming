import java.util.Scanner;

public class streamSumWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number");
        int num = sc.nextInt();
        int sum =0;

    while(num != -1){

        sum = sum +num;
        num = sc.nextInt();
    }

        System.out.println("Sum of given numbers is " +sum);
    }
}
