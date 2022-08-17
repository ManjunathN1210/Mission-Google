package Day11.Programs;

class Monkey
{
     void jump()
     {
        System.out.println("Jumping");
     }
     void bite()
     {
        System.out.println("Biting");
     }
}

interface BasicAnimal
{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal
{
    public void eat()
    {
        System.out.println("Eating");
    }
    public void sleep()
    {
        System.out.println("Sleeping");
    }

}
public class Class_Human {
 
    public static void main(String[] args) {
        
        Human human = new Human();

        human.eat();
        human.jump();
        human.bite();
        human.sleep();
    }
}
