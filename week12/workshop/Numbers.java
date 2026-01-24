package week12.workshop;
import java.util.*;


/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Numbers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList();
        num.add(100);
        num.add(200);
        num.add(300);
        num.add(400);
        
        // without loop
        System.out.println("Display without loop");
        System.out.println();
        System.out.println(num);
        System.out.println();
        
        // traversing
        System.out.println("Traversing");
        System.out.println();
        for (int nums: num)
        {
            System.out.println(nums);
        }
        System.out.println();
        
        //iterator
        System.out.println("Iterator");
        System.out.println();
        Iterator<Integer> itr= num.iterator();
        
        while(itr.hasNext())
        {
            int nums= itr.next();
            System.out.println(nums);
        }
        System.out.println();
        
        // clear all elements
        num.clear();
        System.out.println("After Clearing");
        System.out.println();
        System.out.println(num);
        System.out.println();
        
        
    }
}