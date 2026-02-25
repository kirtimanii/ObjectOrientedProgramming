package workshop16;
import java.util.*;


/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q6
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        
        String reversed = "";
        
        
        for (int i = original.length() - 1; i >= 0; i--) 
        {
            reversed += original.charAt(i);
        }
       
        System.out.println("Reversed string: " + reversed);
        
        
        if (original.equals(reversed)) 
        {
            System.out.println("The string is a palindrome");
        }
        else 
        {
            System.out.println("The string is not a palindrome");
        }
        
        sc.close();
    }
}