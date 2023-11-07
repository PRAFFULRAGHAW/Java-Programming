class algebra1 {

//    this is formal parameters(a, b)
    public void sub(int a, int b){

        int z = a + b;
        System.out.println("sum of two numbers is " + z );
    }

}
public class formalAndactualParameter {
    public static void main(String[] args) {

        algebra1 obj1 = new algebra1();
//        here the vallue we pass is actual parameter
        obj1.sub(10,20);
    }

}
