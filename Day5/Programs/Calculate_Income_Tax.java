package Day5.Programs;

import java.util.Scanner;

public class Calculate_Income_Tax {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float tax = 0;
        float income = 3.3f;
        
        System.out.println("Please enter your income in lakhs");
        income = scanner.nextFloat();
        if(income <=2.5)
        {
            tax = tax + 0;
        }
        if (income > 2.5f && income <=5f)
        {
            tax  = tax + (float) 0.05 * (income - 2.5f);
        }
        else if(income > 5f && income <=10f)
        {
            tax  = tax + (float) 0.05 * (5.0f - 2.5f);
            tax = tax + (float) 0.2 * (income - 5f);
        }
        else if(income > 10)
        {
            tax  = tax + (float) 0.05 * (5.0f - 2.5f);
            tax = tax + (float) 0.2 * (10.0f - 5f);
            tax = tax + (float) 0.3 * (income - 10.0f);
        }
        System.out.println("The total tax paid by an employee is : " + tax);

        scanner.close();
    }
}