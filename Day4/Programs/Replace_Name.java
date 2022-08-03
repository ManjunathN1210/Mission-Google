package Day4.Programs;

import java.util.Scanner;

public class Replace_Name {
    
    public static void main(String[] args) {
        
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, Please Enter your name");
        name = scanner.nextLine();

        String letter = "DEAR <|name|>, Thanks A Lot!!!!";

        //letter.replace("<|name|>", "Manjunath");
        name = letter.replace(letter.substring(5, 14), name);

        System.out.println(name);

        scanner.close();
    }
}
