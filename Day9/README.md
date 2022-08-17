### Object Oriented Programming

Object oriented programming tries to map the code instructions with real world.
Solving a problem by creating objects is one of the most popular approaches in programming. This is called Object Oriented Programming.

### Class:- 
A class is a blueprint for creating objects. An Object is an Instantiation of Class. 
Example:- Application form -> Filled by Student -> Student Object

### Object:-
An Object is an instantiation of a class. When a class is defined a template (information) is defined. Memory is allocated only after object instantiation.

#### OOPS Terminology:-

1. **Abstraction**:- Hiding Internal Details [ It shows only essential information]
Example:- Using Phone without bothering about how it was made.

2. **Encapsulation**:- The act of putting various components together (in a capsule).
Example:- Laptop is a single entity with Wifi + Speaker + Storage in a single box.

3. **Polymorphism**:- One Entity Many Forms
Example:- SmartPhone -> Can be used as Phone, Can be used as Calculator, Can be used as a Video Recorder

4. **Inheritance**:- The act of deriving new things from existing things.
Example:- Auto --> E-Auto or Phone -> Smart Phone

> Creating a Custom Class

public class Employee {
    int id;
    String name;
}

Check Example [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day9/Programs/Example.java)

 > ### Practice Work 1:- Write a Java Program to create a class employee with following properties and methods.

        salary(property)(int)
        getSalary(method returning int)
        name (property)(string)
        getName(method returning string)
        setName(method Changing Name)

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day9/Programs/Class_Employee.java)

 > ### Practice Work 2:- Write a Java Program to Create a class CellPhone with methods to print "Ringing...",  "Vibrating..." etc.

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day9/Programs/Methods.java)

 > ### Practice Work 3:- Write a Java Program to Create a Class Square with a method to initialize its side, calculating area, perimeter.

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day9/Programs/Class_Square.java)

 > ### Practice Work 4:- Write a Java Program to Create a Class Rectangle with a method to initialize its side, calculating area, perimeter.

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day9/Programs/Class_Rectangle.java)

 > ### Practice Work 5:- Write a Java Program to Create a Class Circle with a method to initialize its side, calculating area, perimeter.

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day9/Programs/Class_Circle.java)

### Access Modifiers 

It specifies where a property/method is accessible. There are four types of access modifiers in Java

1. Private
2. Default
3. Public
4. Protected

|   **Modifier**  | **Class** | **Package** | **SubClass** | **World** |
|:---------------:|:---------:|:-----------:|:------------:|:---------:|
|    **Public**   |     Y     |      Y      |       Y      |     Y     |
|  **Protected**  |     Y     |      Y      |       Y      |     N     |
| **No Modifier** |     Y     |      Y      |       N      |     N     |
|   **Private**   |     Y     |      N      |       N      |     N     |

Easiest way to remember access is Y - > 4,3,2,1

#### Getters and Setters
Getter -> Returns the value [accessors]
Setter -> Set/Update the value [mutators]

Check Example [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day9/Programs/Access_Modifiers.java)

### Ah, We tried learning something new on DAY9 -> Let's Implement it on [DAY10](https://github.com/manjunathnmessi/Mission-Google/tree/master/Day10)