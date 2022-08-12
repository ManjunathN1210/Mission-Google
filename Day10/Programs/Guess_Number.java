package Day10.Programs;

import java.util.Scanner;

class Game{
    int userNum , compNum, counter =0;
    public Game()
    {
        compNum = (int)(Math.random()*100);
    }
    public void setNum(int n)
    {
        userNum = n;
    }
    public void Counter()
    {
        counter++;
    }
    public int isCorrect()
    {
        if(userNum>compNum) 
            return -1;
        else if(userNum<compNum)
            return 1;
        else 
            return 0;
    }
}
public class Guess_Number {
    
    public static void main(String[] args) {
        
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        int n=0;
        while(true)
        {
            System.out.println("Enter a Number between 1-100");
            n = scanner.nextInt();
            
            game.setNum(n);


            if(game.isCorrect() == 0)
            {
                game.Counter();
                System.out.println("Congratulations, You've guessed the number");
                System.out.println(game.compNum);
                System.out.println("Number of Counts: " + (game.counter));
                break;
            }
            else if(game.isCorrect() == 1)
            {
                game.Counter();
                System.out.println("Higher Number Please !");
            }
            else if(game.isCorrect() == -1)
            {
                game.Counter();
                System.out.println("Lower Number Please !");
            }
        }
        scanner.close();
    }
}

/* 
    Flow of the problem

    1. An object is created for class Game (Line 33). 
    2. Constructor is automatically invoked and hence generates a random number between 1-100 and assigns it to a variable (Line 7-9)
    3. Until the condition is true a While loop is called.
    4. User is asked to Enter an input between 1-100 (Line - 39)
    5. User Entered number is set as User input in a setter method (Line 11-13)
    6. isCorrect Method is called to check whether the number guessed by the user is same as computer generated number. Counter is Incremented for Each guess (Line 45)
    7. if userentered number is greater than random number -1 is returned to indicate that lower number should be guessed. (Line 58)
    8. if userentered number is equal to random number , Success Message is printed and Number of Counts taken to guess the number is printed. break is called to exit the loop.

*/