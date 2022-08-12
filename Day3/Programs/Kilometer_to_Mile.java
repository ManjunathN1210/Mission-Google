package Day3.Programs;

import java.util.Scanner;

public class Kilometer_to_Mile {

    public static float kilometer, mile, value;
    public static String option;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Welcome to Conversion Calculator");
        System.out.println("Please Enter your choice:-");
        System.out.println("1 : Convert Kilometer to Mile");
        System.out.println("2 : Convert Mile to Kilometer");

        option = scanner.next();

        if(option.equals("1")){

            System.out.println("Enter Kilometer Value");
            kilometer = scanner.nextFloat();

            value = (float) (kilometer*0.621371);
            System.out.println(kilometer + " Kilometer in Miles is " + value);
        }
        else if (option.equals("2"))
        {
            System.out.println("Enter Mile Value");
            mile = scanner.nextFloat();

            value = (float) (mile*1.60934);
            System.out.println(mile + " Miles in Kilometer is " + value);
        }
        else
        {
            System.out.println("Please Enter Correct Option");
        }

        scanner.close();
    }   
}