import java.util.Scanner;

public class doWhileLoop1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number");
        int n = sc.nextInt();

        do{
            System.out.println(n);
            n--;
        }while(n>0);
    }
}
