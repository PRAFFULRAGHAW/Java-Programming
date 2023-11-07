class parameterized_constructor{
    String first_name;
    String last_name;
    int roll_no;

    public parameterized_constructor(String first_name , String last_name, int roll_no){
        this.first_name = first_name;
        this.last_name = last_name;
        this.roll_no = roll_no;

        System.out.println("parameterized constructor is called");
    }
}


public class parameterizedConstructor {
    public static void main(String[] args) {

        parameterized_constructor obj1 = new parameterized_constructor("Prafful ", "Raghaw", 1);

        System.out.println("Your First name is " + obj1.first_name);
        System.out.println("Your Last name is " + obj1.last_name);
        System.out.println("Your Roll number is " + obj1.roll_no);
    }
}
