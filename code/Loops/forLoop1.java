import java.util.Scanner;

public class forLoop1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number");
        int num = sc.nextInt();
        int sum=0;

//        all three condition in for loop are optional

        for(int i=1; i<=num; i++)
        {
            System.out.println(i);
            sum=sum+i;
        }

        System.out.println("sum of "+num+ " natural number is " +sum);
    }
}
