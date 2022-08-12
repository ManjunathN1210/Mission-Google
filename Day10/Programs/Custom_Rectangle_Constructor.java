package Day10.Programs;

class Rectangle
{
    int length , breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    
}
public class Custom_Rectangle_Constructor {
 
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getBreadth());
        System.out.println(rectangle.getLength());
    }
}
