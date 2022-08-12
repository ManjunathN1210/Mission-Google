import java.util.Scanner;

public class Reverse_Array
{
    public static void main(String[] args) {
        
        int size = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array");
        size = scanner.nextInt();

        int [] reverse = new int [size];
        System.out.println("Enter all Elements");
        for(int i=0;i<size;i++)
        {
            reverse[i] = scanner.nextInt();
        }
        // Divide the length by 2
        int l = reverse.length;
        int a = Math.floorDiv(l, 2);

        for(int i=0;i<a;i++)
        {
            // Replace a[i] with a[l-i-1] Basic Swapping Logic
            int temp = reverse[i];
            reverse[i] = reverse[l-i-1];
            reverse[l-i-1] = temp;
        }

        for(int element : reverse)
        {
            System.out.println(element);
        }
        scanner.close();
    }
}