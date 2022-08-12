import java.util.Scanner;
import java.util.*;
public class Rock_Paper_Scissor
{
    public static void main(String[] args) {
           
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int maxNumber = 3;
        int choice;
        String userChoice = "", computerChoice = "";

        int randomNumber = rand.nextInt(maxNumber) + 1;

        System.out.println("Enter Your Choice \n 1. Rock \n 2. Paper \n 3. Scissor");
        choice = scanner.nextInt();

        if(choice == 1 ){
            userChoice = "Rock";
        }else if( choice == 2 ){
            userChoice = "Paper";
        }else if( choice == 3 ){
            userChoice = "Scissor";
        }

        if(randomNumber == 1 ){
            computerChoice = "Rock";
        }else if( randomNumber == 2 ){
            computerChoice = "Paper";
        }else if( randomNumber == 3 ){
            computerChoice = "Scissor";
        }

        System.out.println("Your choice is " + userChoice );
        System.out.println("System choice is " + computerChoice);

        if(choice == 1 && randomNumber == 1 || choice == 2 && randomNumber == 2 || choice == 3 && randomNumber == 3)
        {
            System.out.println(" Equal Match, No Winner won");
        }
        else if(choice == 1 && randomNumber == 2 || choice == 3 && randomNumber == 1 || choice == 2 && randomNumber == 3 )
        {
            System.out.println("Computer Won!!!");
        }
        else if(choice == 2 && randomNumber == 1 || choice == 1 && randomNumber == 3 || choice == 3 && randomNumber == 2 )
        {
            System.out.println("You Win!!!");
        }
        
        System.out.println("Thanks for Playing the Game");
        scanner.close();
    }
}
