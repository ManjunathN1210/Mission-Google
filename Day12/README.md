### Interpreter vs Compiler

Interpreter translates one statement at a time into machine code. Compiler scans the entire program and translates the whole of it into machine code.

Example:- Translator between two persons. Interpreter keeps translating after every sentence. Compiler hears everything, understands and then translates it.

> #### Differences betweeen Compiler and Interpreter

| **Interpreter**                 | **Compiler**                         |
|---------------------------------|--------------------------------------|
| One Statement at a time         | Entire Program at a time             |
| Interpreter is needed everytime | Once Compiled compiler is not needed |
| Partial Execution - if error    | No execution if an error occurs      |
| Easy for Programmers            | Usually not easy for programmers     |
| Slower than Compilers           | Faster than Interpreters             |

### Is Java a Compiled or Interpreted Language

Java is a hybrid language -> both compiled and interpreted language
            compiled 
Java File     --->    Class File   ---> Can be used by Interpreter
            javac      bytecode   

#### Packages

Packages in java are used to group related classes. It avoids name conflicts between classes. 
> There are two types of Packages
1. Built-in Packages
2. User Defined Packages

Check Example [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day12/Programs/Packages.java)

#### MultiThreading

Multiprocessing and Multithreading both are used to achieve multitasking. A Thread is a light-weight process. Process are heavy-wait. Thread uses shared memory area. Execution of Thread works concurrently.

##### Creating a Thread in Java

1. By extending Thread Class
2. By implementing Runnable Interface

Check Example [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day12/Programs/Threads.java)

> ### Practice Work 1:- Write a Java Program to print "Good Morning" and "Welcome" continously on the screen using Threads

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day12/Programs/Print_Repetitive.java)

> ### Practice Work 2:- Write a Java Program to demonstrate getPriority() and setPriority() methods

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day12/Programs/Get_and_Set_Priority.java)

#### Errors and Exceptions

There are three types of Errors in Java
1. Syntax errors
2. Logical errors
3. Runtime errors

##### throw is used to throw a new exception while throws is used to intimate the user about the exception.

> ### Practice Work 3:- Write a Java Program to demonstrate syntax, logical and runtime errors

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day12/Programs/Syntax_Logical_Runtime_Errors.java)

> ### Practice Work 4:- Write a Java Program to keep accessing an array until a valid index is given. Max value is 5.

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day12/Programs/Access_Array.java)

#### Java Collection Framework

Java collections provide classes and interfaces for us to be able to write code quickly and efficiently. Resizing an array, adding and removing elements in between array.

Collections in Java:-
1. ArrayList :- For Variable size collection 
2. Set :- For distinct collection
3. Stack :- A Lifo Data structure
4. HashMap :- For storing key-value pairs

Check Example [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day12/Programs/Array_List.java)

Check Example [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day12/Programs/Hash_Set.java)

## End of Java Programming - Core Java