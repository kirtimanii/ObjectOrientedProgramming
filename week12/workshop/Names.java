package week12.workshop;
import java.util.*;


/**
 * Write a description of class Names here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Names
{
    public static void main(String[] args)
    {
        ArrayList<String> name = new ArrayList();
        name.add("Kritimani");
        name.add("Abhisarika");
        name.add("Mukta");
        name.add("Anugya");
        
        // without loop
        System.out.println("Display without loop");
        System.out.println();
        System.out.println(name);
        System.out.println();
        
        // removing an element
        System.out.println("Removing element");
        System.out.println();
        
        name.remove(3);
        System.out.println(name);
        
        System.out.println();
        
        // finding the length or size
        System.out.println("Displaying the size");
        System.out.println();
        
        System.out.println(name.size());
        
        System.out.println();
        
        // accessing an element
        System.out.println("Displaying the 2nd element");
        System.out.println();
        System.out.println(name.get(2));
        System.out.println("Displaying the 5th element");
        System.out.println();
        System.out.println(name.get(5));
        System.out.println();

        
        // traversing
        System.out.println("Traversing");
        System.out.println();
        for (String names: name)
        {
            System.out.println(names);
        }
        System.out.println();
        
        //iterator
        System.out.println("Iterator");
        System.out.println();
        Iterator<String> itr= name.iterator();
        
        while(itr.hasNext())
        {
            String names= itr.next();
            System.out.println(names);
        }
        System.out.println();
        
    }
}