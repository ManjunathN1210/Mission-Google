import java.util.Scanner;

public class Average_Marks {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int size = 0; float sum = 0;

        System.out.println("Enter the Size of the Class");
        size = scanner.nextInt();
        
        float[] calculate_sum = new float [(int) size];

        System.out.println("Enter all Students Marks");
        for(int i=0;i<calculate_sum.length;i++)
        {
            calculate_sum[i] = scanner.nextFloat();
            sum = sum + calculate_sum[i];
        }
        System.out.println("The marks of the students are : ");
        for(float store : calculate_sum)
        {
            System.out.print(store);
            System.out.print(" ");
        }
        System.out.println("The average marks of students in Physics is " + sum/calculate_sum.length);
        scanner.close();
    }
}
