//public class arraySum {
//    public static void main(String[] args) {
//
//        int arr[] = {1,3,5};
//        int sum = 0;
//
//        for(int i = 0; i < arr.length; i++){
//            sum +=arr[i];
//        }
//        System.out.println("sum of three elements of given array  is " + sum);
//    }
//}

// other method
class sum{

    void addSum(){
        int[] arr = {1,3,5};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("sum of three elements of given array  is " + sum);

    }
}
public class arraySum {
    public static void main(String[] args) {

        sum obj = new sum();
        obj.addSum();


    }
}