import java.util.Scanner;
public class Maximum_Element_In_Array {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int size, maximum;
        
        System.out.println("Enter the size of the array");
        size = scanner.nextInt();

        int arr[] = new int [size];

        System.out.println("Enter all elements in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        maximum = arr[0];
        for(int element : arr)
        {
            if(element>maximum)
            {
            maximum = element;
            }
        }
        System.out.println("The maximum element in an array is " + maximum );
        scanner.close();
    }
}
