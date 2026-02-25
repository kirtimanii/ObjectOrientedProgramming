package workshop16;
import java.util.*;


/**
 * Write a description of class q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        System.out.println("enter string");
        String s1= scan.nextLine();
        
        System.out.println("enter index");
        int index= scan.nextInt();
        scan.nextLine();
        
        if(index >=0 && index < s1.length())
        {
           char ch = s1.charAt(index);
           System.out.println("character at index " + index + " is " +ch);
        }
        else
        {
            System.out.println("invalid");
        }
        
        System.out.println("enter a character to find");
        char searchChar = scan.next().charAt(0);
        
        int pos = s1.indexOf(searchChar);
        if(pos != -1)
        {
            System.out.println("First occurance of " + searchChar + "is at index: " +pos);
        }
        else
        {
            System.out.println("Character not found");
        }
        
        scan.close();
    }
}