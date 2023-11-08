import java.util.Scanner;

class arrayInputSum{

    void input(int n ){

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Please enter "+ n + " elements of array");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        System.out.println("\nsum of " + n + " elements of given array is " + sum);

    }
}

public class inputArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter size of array");
        int n = sc.nextInt();




        arrayInputSum obj = new arrayInputSum();
        obj.input(n);
    }
}
