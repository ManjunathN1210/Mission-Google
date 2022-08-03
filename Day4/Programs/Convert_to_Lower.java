package Day4.Programs;

import java.util.Scanner;

public class Convert_to_Lower {
    public static void main(String[] args) {

        String name ; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");

        name = scanner.nextLine();
        
        System.out.println("Hi" + " " + name.toLowerCase());
        
        scanner.close();
    }
}
   