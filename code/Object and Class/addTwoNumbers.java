class algebra{
    int add(int a, int b){
        int ans = a + b;
        return ans;
    }

}

public class addTwoNumbers {
    public static void main(String[] args) {
         algebra obj = new algebra ();
         int res = obj.add(10,20);
        System.out.println("Sum of two numbers is " +res );

    }
}
