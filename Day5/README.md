### Let's have some fun today as a programmer

#### else if condition

Instead of using multiple if statements, we can also use else if along with if statements thus forming an if-else if-else ladder. Using such kind of logic reduces indents. Last else condition will only work if all the if conditions are false.

    if(condition 1)
    {
        // Statements
    }
    else if(condition 2)
    {
        // Statements
    }
    else
    {
        // Statements
    }

    int age = 50;
    if(age>56)
    {
        System.out.println("You are an experienced person");
    }
    else if(age>46 && age<56>)
    {
        System.out.println("You are a Semi experienced person");
    }
    else
    {
        System.out.println("Sorry, You are not experienced");
    }

    //Output:- You are a Semi experienced person

### Switch Case Conditionals

It is used when we have to make a choice between number of alternatives for a given variable. Variable can be an integer or a string.

switch(var)
{
        case c1:
                // code;
                    break;
        case c2:
                // code;
                    break;
        case c3:
                // code;
                    break;                    
        default:
                // code;
}   

#### Example:-

    int a = 10;
    if(a=11)
        System.out.println("I am 11");
    else
        System.out.println("I am not 11");

    //Output:- Compilation error since if cannot have an assignment operator

> ### Practice Work 1:- Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day5/Programs/Check_Pass.java)

> ### Practice Work 2:- Write a program to calculate the income tax paid by an employee to the government as per the slabs mentioned below:- 

    Income Slab         Tax
    2.5 - 5.0 L          5%
    5.0L - 10.0L         20%
    Above 10.0L          30%

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day5/Programs/Calculate_Income_Tax.java)

> ### Practice Work 3:- Write a Java Program to find out the day of the week given the number [ 1 for Monday , 2 for Tuesday and so on]

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day5/Programs/Check_Day.java)

> ### Exercise 1:- Write a program to find whether a year entered by user is a leap year or not

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day5/Programs/Check_Leap_Year.java)

> ### Practice Work 4:- Write a Java Program to find out the day of the week given the number [ 1 for Monday , 2 for Tuesday and so on]

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day5/Programs/Check_Day.java)

### Fun ends on DAY5 -> Let's give everything on [DAY6](https://github.com/manjunathnmessi/Mission-Google/tree/master/Day6)