package week12;
import java.util.*;


/**
 * Write a description of class Arr here.
 *
 * K
 * v1.0
 */
public class Arr
{
    public static void main(String[] args)
    {
        /* ArrayList arrlist = new ArrayList();
        arrlist.add("Kritimani");
        arrlist.add(101);
        arrlist.add(70.50);
        
        System.out.println(arrlist);
        */
        
        /*
        ArrayList<Integer> marks = new ArrayList();   // only integer values can be added
        marks.add(80);
        marks.add(101);
        marks.add(70);
        
        System.out.println(marks);
        
        marks.add(0,85);   // adds new value in index 0
        System.out.println(marks);
        */
       
        ArrayList<Integer> marks = new ArrayList();
        System.out.println(marks.isEmpty());
        
        // adding element
        
        marks.add(80);
        marks.add(101);
        marks.add(70);
        
        System.out.println(marks);
        
        marks.add(0,85);   // adds new value in index 0
        System.out.println(marks);
        
        // checking if arraylist is empty
        
        System.out.println(marks.isEmpty());
        
        // finding the length or size
        
        System.out.println(marks.size());
        
        // removing an element
        
        marks.remove(0);
        System.out.println(marks);
        
        // accessing an element
        
        System.out.println(marks.get(1));
        
        // setting a new value
        
        marks.set(0,88);  // the new value will be updated and replace the old one
        
        System.out.println(marks);
        
        // check if the value is in the arraylist
        
        System.out.println(marks.contains(88));
        
        // check the index of the value
        
        System.out.println(marks.indexOf(80));
        
        // traversing an arratlist
        
        for (int mark: marks)
        {
            System.out.println(mark);
        }
        
        // iterator for traversing
        
        Iterator<Integer> itr= marks.iterator();
        
        while(itr.hasNext())
        {
            int mark= itr.next();
            System.out.println(mark);
        }
    }
}