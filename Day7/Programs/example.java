import java.util.Scanner;

public class example
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1-D Array
        // int size = 0;
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter the Size of the Array");
        // size = scanner.nextInt();

        // int [] marks = new int [size];
        // System.out.println("Enter all Elements");
        // for(int i=0;i<size;i++)
        // {
        //     marks[i] = scanner.nextInt();
        // }

        // System.out.println("Printing Array Elements using for each loop");
        // for(int toprint : marks)
        // {
        //     System.out.println(toprint);
        // }
        // scanner.close();

        // 2-D Array
        int [][] flats;
        System.out.println("Enter the Size of the Array");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        flats = new int [row][column];

        // flats [0][0] = 101;
        // flats [0][1] = 102;
        // flats [0][2] = 103;
        // flats [1][0] = 201;
        // flats [1][1] = 202;
        // flats [1][2] = 203;

        System.out.println("Storing Values to a 2D Array");
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                flats[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Printing Values from a 2D Array using for loop");
        for (int i=0; i<flats.length; i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
            System.out.print(flats[i][j]);
            System.out.print(" ");
            }
            System.out.println("\n");
        }   

        System.out.println("Printing Values from a 2D Array using for-each loop");
        for(int [] printing : flats)
        {
            for(int inside_for : printing)
            {
                System.out.print(inside_for);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        scanner.close();
    }
}