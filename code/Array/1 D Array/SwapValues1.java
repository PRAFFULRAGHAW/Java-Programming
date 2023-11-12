public class SwapValues1 {

    public static void  swap(int a, int b){
        System.out.println("Original value of a :  " +a );
        System.out.println("Original value of b :  " +b );

//        By sum difference method
//        a = a + b; // a = 12
//        b = a - b; // b = 9
//        a = a - b; // a = 3

//        By multiplication and division method
        a = a * b; // a = 27
        b = a/b;  // b = 9
        a = a/b;


        System.out.println("value after swap a :" +a);
        System.out.println("value after swap b :" +b);



    }

    public static void main(String[] args) {

        int a = 9;
        int b = 3;
        int[] arr = {1,5,3,7,9};

        swap(a,b);

    }
}
