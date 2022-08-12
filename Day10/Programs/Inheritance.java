package Day10.Programs;
    
class Animal
{
    public void speak()
    {
        System.out.println("Speaking..");
    }
}
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Barking..");
    }
}
public class Inheritance {
 
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.speak();
        dog.bark();
    }
}
    
