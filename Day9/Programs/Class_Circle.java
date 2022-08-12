package Day9.Programs;

class Circle
{
    int radius;

    public float area()
    {
        return 3.142f*radius*radius;
    }

    public float perimeter()
    {
        return 2*3.142f*radius;
    }

}
public class Class_Circle {
    
    public static void main(String[] args) {
        
        Circle circle = new Circle();
        circle.radius = 10;

        System.out.println("Area of a Circle is " + circle.area());
        System.out.println("Perimeter of a Circle is " + circle.perimeter());
    }
}
