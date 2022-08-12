package Day10.Programs;

class Cylinder
{
    private float radius, height;
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
    public float getRadius()
    {
        return radius;
    }
    public float getHeight()
    {
        return height;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }
    public float volume()
    {
        return (float)Math.PI*height*radius;
    }
    public float surface_area()
    {

        return (float) (2*Math.PI*radius*height) +(float) (2*Math.PI*radius*radius);
    }
}
public class Define_Cylinder {
    
    public static void main(String[] args) {
        
    Cylinder cylinder  = new Cylinder(10,5);
    // cylinder.setHeight(12);
    // cylinder.setRadius(9);
    System.out.println("Radius of the Cylinder is " + cylinder.getRadius());
    System.out.println("Radius of the Cylinder is " +cylinder.getHeight());

    System.out.println("The Volume of a Cylinder is " + cylinder.volume());
    System.out.println("The Surface Area of a Cylinder is  " + cylinder.surface_area());
    }
}