import java.util.Scanner;
public class Check_Sort_Array {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int size;
        boolean isSorted = true; 
        
        System.out.println("Enter the size of the array");
        size = scanner.nextInt();

        int arr[] = new int [size];

        System.out.println("Enter all elements in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        {
        System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is Not Sorted");
        }

        scanner.close();
    }
}
