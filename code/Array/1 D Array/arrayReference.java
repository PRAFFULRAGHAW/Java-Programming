import java.util.Arrays;
import java.util.Scanner;

public class arrayReference {

    static void show( int[] arr){
        for( int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("please enter 5 elements");
        for( int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        show(arr);

//      here we use reference array in java if we change value in arr_2 then arr value also change because we didnt assign new memory address using new keyword
//      shallow copy
        int[] arr_2 = arr;
        show(arr_2);

//        we can use clone() for creating clone of array that points to different address
        int[] arr_3 = arr.clone();

//       we can use Array.copyOf() for creating clone of array that points to different address
        int[] arr_4 = Arrays.copyOf(arr, arr.length);


        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("New array arr_2 after changing value");
        show(arr_2);

//      here yhe old array value also change
        System.out.println("Old array arr after changing value in arr_2");
        show(arr);

//        array using clone function

        arr_3[0] = 0;
        arr_3[1] = 0;

        System.out.println("New array arr after changing value in arr_3 using clone function");
        show(arr_3);

    }
}
