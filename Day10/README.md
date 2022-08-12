### Constructors 

Constructor is a member function used to initialize an object while creating it. In order to write own constructor of a class, we define a method with same name as the class name.

#### Constructor Overloading

Constructors can take parameters without being overloaded. There can be more than two overloaded constructors.

> ### Exercise 1:- Write a Java to Guess a Number

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day10/Programs/Guess_Number.java)

> ### Practice Work 1:- Write a Java Program to Define a Cylinder with its radius and height

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day10/Programs/Define_Cylinder.java)

> ### Practice Work 2:- Write a Java Program to use a constructor and define cylinder.

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day10/Programs/Define_Cylinder_With_Constructor.java)

> ### Practice Work 3:- Write a Java Program to overload a constructor and initialize a rectangle of length 4 and breadth 5 for using custom parameters.

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day10/Programs/Custom_Rectangle_Constructor.java)

### Inheritance

Inheritance is used to borrow properties and methods from an existing class. **extends** keyword is being used to inherit properties from base or (super) class.

**SuperClass** --> **SubClass**  [ SubClass **extends** SuperClass]
Example:- **Phone** --> **SmartPhone**

When a class inherits from a superclass it inherits parts of superclass methods and fields. Java doesnt support multiple  inheritance i.e two classes cannot be super classes for a sub class.

Example problem [Click Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day10/Programs/Inheritance.java)

#### Constructors in Inheritance

When a Derived class is extended from the base class, the constructor of the base class is executed first followed by the constructor of the derived class. For the Following inheritance heirarchy, the constructors are executed in the order.

    Class 1 - > Parent (Base Class)
        |
        ˅                                               // Constructors execute in top to bottom order
    Class 2 -> Child (Sub Base Class)
        |
        ˅
    Class 3 -> Grand Child (Derived Class)

Whenever Constructors are being overloaded and a derived class object is being created , base class constructor with no parameter is chosen and will get executed. If a specific parameterized constructor is required , super keyword is used in the derived class and argument is being passed to that parameterized constructor.

#### super and this keyword

**this** is a way for us to reference an object of the class which is being created/referenced.
Example:- this.area = 2   --> this is a reference to the current object

**super** is a reference variable used to refer immediate parent class object. 
1. It can be used to refer immediate parent class instance variable
2. It can be used to invoke parent class methods
3. It can be used to invoke parent class constructors

#### Method Overriding

If the child class implements the same method present in the super class again, it is called method overriding. Redefining the method of superclass in sub class with a little bit of change.
When an object of subclass is created and the overrided method is called, the method which has been implemented in the subclass is called and its code is being executed.

> ### Exercise 2:- Online Library

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day10/Programs/Online_Library.java)

> ### Practice Work 1:- Write a Java Program to Create a class circle and use inheritance to create a cylinder from it

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day10/Programs/Cylinder_From_Circle.java)

### Good Learning for DAY10 -> Everyday is a new day, hope to see new things [DAY11](https://github.com/manjunathnmessi/Mission-Google/tree/master/Day11)