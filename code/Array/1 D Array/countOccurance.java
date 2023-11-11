import java.util.Scanner;

public class countOccurance {

    static int count(int array[], int x) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter number of elements in array");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("please enter " + n + " Elements ");

        for(int i = 0; i < n ; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("enter a digit whose occurance you want to count");
        int x = sc.nextInt();

//        int count = count(array, x);
        System.out.println("count of x " + x + " : " + count(array, x));


    }
}