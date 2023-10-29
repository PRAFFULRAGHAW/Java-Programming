import java.util.Scanner;

public class simpleInterest {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("please enter principle ");
    float p = sc.nextFloat();

    System.out.println("please enter Rate of interest");
    float r = sc.nextFloat();

    System.out.println("please enter time duration ");
    float t = sc.nextFloat();

    float SI = (p*r*t)/100;

    System.out.println("Principle value is " +p);
    System.out.println("Principle value is " +r);
    System.out.println("Principle value is " +t);

    System.out.println("simple interset of given principle rate and time is " + SI);
   } 
}

    

