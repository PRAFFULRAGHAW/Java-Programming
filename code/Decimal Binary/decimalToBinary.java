import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Decimal Number");
        int decimal_num = sc.nextInt();
        int original_value = decimal_num;
        int binary_num = 0;
        int pw = 1;

        while(decimal_num > 0){
            int remainder = decimal_num%2;
            binary_num = binary_num + remainder*pw;
            decimal_num = decimal_num/ 2;
            pw = pw * 10;
        }

        System.out.println("Decimal to binary number of given number " + original_value + " is "+ binary_num);


    }
}
