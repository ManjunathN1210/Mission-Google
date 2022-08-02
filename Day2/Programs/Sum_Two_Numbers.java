import java.util.Scanner;

public class Sum_Two_Numbers {
    public static void main(String[] args) {
        int a , b , sum;
        // Scanner class is used to take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:-");
        a = sc.nextInt();
        System.out.println("Enter number 2:-");
        b = sc.nextInt();
        //Add two numbers using + operator
        sum = a+b;
        System.out.println("The value of two numbers is " + sum);
    }
}