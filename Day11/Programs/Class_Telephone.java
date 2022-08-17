package Day11.Programs;

abstract class Telephone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone
{
    public void ring()
    {
        System.out.println("Ringing");
    }
    public void lift()
    {
        System.out.println("Lifting");
    }
    public void disconnect()
    {
        System.out.println("Disconnecting");
    }
    public void GPS()
    {
        System.out.println("Location");
    }
}
public class Class_Telephone {

    public static void main(String[] args) {
        
        Telephone telephone = new SmartTelephone();

        telephone.ring();
        telephone.lift();
        telephone.disconnect();
        //telephone.GPS(); --> Error It is not allowed
    }
    
}
