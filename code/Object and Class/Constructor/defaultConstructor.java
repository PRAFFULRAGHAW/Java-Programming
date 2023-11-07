class Default_Constructor{
    int roll_no;
    String name;

    public Default_Constructor(){
        roll_no = 1;
        name ="Prafful Raghaw";
        System.out.println("Default constructor is called");

    }
}

public class defaultConstructor {

    public static void main(String[] args) {

        Default_Constructor obj1 = new Default_Constructor();
        System.out.println("Your roll number is " +obj1.roll_no);
        System.out.println("Your name is " + obj1.name);

    }
}
