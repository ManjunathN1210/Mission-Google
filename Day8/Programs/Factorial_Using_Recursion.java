
import java.util.Scanner;

public class Factorial_Using_Recursion
{
    int factorial(int n)
    {
        if( n == 0 || n == 1)
        return 1;
        else{
        return  n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        
    Factorial_Using_Recursion fac = new Factorial_Using_Recursion();    
    int a ; 
    System.out.println("Enter the Number ");
    Scanner scanner = new Scanner(System.in);
    a = scanner.nextInt();

    System.out.println("Factorial of a Given Number " + a + " is " + fac.factorial(a));

    scanner.close();
    }
}