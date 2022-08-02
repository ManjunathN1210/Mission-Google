package Day3.Programs;
import java.util.Scanner;
public class Greet_People {
    
    public static String name;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Please Enter Your Name");
        name = scanner.nextLine();
        System.out.println("Hello " + name + " Have a Good Day");
        
    }
}
