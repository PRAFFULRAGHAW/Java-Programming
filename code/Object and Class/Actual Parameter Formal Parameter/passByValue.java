// in pass by  value copies of the values of actual parameter is passes
class change{

//    here both variables are different so it can not change the global variable value
    static void changeValue(int a){

        a-=5;
        System.out.println("value of a inside change method is " +a);

    }
}
public class passByValue {
    public static void main(String[] args) {

        int a = 10;
        System.out.println("value of a is " +a);
        change.changeValue(a);
        System.out.println("Value of a after change method called is " +a);
    }
}
