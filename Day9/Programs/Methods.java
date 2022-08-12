package Day9.Programs;

class CellPhone
{
    public void Ringing()
    {
        System.out.println("Ringing.....");
    }

    public void Vibrating()
    {
        System.out.println("Vibrating.....");
    }
}

public class Methods {
    
    public static void main(String[] args) {
     
        CellPhone cellPhone = new CellPhone();
        cellPhone.Ringing();
        cellPhone.Vibrating();
    }
}
