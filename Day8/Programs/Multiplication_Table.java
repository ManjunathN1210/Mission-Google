
import java.util.Scanner;

public class Multiplication_Table {
    

    static void multiplication(int n)
    {
        System.out.println("Multiplication Table of " + n);
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
    public static void main(String[] args) {
        
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        number = scanner.nextInt();

        multiplication(number);
        scanner.close();
    }
}
