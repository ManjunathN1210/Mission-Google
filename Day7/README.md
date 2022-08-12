### Arrays

Array is a collection of similar type of data type. It allocates blocks in contiguous memory location so that data can be accessed much faster.

// Example to Store marks of 500 students
> Syntax:- 
    int [] marks = new int [5]; // memory allocation will be 5*4 = 20 bytes

**marks** is the reference of accesssing the particular array. All values that can be stored in array are of **Integers**. 

> #### Accessing Array Elements

Array elements can be accessed or even stored as follows:-
    marks[0] = 100      // index starts from 0
    marks[1] = 70 
    marks[2] = 78
    marks[3] = 90       

If you try to access an array element which is out of index then an error is being thrown as **Array Index Out of Bound**.

> Different Types of Creating and Initializing Arrays

    1. int [] marks;        // Declaration
        marks = new int[5]; // Memory Allocation

    2. int [] marks = new int [5]; // Declaration + Memory Allocation

    3. int [] marks = [100,70,80,71,98]; // Declaration + Direct Initialization of Elements

Array indices starts from 0 and goes till (n-1) where n is the size of the array.

#### Array Length

Arrays have a length property which gives the length of the array

    marks.length -> gives 5 as output if marks is a reference to array with 5 elements

#### Displaying or Traversing Arrays

An array can be displayed using a for loop
    int [] marks = [100,70,80,71,98];
    for(int i=0; i< marks.length; i++)
    {
        System.out.print(marks[i]);
    }

    //Output:- 100 70 80 71 98

An array can be displayed in reverse order also using a for loop
    int [] marks = [100,70,80,71,98];
    for(int i=marks.length-1; i>=0;i--)
    {
        System.out.print(marks[i]);
    }

    // Output:- 98 71 80 70 100

### for-each loop

The for-each loop is used to iterate through elements of arrays and collections (like ArrayList). It is also known as the enhanced for loop.

> Syntax:-

    for(dataType item : array) {
    ...
    }
1. **array**:- an array or any collection 
2. **item**:- each item of array/collection is assigned to this variable
3. **dataType**:- the data type of the array or the collection

    int [] marks = [100,70,80,71,98];
    for(int mark : marks)
    {
        System.out.print(mark);
    }

    //Output:- 100 70 80 71 98


#### Multi Dimensional Arrays

Multi Dimensional Arrays are Array of Arrays. A multi dimensional array is an array itself. 

Check Example Program [Here](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day7/Programs/example.java)

> ### Practice Work 1:- Write a Java Program to create an array of 5 floats and calculate their sum

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day7/Programs/Sum_Array_Elements.java)

> ### Practice Work 2:- Write a Java Program to find out whether a given integer is present in an array or not

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day7/Programs/Check_Integer_In_Array.java)

> ### Practice Work 3:- Write a Java Program to calculate the average marks from an array containing marks of all students in physics using for each loop

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day7/Programs/Average_Marks.java)

> ### Practice Work 4:- Write a Java Program to add two matrices of size 2X3

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day7/Programs/Add_Two_Matrices.java)

> ### Practice Work 5:- Write a Java Program to reverse an array

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day7/Programs/Reverse_Array.java)

> ### Practice Work 6:- Write a Java Program to find the maximum element in an array

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day7/Programs/Maximum_Element_In_Array.java)

> ### Practice Work 7:- Write a Java Program to find the minimum element in an array

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day7/Programs/Minimum_Element_In_Array.java)

 > ### Practice Work 8:- Write a Java Program to find whether an array is sorted or not

Compare Solution with this -> [Click Here !!!](https://github.com/manjunathnmessi/Mission-Google/blob/master/Day7/Programs/Check_Sort_Array.java)

### Good Practice on DAY7 -> Let's try something new on [DAY8](https://github.com/manjunathnmessi/Mission-Google/tree/master/Day8)