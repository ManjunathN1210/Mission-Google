import java.util.Scanner;

public class Minimum_Element_In_Array {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int size, minimum = Integer.MIN_VALUE;
        
        System.out.println("Enter the size of the array");
        size = scanner.nextInt();

        int arr[] = new int [size];

        System.out.println("Enter all elements in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        minimum = arr[0];
        for(int element : arr)
        {
            if(element<minimum)
            {
            minimum = element;
            }
        }
        System.out.println("The minimum element in an array is " + minimum );
        scanner.close();
        
    }
}
