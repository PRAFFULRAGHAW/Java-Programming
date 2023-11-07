class algebra {
    int a = 50;
    int b = 10;

    int add() {
        int c = 20;
        int d = 10;
        return c + d;
    }

    int sub(){
//        here c and d are local variable so it cant be accessed inside sub method
//        return c + d;

//        this is block level code and it can be acccessed only inside block not outside
        {
            int z = 10;
        }
//        System.out.println(z);
          return a - b;


    }

}

public class scopeOfVariableAndMethods {

    public static void main(String[] args) {

        algebra obj1 = new algebra();
        System.out.println("sum of two numbers which is in local variable is " + obj1.add());
        System.out.println("difference of two numbers which is global variable is " + obj1.sub());
    }
}
