package Day10.Programs;

class Cylinders
{
    private int radius, height;

    public Cylinders(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
    
}
public class Define_Cylinder_With_Constructor {
    
    public static void main(String[] args) {
        
        Cylinders cylinders = new Cylinders(10,5);
        System.out.println(cylinders.getHeight());
        System.out.println(cylinders.getRadius());
    }
}
