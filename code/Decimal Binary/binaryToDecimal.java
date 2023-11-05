import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Binary Number");
        int binary_num = sc.nextInt();
        int original_num = binary_num;

        int pw = 1;
        int decimal_num = 0;

        while(binary_num > 0){
            int unit_digit = binary_num % 10;
            decimal_num = decimal_num + (unit_digit*pw);
            binary_num = binary_num/10 ;
            pw = pw * 2;
        }






//        int decimal_num = 0;
//        int pw = 1;
//
//        while(binary_num > 0){
//            int unit_digit = binary_num % 10;
//            decimal_num = decimal_num + (unit_digit*pw);
//            binary_num = binary_num/10;
//            pw = pw*2;
//        }

        System.out.println("Decimal value of given binary number " + original_num + " is " +decimal_num);



    }
}
