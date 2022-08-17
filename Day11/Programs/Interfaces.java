package Day11.Programs;

interface BiCycle
{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class Cycle
{

}
class ACycle implements BiCycle
{
   public void applyBrake(int decrement)
    {
        System.out.println("Apply Break");

    }
    public void speedUp(int decrement)
    {
        System.out.println("Increase Speed");
    }
}
public class Interfaces {   

    public static void main(String[] args) {
     
        ACycle aCycle  = new ACycle();
        aCycle.applyBrake(1);
        System.out.println(aCycle.a);
    }
} 