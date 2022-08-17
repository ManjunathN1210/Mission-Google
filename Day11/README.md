#### Abstract Classes and Methods

Abstract refers to existing in thought or as an idea without concrete existence.
> **Abstract method** is a method that is declared without an implementation. (Kaali Palav)

    abstract void moveTo(double X, double Y)

> **Abstract Class**:- If a class includes abstract methods, then the class itself must be declared abstract. 

    public abstract class PhoneModel
    {
        abstract void switchOff();
        //more code
    }

Check Example [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day11/Programs/Abstract_Methods_Classes.java)

#### Interfaces

Interface is a group of related nethods with empty bodies. You can create properties in interfaces but cannot modify properties in interfaces as they are final.

Check Example [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day11/Programs/Interfaces.java)

#### Why multiple inheritance is not used in java

Mulitple inheritance face problems when there exist methods with same signature in both the super classes. Due to such problems, Java doesn't support multiple inheritance directly but the similar concept can be achieved using interfaces. A class can implement multiple interfaces and extends a class at the same time.

> Important Notes about Interface 
    1. Interfaces in Java is a bit like the Class but with a significant difference.
    2. An Interface can only have method signatures, fields and default methods.
    3. The Class implementing an interface needs to define the methods.
    4. You can create references of interfaces but not the object.
    5. Interface methods are public by default and needs to be explicitly specified in Implemented class.

#### Default Methods

An interface can have static methods and default methods. Default methods enable us to add new functionality to existing interfaces. This feature was introduced in Java 8 to ensure backward compatability while updating an interface. Classes implementing the interface need not implement the default methods. Interfaces can also include private methods for default methods to use.

### Polymorphism 

Polymorphism means having many forms. 

    Interface 1 - Camera
    Interface 2 - Wifi
    Interface 3 - GPS
    Class 1  - CellPhone

    class SmartPhone extends CellPhone implements Camera, Wifi, GPS

    GPS g = new SmartPhone(); --> Can only use GPS methods (Smart Phone is provided only for GPS purposes)
    SmartPhone s = new SmartPhone(); --> Can use all SmartPhone methods (SmartPhone is provided and can be used for all purposes)

> ### Practice Work 1:- Write a Java Program to create an abstract class Pen with methods write and refill() as abstract methods

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day11/Programs/Abstract_Pen.java)

> ### Practice Work 2:- Write a Java Program to create a class Monkey with jump() and bite() methods. Create a class Human which inherits this monkey class and implements BasicAnimal Interface with eat() and sleep() methods.

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day11/Programs/Class_Human.java)

> ### Practice Work 3:- Write a Java Program to create a telephone with ring() , lift() and disconnect() methods as abstract methods. Create another class smartTelephone and demonstrate polymorphism.

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day11/Programs/Class_Telephone.java)

### Enough Fun on DAY11 -> Let's fire it up on [DAY122](https://github.com/manjunathnmessi/Mission-Google/tree/master/Day12)