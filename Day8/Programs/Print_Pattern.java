
public class Print_Pattern {

    // Recursive Way of Printing Star

    //print_pattern(4)
    //print_pattern(3) + 4 time star and a new line
    //print_pattern(2) + 3 time star and a new line + 2 time star and a new line  + 1 time star and a new line
    //print_pattern(1) + 4 time star and a new line + 3 time star and a new line + 2 time star and a new line  + 1 time star and a new line
    static void print_pattern(int n)
    {
        if(n>0)
        {
            print_pattern(n-1); // Recursively calls till base condition and then returns the value in order
            for(int i=0;i<n;i++)
            {
                System.out.print(" * ");
            }
            System.out.println("\n");
            //print_pattern(n-1); // Prints the values first and then recursively calls the function
        }
    }   
    
    // public static void print_pattern() {

    //     for(int i=4;i>0;i--)
    //     {
    //         for(int j=i;j>0;j--)
    //         {
    //         System.out.print(" * ");
    //         }
    //         System.out.println("\n");
    // }
    // }
    public static void main(String[] args) {
        
        print_pattern(4);
    }  
}