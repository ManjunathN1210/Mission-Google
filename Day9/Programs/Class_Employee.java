package Day9.Programs;

class Employee
{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
}

public class Class_Employee {
    
    public static void main(String[] args) {
        
        Employee employee = new Employee();
        employee.setName("Manjunath");
        employee.salary = 50000;
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
