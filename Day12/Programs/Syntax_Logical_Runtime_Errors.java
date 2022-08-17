package Day12.Programs;

public class Syntax_Logical_Runtime_Errors
{
    public static void main(String[] args) {
        
        // int age = 21 -> Syntax error missing Semicolon
        int age = 21;
        int year_born = 2000-21; // --> Logical Error

        System.out.println(6/0); // -> Runtime Error

        
    }
}