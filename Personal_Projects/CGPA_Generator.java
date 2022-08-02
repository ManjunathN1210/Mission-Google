package Personal_Projects;

import java.util.Scanner;

public class CGPA_Generator {
    public static float no_of_credits= 0, cgpa = 0, previous_cgpa = 0;
    public static float no_of_subjects, total_credits = 0;
    public static float total_sgpa = 0 , total_cgpa = 0 ;
        
    public static void main(String[] args) {
             
        Scanner scanner = new Scanner(System.in);

        System.out.println("DR AIT CGPA Calculator");
        System.out.println("Enter the total Number of Subjects");
        no_of_subjects = scanner.nextFloat();

        for(int i=1;i<=no_of_subjects;i++)
        {
            System.out.println("Enter Grade for subject " + i);
            String subject  = scanner.next();

            System.out.println("Enter Number of Credits for Subject " + i);
            no_of_credits = scanner.nextFloat();
            total_credits = total_credits + no_of_credits;
            if(subject.equals("S"))
            {
                cgpa += (no_of_credits*10);
                System.out.println("CGPA is " + cgpa);
            }
            else if(subject.equals("A"))
            {
                cgpa +=  (no_of_credits*9);
                System.out.println("CGPA is " + cgpa);
            }
            else if(subject.equals("B"))
            {
                cgpa +=  (no_of_credits*8);
                System.out.println("CGPA is " + cgpa);
            }
            else if(subject.equals("C"))
            {
                cgpa += (no_of_credits*7);
                System.out.println("CGPA is " + cgpa);
            }
            else if(subject.equals("D"))
            {
                cgpa +=  (no_of_credits*6);
                System.out.println("CGPA is " + cgpa);
            }
            else if(subject.equals("E"))
            {
                cgpa +=  (no_of_credits*5);
                System.out.println("CGPA is " + cgpa);
            }
            else
            {
                cgpa += (no_of_credits*0);
                System.out.println("CGPA is " + cgpa);
            }
        }
        System.out.println("Total Number of Credits is " + total_credits);
        total_sgpa = cgpa/total_credits;
        System.out.println("Your SGPA is " + total_sgpa);

        System.out.println("Do you have any available CGPA of previous semester (Y/N)?");
        String yes = scanner.next();

        if(yes.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter Your Previous CGPA");
            previous_cgpa = scanner.nextFloat();

            total_cgpa = (previous_cgpa + total_sgpa)/2;
            System.out.println("Your Final Cgpa is " + total_cgpa);

        }
        else{
            System.out.println("Your Final Cgpa is " + total_sgpa);
            System.out.println("Thank You For your Time");

        }
        
    }
}