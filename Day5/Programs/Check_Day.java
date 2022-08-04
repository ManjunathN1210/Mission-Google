package Day5.Programs;

import java.util.Scanner;

public class Check_Day {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int day;

        System.out.println("Please Enter a Number to Check the Day of the week");
        day = scanner.nextInt();
        switch(day){

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }
        scanner.close();
    }
}
