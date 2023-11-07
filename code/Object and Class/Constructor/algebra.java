class calculate{

    int a;
    int b;

    calculate(int x, int y){
        a = x;
        b = y;
        System.out.println(" Parameterized constructor called");
    }

    int add(){
        return a + b;
    }

    int sub(){
        return a - b;
    }

    int mul(){
        return a * b;
    }

    int divide(){
        return a / b;
    }


}

public class algebra {
    public static void main(String[] args) {

        calculate obj1 = new calculate(50,10);

        System.out.println("sum of two numbers is " +obj1.add());
        System.out.println("Difference of two numbers is " +obj1.sub());
        System.out.println("Product of two numbers is " +obj1.mul());
        System.out.println("Division of two numbers is " +obj1.divide());
    }
}
