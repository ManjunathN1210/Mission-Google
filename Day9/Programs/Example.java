package Day9.Programs;

class Employee
{
    int id ;
    String name;
    int salary;
    public void printDetails()
    {
        System.out.println("My Id is " + id);
        System.out.println("My Name is " + name);
        System.out.print("My Salary is ");
    }
    public int getSalary()
    {
        return salary;
    }
}
public class Example {

    public static void main(String[] args) {
        
        Employee manjunath = new Employee(); // Instantiating the new object
        Employee one = new Employee();
        manjunath.id = 12;
        manjunath.name = "Manjunath";
        manjunath.salary = 500000;
        manjunath.printDetails();
        int salary = manjunath.getSalary();
        System.out.println(salary);

        one.id = 17;
        one.name = "Charan";
        one.salary = 44000;
        one.printDetails();
        salary = one.getSalary();
        System.out.println(salary);
    }   
}