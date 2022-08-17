package Day12.Programs;

import java.util.*;
public class Array_List
{
    public static void main(String [] args)
    {
        
        ArrayList <Integer> arrayList = new ArrayList<>();
        ArrayList <Integer> arrayList1= new ArrayList<>(5);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);

        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        
        arrayList.addAll(arrayList1);
        // for(int i=0; i<arrayList.size();i++)
        // {
        //     System.out.println(arrayList.get(i));
        // }
        // // arrayList.clear();  Clears all the elements in the arrayList
        
        // System.out.println(arrayList.contains(1)); //Returns true if the element is available in the array list.

        //arrayList.set(4, 57); // Adds a new element in to the array in a specified index

       for(int i=0; i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }

    }
}