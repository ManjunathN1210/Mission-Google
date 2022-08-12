### Methods

A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions.

> Syntax:-

    dataType name(Arguments)
    {
        //Method body
        return value;
    }

##### Values which are being changed in the called function doesn't affect the values of the variables in the main method.

Example:-
static int sum(int x , int y) // x = 1, y = 2
{
    x=10;
    y=20;
    int z = x+y;
    return z;
}
public static void main(String [] args)
{
    x=1;
    y=2;
    System.out.println(sum(x,y)); // x = 1, y = 2
}

Check example Program [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day8/Programs/example.java)

#### Calling a Method
A method can be called by creating an object of the class in which the method exists followed by the method call:-

    Calc obj = new Cal(); // Creation of an Object
    obj.mySum(a,b); // Method call using an object

#### void keyword 
When there is not a requirement to return any value void can be used. Only int is being returned , no value is being returned with void type.

    void methodname()
    {
        // Method body
    }

#### static keyword
Static keyword is used to associate a method with the class rather than the object of the class. static method in a class is shared by all the objects. There is no necessity of using an object to call these types of methods.

    static void change (int []arr)
    {
        arr[0] = 98;
    }
    public static void main(String [] args)
    {
        int [] marks = { 100,20, 45 , 57};
        change(marks);
        System.out.println(marks[0]);
    }

    // Output:- 98   --> Because this is an array and call function is passing the reference rather than value. When Both main method and function call refer to a same object , then value can be modified even with a void method.

### Method Overloading

Two or more methods can have same name but different parameters. Such methods are called as Overloaded Methods. 

    Example:-

    void foo() 
    void foo(int a)           // Overloaded Methods
    int foo(int a , int b)

Method overloading cannot be performed by changing the return type of the method. Parameters and return type matters.
Check example Program [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day8/Programs/Method_Overloading.java)

#### Variable Arguments (varArgs)

A function with varArg can be created in Java using the following syntax:-

    public static void foo(int ... arr)
    {
        // arr is available here as int [] arr
    }

    Example:- 

    static int sum(int ... arr)
    {
        int result = 0;
        for(int a: arr)
        {
            result += a;
        }
        return result;
    }

    System.out.println("The sum of a b and c is: " + sum(4,5,6));

    // Output:- 
    The sum of a b and c is 15

If no arguments are being passed in the method call then it is considered as an empty array and will return 0.

#### Recursion

A function in java can call itself. Such calling of function by itself is called recursion.

Example:- 
    Factorial of a number
    factorial(n) = n * factorial(n-1);

 > ### Practice Work 1:- Write a Java Program to print multiplication table of a number n using methods

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day8/Programs/Multiplication_Table.java)

 > ### Practice Work 2:- Write a Java Program to print the following pattern using methods

    * * * *
    * * *
    * * 
    *

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day8/Programs/Print_Pattern.java)

 > ### Practice Work 3:- Write a Java Program to calculate sum of first n numbers

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day8/Programs/Sum_N_Numbers.java)

 > ### Practice Work 4:- Write a Java Program to print Fibanacci series of n number

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day8/Programs/Fibonacci_Series.java)

 > ### Practice Work 5:- Write a Java Program to find average of a set of numbers passed as arguments

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day8/Programs/Average_Set_Numbers.java)

 > ### Practice Work 6:- Write a Java Program to convert Celsius to Temperature

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day8/Programs/Celsius_To_Temperature.java)

### Enough Fun on DAY8 -> Let's fire it up on [DAY9](https://github.com/manjunathnmessi/Mission-Google/tree/master/Day9)