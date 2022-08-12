import java.util.Scanner;

public class Factorial {

    public static int fact = 1 ;
    public static void main(String[] args) {
        
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number");

        number = scanner.nextInt();

        System.out.print("Factorial of a Given number is ");
        for(int i=1;i<=number;i++)
        {
            System.out.print(i+ " ");
            fact = fact*i;
        }
        System.out.println("\n");
        System.out.println("Sum of Factorial of the  number is " + fact);
        scanner.close();
    }
}