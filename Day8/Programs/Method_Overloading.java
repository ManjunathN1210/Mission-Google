
public class Method_Overloading {
    
    static void foo()
    {
        System.out.println("Good Evening");
    }

    static void foo(int a) // Parameters are type and variables which receives the copy of values from a method call.
    {
        System.out.println("Good Evening " + a + " Bro");
    }
    
    public static void main(String[] args) {
        
       foo();
       foo(3000); // Arguments are the actual values that are being passed to a function
    }
}