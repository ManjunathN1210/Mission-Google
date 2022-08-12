package Day9.Programs;

class Rectangle
{
    int length,width;

    public int area()
    {
        return length*width;
    }

    public int perimeter()
    {
        return 2*(length+width);
    }
}
public class Class_Rectangle {
    
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
        rectangle.length = 3;
        rectangle.width = 4;

        System.out.println("Area of a Rectangle is " + rectangle.area());
        System.out.println("Perimeter of a Rectangle is " + rectangle.perimeter());
    }
}