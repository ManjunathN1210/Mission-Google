package Day9.Programs;

class Square
{
    int side;

    public int area()
    {
        return side*side;
    }

    public int perimeter()
    {
        return 4*side;
    }

}
public class Class_Square {
    
    public static void main(String[] args) {
        
        Square square = new Square();
        square.side = 3;

        System.out.println("Area of a Square is " + square.area());
        System.out.println("Perimeter of a Sqaure is " + square.perimeter());
    }
}
