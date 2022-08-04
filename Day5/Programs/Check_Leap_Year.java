package Day5.Programs;

import java.util.Scanner;

public class Check_Leap_Year {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int leap_year ;

        System.out.println("Please Enter a year");
        leap_year = scanner.nextInt();

        if( (leap_year % 4 == 0 && leap_year % 100 == 0 ) || leap_year % 100 == 0 && leap_year % 400 == 0)
        {
            System.out.println("Entered year is a leap year " + leap_year);
        }
        else
        {
            System.out.println("Entered year is not a leap year");
        }

        scanner.close();
    }
} 