import java.math.BigInteger;
import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int num =sc.nextInt();
        int count = 0;
        while(num>0){
            num = num /10;
            count++;
        }

        System.out.println("total number of digits is " + count);

    }
}
