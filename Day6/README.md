### Let's Continue from Day5

> ### Exercise 1:- Write a program to build a Rock, Paper and Scissor Game

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day6/Programs/Rock_Paper_Scissor.java)

### Loop Control Instructions

Sometimes we want to execute a few set of instructions over and over again. Ex:- To print 1 to 1000 or printing multiplication table of a number

> ### Types of Loops

1. **while loop**
2. **do-while loop**
3. **for loop**

> ### while loop

    while( boolean condition)
    {
            // Statements
    }

    // Example:- 
    int i = 1;
    while(i<=3)
    {
        System.out.println(i);
        i++;
    }

    // Output :- 
    1
    2
    3

If the condition never becomes false, the while loop keeps getting executed. This is called an **Infinite loop**.

> ### do-while loop
This loop is similar to while loop except the fact that is guaranteed to execute atleast once.

    do {
        // Code;
    }while(condition);

    while -> checks the condition and executes the code
    do-while -> Executes the code and then checks the condition

Check Example in [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day6/Programs/check.java)

> ### for loop
 
Syntax of for loop:- 

    for(initialize; check_bool_expression; update)
    {
        //code;
    }

A for loop is usually used to execute a piece of code specific number of times.
 
    // Example:-
    for(int i=1;i<=5;i++)
    {
        System.out.print(i);
    }

    //Output
    1 2 3 4 5

> #### Decrementing for-loop

    for(i=7;i>0;i--)
    {
        System.out.print(i);
    }

    //Output:- 
    7 6 5 4 3 2 1

> #### break and continue using loops

The break statement is used to exit from the loop irrespective of whether the condition is true or false. Whenever a **break** is encountered inside the loop the control is sent outside the loop.

    for(i=7;i>0;i--)
    {
        System.out.print(i);
        if(i==5)
        {
            System.out.println("Loop ends here");
            break;
        }
    }

    //Output:- 
    7 6 5
    Loop ends here

Continue statement is used to immediately move to the next iteration of the loop. The control is taken to the next iteration thus skipping everything below **continue**  inside the loop for that iteration.

    for(int i=0; i<5; i++)
    {
        if(i==2)
        {
            System.out.println("This is for Continue statement");
            continue;
        }
        System.out.print(i);
    }

    // Output:-

    0 1 This is for Continue statement
    3 4 

> ### Practice Work 1:- Write a Java Program to print the following pattern

    * * * *
    * * *
    * *
    *
Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day6/Programs/Print_Pattern.java)

> ### Practice Work 2:- Write a Java Program to sum first n even numbers using while loop

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day6/Programs/Sum_N_Numbers.java)

> ### Practice Work 3:- Write a Java Program to print multiplication table of a given number n

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day6/Programs/Multiplication_Table.java)

> ### Practice Work 4:- Write a Java Program to print factorial of a given number n

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day6/Programs/Factorial.java)

### It ends for DAY6 -> Let's give everything on [DAY7](https://github.com/manjunathnmessi/Mission-Google/tree/master/Day7)