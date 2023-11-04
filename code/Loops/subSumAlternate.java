import java.util.Scanner;

public class subSumAlternate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of terms");
        int num = sc.nextInt();
        int sum = 0;

        while(num>0)
        {
            if(num  % 2 ==0){
                sum = sum - num;
//                num--;
            }
            else{
                sum+= num;
//                num--;
            }
            num--;
        }
        System.out.println("result of 5 terms is " + sum);

    }
}
