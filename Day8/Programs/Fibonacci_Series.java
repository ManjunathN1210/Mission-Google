
import java.util.Scanner;
public class Fibonacci_Series {

    static int first = 0 , second =1 , third = 0;

    // Fibonnaci Series Using Recursion
    static void Fibonacci(int n)
    {
        if(n>0)
        {
            third = first + second;
            first = second;
            second = third;
            System.out.print( " " + third);
            Fibonacci(n-1);
        }
    }
    // To print the required term 
    // static int Fibonacci(int n)
    // {
    //     if(n==1 || n==2)
    //     {
    //         return n-1;
    //     }
    //     else
    //     {
    //         return Fibonacci(n-1) + Fibonacci(n-2);
    //     }
    // }
    public static void main(String[] args) {
        
        // int first = 0, second = 1, n = 0, third = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();

        System.out.print(first + " " + second);

        Fibonacci(n-2);
        // Fibonacci Series using Iterative Approach
        // System.out.print("Fibonacci Series of " + n + " is " + first + " " + second);
        // for(int i=2;i<n;i++)
        // {
        //     third = first + second;
        //     System.out.print(" " + third);
        //     first = second;
        //     second = third;
        // }
        scanner.close();
    }
    
}