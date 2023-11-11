import java.util.Scanner;

class count{

    Scanner sc = new Scanner(System.in);

    public void countGreater(){
        System.out.println("Please enter  the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        System.out.println("please enter elements of array");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("please enter element you want to count strictly greater");
        int find = sc.nextInt();

        for (int i = 0; i < n; i++){
            if(arr[i] > find){
                count++;
            }
        }

        System.out.println("Total Number of elements greater than " +find + " is " +count);



    }


}

public class countGreater {
    public static void main(String[] args) {

        count obj1 = new count();
        obj1.countGreater();
    }
}
