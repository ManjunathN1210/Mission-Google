// Example Program for demonstrating User input function in java
import java.util.Scanner;
public class Basic_Program
{
    public static void main(String [] args) {
        
        int n;
    
        System.out.println("Basics of a Java Program");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        n = scanner.nextInt();

        System.out.println("Entered number is "+ n);

        scanner.close();
    }
}