import java.util.Scanner;
public class Multiplication_Table {
    
    public static void main(String[] args) {
        
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a number");
        n = scanner.nextInt();
        System.out.println("Multiplication Table of "+ n + "In Ascending Order");
        for( int i = 1; i<=10; i++)
        {
            System.out.println(n + " X " + i + " = " + n*i);
        }
        System.out.println("\n");
        System.out.println("Multiplication Table of "+ n + "In Reverse Order");
        for(int  j = 10; j>=1; j--)
        {
            System.out.println(n + " X " + j + " = " + n*j);

        }
        scanner.close();
    }
}
