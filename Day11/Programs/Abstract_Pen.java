package Day11.Programs;

abstract class Pen
{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen
{
    public void write()
    {
        System.out.println("Writing");
    }
    public void refill()
    {
        System.out.println("Refilling Pen");
    }

    void changeNip()
    {
        System.out.println("Changing the NIP");
    }
}
public class Abstract_Pen {
    
    public static void main(String[] args) {

        FountainPen fountainPen = new FountainPen();
        // fountainPen.write();
        // fountainPen.refill();
        fountainPen.changeNip();
    }
}