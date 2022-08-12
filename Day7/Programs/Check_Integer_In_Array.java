import java.util.Scanner;

public class Check_Integer_In_Array {
    
    public static void main(String[] args) {
        
        int size = 0; boolean isInArray = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = scanner.nextInt();

        int check [] = new int [size];

        System.out.println("Enter Array Elements");
        for(int i=0;i<check.length;i++)
        {
            check[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to check inside the array");
        int tocheck = scanner.nextInt();
        for(int integer : check)
        {
            if(tocheck == integer)
            {
                isInArray = true;
                break;
            }
        }
        if(isInArray)
        {
        System.out.println("Yes the integer " + tocheck + " is present in array ");
        }
        else{
            System.out.println("The integer is not present in the array");
        }
        scanner.close();
    }
}
