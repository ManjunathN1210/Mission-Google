package Day9.Programs;

class ACM {
    private int id;
    private String Name;

    public String getName()
    {
        return Name;
    }
    public void setName(String n)
    {
        Name = n;
    }   

    public int getId()
    {
        return id;
    }

    public void setId(int i)
    {
        id = i;
    }
}
public class Access_Modifiers {
    
    public static void main(String[] args) {
        
        ACM object = new ACM();
        // object.name = "Manjunath"; // Throws an Error due to private access modifiers

        object.setName("Manjunath");
        System.out.println(object.getName());
        object.setId(12);
        System.out.println(object.getId());
    }
}
