package Day5.Programs;
import java.util.Scanner;
public class Check_Pass
{
    public static void main(String[] args) {
        
        int marks1, marks2, marks3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks in subject 1");
        marks1 = scanner.nextInt();
        System.out.println("Enter your marks in subject 2");
        marks2 = scanner.nextInt();
        System.out.println("Enter your marks in subject 3");
        marks3 = scanner.nextInt();

        float avg = (marks1 + marks2 + marks3)/3.0f;
        System.out.println("Your Overall Percentage is " + avg);
        if(avg>=40.0 && marks1>=33 && marks2>=33 && marks3>=33)
        {
            System.out.println("Congratulations!!! You have passed in all the subjects");
        }
        else{
            System.out.println("Sorry Please Try Hard Next Time");
        }
        scanner.close();
    }
}