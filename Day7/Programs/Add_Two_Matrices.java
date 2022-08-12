import java.util.Scanner;

public class Add_Two_Matrices {
    
    public static void main(String[] args) {
        
        int row, column;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of Matrix");
        row = scanner.nextInt();
        column = scanner.nextInt();

        int add [] [] = new int [row][column];
        int second [][] = new int [row][column];
        int result [] [] = new int [row][column];
 
        System.out.println("Enter the Elements of Array 1");
        for (int i = 0 ; i<add.length;i++)
        {
            for(int j=0;j<add[i].length;j++)
            {
                add[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter the Elements of Array 2");
        for (int i = 0 ; i<second.length;i++)
        {
            for(int j=0;j<second[i].length;j++)
            {
                second[i][j] = scanner.nextInt();
            }
        }
        
       for(int i=0;i<add.length;i++)
       {
        for(int j=0;j<add[i].length;j++)
        {
            result[i][j] = add[i][j] + second[i][j];
        }
       }

       System.out.println("Printing the Resultant Array");
       for(int i=0;i<add.length;i++)
       {
        for(int j=0;j<add[i].length;j++)
        {
            System.out.print(result[i][j]);
            System.out.print(" ");
        }
        System.out.println("\n");
       }
       scanner.close();
    }
}