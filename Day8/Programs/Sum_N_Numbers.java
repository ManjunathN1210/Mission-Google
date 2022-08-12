import java.util.*;
public class Sum_N_Numbers
{

    // static int sum_numbers(int n) // Using iterative approach 
    // {
    //     int sum = 0;
    //     for(int i=1;i<=n;i++)
    //     {
    //         sum +=i;
    //     }
    //     return sum;
    // }

    static int sum_numbers(int n)   // Using Recursion
    {  
        // Base Condition else it will go for infinite loop
        if(n==1)
        return 1;

        return n + sum_numbers(n-1);
    }
    public static void main(String[] args) {
        
        int number;
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

      System.out.println("Sum of First " + number + " numbers is " + sum_numbers(number));
      scanner.close();
    }
}