import java.util.Scanner;

public class Celsius_To_Temperature {
    
    public static void convert(float n)
    {
        float farhenheit = 0;

        farhenheit = (n*9/5)+32;
        System.out.println(n + "° Celsius" + " in Farhenheit is " + farhenheit + "F");
    }
    public static void main(String[] args) {
        
        float n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Celsius Value");
        n = scanner.nextFloat();
        convert(n);
        scanner.close();
    }
}