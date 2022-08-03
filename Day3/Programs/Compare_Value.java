package Day3.Programs;

import java.util.Scanner;

public class Compare_Value {

    public static int  n = 10;
    public static void main(String[] args) {
        
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number"); 

        number = scanner.nextInt();

        if(n == number)
        {
            System.out.println("Entered Numbers Match");
        }
        else if ( number >= n) {
            System.out.println("Entered Number is Greater than Actual Value");
        }
        else if( number <= n)
        {
            System.out.println("Entered number is Lesser than Actual Value");
        }
        else{

            System.out.println("Entered Numbers do not Match");
    }  

    scanner.close();
  }
}