import java.util.Scanner;
public class inputSum {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("please enter first number");
    int num1 = sc.nextInt();

    System.out.println("please enter second number");
    int num2 = sc.nextInt();

    int sum = num1 + num2;

    System.out.println("sum of two number is " + sum);
   } 
}
