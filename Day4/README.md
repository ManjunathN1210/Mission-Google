### Let's Bring it Everything on Day4

> ## Strings

A String is basically a sequence of characters. A String is instantiated as follows:-

    String name;
    name = new String("Manjunath");

String is a class but can also be used as a datatype. Hence it can be used as:-

    String name = "Manjunath";

### Strings are Immutable and cannot be changed. 

> #### Different Ways to print strings in Java

1. System.out.print():- It doesn't add a new line at the end.
2. System.out.println():- It adds a new line at the end.
3. System.out.printf():- It can be used to specify format of the output. ( In C we specify the format of the data type in which the output is required). 

    int a = 6;
    float b = 5.68242f;
    System.out.printf("The value of a is %d and value of b is %f" , a, b);

4. System.out.format():- It does the same job as System.out.printf() method.

Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

> ### Commonly used String Methods in Java 

1. **length()**:- Returns the length of the string.

    String name = "Manjunath";
    int value = name.length();
    System.out.println(value);

    //Output :- 9

2. **toLowerCase()**:- Returns a new string which has all the lowercase characters from the given string.

    String name = "Manjunath";
    String lower = name.toLowerCase();
    System.out.println(lower);

    //Output:- manjunath

3. **toUpperCase()**:- Returns a new string which has all the uppercase characters from the given string.

    String name = "Manjunath";
    String upper = name.toUpperCase();
    System.out.println(upper);

    //Output:- MANJUNATH

4.  **trim()**:- Returns a new string after removing the leading and trailing spaces from the original string.

    String nonTrimString = "   Manjunath   ";
    System.out.println(nonTrimString.trim());

    //Output:- Manjunath -> removes all the spaces

5. **substring(int start)**:- Returns a substring from start to end.

    String name = "Manjunath";
    System.out.println(name.substring(3));

    //Output:- junath    

6. **substring(int start, int end)**:- Returns a substring from start index to the end index. start index is included and end index is excluded.

    String name = "Manjunath";
    System.out.println(name.substring(1,5));

    //Output:- anju

7. **replace()**:- Returns a new string after replacing the new character. 

    String name = "Harry"
    System.out.println(name.replace('r','p'));

    //Output:- Happy

8. **startsWith()**:- Returns true if string starts with the required character.

    String name = "Manjunath";
    System.out.println(name.startsWith('Man'));

    //Output:- true

9. **endsWith()**:- Returns true if string ends with the required character.

    String name = "Manjunath";
    System.out.println(name.startsWith('Man'));

    //Output:- false

10. **charAt(int position)**:- Returns the character present at particular position in the string.

    String name="Manjunath";
    System.out.println(name.charAt(5));

    //Output:- n

11. **indexOf(String s)**:- Returns the index of the first occurence of the given sub string in the original string.

    String name="Manjunath";
    System.out.println(name.indexOf('n'));

    //Output:- 2

12. **indexOf(string s, int index)**:-  Returns the index of the first occurence of the given sub string in the original string from the index position specified.

    String name="Manjunath";
    System.out.println(name.indexOf('n',2));

    //Output:- 2

13. **lastIndexOf(String s)**:- Returns the last index of the given string

    String name="Manjunath";
    System.out.println(name.indexOf('n'));

    //Output:- 5

14. **equals(string s)**:- Returns true if given string is equal to the specified string. It is Case Sensitive.

    String name="Manjunath";
    System.out.println(name.equals('Manjunath'));

    //Output:- true

15. **equalsIgnoreCase(string s)**:- Returns true if given string is equal to the specified string (irrespective of case sensitivity).

    String name="Manjunath";
    System.out.println(name.equals('manjunaTH'));

    //Output:- true

#### Escape Sequence Characters
Sequence of characters after a backslash '\'

> \n, \t , \', \\

> ### Practice Work 1:- Write a Java Program to convert a String to Lower Case

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day4/Programs/Convert_to_Lower.java)

> ### Practice Work 2:- Write a Java Program to replace whitespaces with underscores

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day4/Programs/Space_to_Underscore.java)

> ### Practice Work 3:- Write a Java Program to fill in a letter template which looks like this:-
    letter = "DEAR <|name|>, Thanks A Lot!!!!"

    Replace <|name|> with the User input name
Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day4/Programs/Replace_Name.java)

> ### Practice Work 4:- Write a Java Program to detect double and triple spaces in a string

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day4/Programs/Detect_Spaces.java)

> ### Practice Work 5:- Write a Java Program to format the following letter using escape sequence characters

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day4/Programs/Format_Letter.java)

> ## Conditionals

Conditional statements are mostly used in decision-making scenarios which means these statements take a decision on the basis of some conditions. The conditional statements are also referred as branching statements because the program takes a decision based on the result of the assessed condition.

> ### if-else Condition

    if(condition-to-be-checked)
    {
        Statements - If condition is True
    }
    else
    {
        Statements - If conditions are False
    }

**if is compulsory in a conditional and else is optional**

> #### Example:- 

    int age = 19;
    if(age > 18)
    {
        System.out.println("Congratulations!! You have the right to drive a vehicle);
    }
    (else block is optional)

### Relational Operators in Java

Relational Operators are used to evaluate conditions( true or false ) inside the conditional statements.

Some forms of Relational Operators are:
    1. == -> equals
    2. > -> greater than
    3. >= -> greater than or equal to
    4. <= -> lesser than or equal to
    5. < -> lesser than
    6. != -> not equal to

### Logical Operators in Java

Three logical operators are

    1. && - AND
    2. || - OR
    3. ! - NOT

**AND Operator** :- Evaluates to true if both the conditions are true

    Y && Y = Y 
    Y && N = N
    N && Y = N
    N && N = N

**OR Operator** :- Evaluates to true if atleast one of the condition is true

    Y || Y = Y
    Y || N = Y
    N || Y = Y
    N || N = N

**NOT Operator** :- Negates the given logic ( true becomes false and false becomes true) 

    !Y = N
    !N = Y

### Tried a lot on DAY4 -> let's invest the same on [DAY5](https://github.com/manjunathnmessi/Mission-Google/tree/master/Day5)