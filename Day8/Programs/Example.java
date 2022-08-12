public class Example {

    /*If a method is called from main method (static method) without the creation of object of class then method should be of static type
    Static methods dont get associated with an object , it directly gets associated with an object
    static int logic(int a, int b) // logic(10,5)
    {
        int c;
        if(a>b)
        {
            c = a+b;
        }
        else{
            c = (a+b)*5;
        }
        return c; // logic(15)
    }
    */

    static void sendEmail() // Use of Static and void keyword
    {
        System.out.println("This is an example for Methods");
    }

    int logic(int a, int b) // logic(10,5)
    {
        int c;
        if(a>b)
        {
            c = a+b;
        }
        else{
            c = (a+b)*5;
        }
        return c; // logic(15)
    }

public static void main(String[] args) {
    
    int x=10, y=5, z;
    Example obj = new Example(); // Method invocation using object creation
    
    z = obj.logic(x, y); // logic(10,5) --> z = 15
    System.out.println(z); 
    sendEmail();

    }
}