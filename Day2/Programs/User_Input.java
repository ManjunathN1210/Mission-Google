// Simple Program to take user input from the user
import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some number");
        n = sc.nextInt(); 

        System.out.println("The value of n is " + n);
        sc.close();
    }
}
