package workshop16;
import java.util.*;


/**
 * Write a description of class q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial string: ");
        
        String initialString = sc.nextLine();
        StringBuilder sb = new StringBuilder(initialString);
        
        System.out.print("Enter the second string to append: ");
        String secondString = sc.nextLine();
        sb.append(secondString);
        
        System.out.print("Enter an integer to append: ");
        int number = sc.nextInt();
        
        sb.append(number);
        sb.append('@');
        
        System.out.println("Final modified string: " + sb.toString());
        sc.close();
    }
}