package workshop16;
import java.util.*;


/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        System.out.println("enter string");
        String s1= scan.nextLine();
        
        String trimmed= s1.trim();
        System.out.println("after trim "+ trimmed);
        
        
        if(trimmed.length() >=10)
        {
            String sub = trimmed.substring(0,10);
            System.out.println("first 10 characters: " + sub );
        }
        else
        {
            System.out.println("string has less than 10 characters: ");
            System.out.println("Substring: " + trimmed);
        }
        
        String[] words = trimmed.split("");
        System.out.println("words in the string");
        for(String word:words)
        {
            System.out.println(word);
        }
        
        scan.close();
    }
}