import java.util.Scanner;

public class Sum_Array_Elements
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int size = 0; float sum = 0;

        System.out.println("Enter the Size of the Array");
        size = scanner.nextInt();
        
        float[] calculate_sum = new float [(int) size];

        System.out.println("Enter all Array Elements");
        for(int i=0;i<calculate_sum.length;i++)
        {
            calculate_sum[i] = scanner.nextFloat();
            sum = sum + calculate_sum[i];
        }
        System.out.println("The elements of the array are : ");
        for(float store : calculate_sum)
        {
            System.out.print(store);
            System.out.print(" ");
        }
        System.out.println("The sum of all the elements in an Array is " + sum );
        scanner.close();
    }
}