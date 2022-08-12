package Day10.Programs;

class Circle_Check
{
    public int radius;

    Circle_Check(int r)
    {
        System.out.println("I am Circle parameterized constrcutor");
        this.radius = r;
    }
    public double area()
    {
        return this.radius*this.radius*Math.PI;
    }
}
class Cylinders_Check extends Circle_Check
{
    public int height;

    Cylinders_Check(int r, int h)
    {
        super(r);
        System.out.println("I am Cylinders parameterized constrcutor");
        this.height = h;
    }
    public double volume()
    {
        return this.radius*this.radius*Math.PI*this.height;
    }
}
public class Cylinder_From_Circle {
    public static void main(String[] args) {

        // Circles circle = new Circles(10);
        Cylinders_Check check = new Cylinders_Check(10, 54);
        System.out.println(check.volume());
        
    }    
}