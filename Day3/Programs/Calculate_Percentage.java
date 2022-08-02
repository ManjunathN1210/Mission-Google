package Day3.Programs;

import java.util.Scanner;

public class Calculate_Percentage {
    public static void main(String[] args) {

        int n,avg;
        float marks1, marks2, marks3, marks4, marks5, total_percentage;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Maximum Marks for Each Subject");
        n = scanner.nextInt();

        System.out.println("Enter Marks for Subject 1");
        marks1 = scanner.nextFloat();

        System.out.println("Enter Marks for Subject 2");
        marks2 = scanner.nextFloat();

        System.out.println("Enter Marks for Subject 3");
        marks3 = scanner.nextFloat();

        System.out.println("Enter Marks for Subject 4");
        marks4 = scanner.nextFloat();

        System.out.println("Enter Marks for Subject 5");
        marks5 = scanner.nextFloat();

        avg = n*5;
        total_percentage = (marks1+marks2+marks3+marks4+marks5)/avg*100;

        System.out.println("Total Percentage of the Student is " + total_percentage + "%");
    }
}
