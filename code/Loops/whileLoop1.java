import java.util.Scanner;

public class whileLoop1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number");
        int n = sc.nextInt();
        int sum =0;
        while(n>0)
        {
            sum=sum+n;
            n--;
        }
        System.out.println("Sum of " +n+ "natural number is " + sum);
    }
}
