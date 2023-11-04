import java.util.Scanner;

public class sumDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {

            sum = sum + num % 10;
            num = num / 10;
        }

        System.out.println("sum of total number of digits  " +num + " is " + sum);
    }
}