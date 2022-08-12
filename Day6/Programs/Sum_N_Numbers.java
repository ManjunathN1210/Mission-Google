import java.util.Scanner;

public class Sum_N_Numbers {
    
    public static void main(String[] args) {
        
        int sum = 0, n , i=0; 

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while(i<n)
        {
            sum += (2*i);
            i++;
        }
        System.out.println("Sum of First "+ n + " even numbers is " + sum);
        scanner.close();
    }
}