import java.util.Scanner;

public class readCharacter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a character");
        char c = sc.next().charAt(0);
        // char d = sc.next().charAt(2);
        
        System.out.println("Your enter character is "+c);
        // System.out.println("Your enter third character is "+d);

    }
}
