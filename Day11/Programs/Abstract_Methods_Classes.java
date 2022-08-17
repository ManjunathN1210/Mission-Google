package Day11.Programs;

public class Abstract_Methods_Classes
{
    abstract class Base
    {
        public Base()
        {
            System.out.println("I am Base Constructor");
        }
        public void sayHello()
        {
            System.out.println("Hello");
        }

        abstract public void greet();   
    }

    class Child extends Base
    {
        @Override
        public void greet()
        {
            System.out.println("Good Morning");
        }
    }

    abstract class Child2 extends Base
    {

    }
    public static void main(String[] args) {

    }
}