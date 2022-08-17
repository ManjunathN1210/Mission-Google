package Day12.Programs;

import java.util.Scanner;

public class Access_Array {
    
    public static void main(String[] args) {
        
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(flag && count<4)
        {
            try {
                System.out.println("Enter the value of index");
            int index = scanner.nextInt();
            System.out.println("The value of marks is " + marks[index]);
            break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                count++;
            }
            if(count==4)
            {
            System.out.println("Maximum Attempts Reached");
            }
            
        }
        scanner.close();
    }
}