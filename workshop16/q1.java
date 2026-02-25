package workshop16;
import java.util.Scanner;


/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in);
        System.out.println("enter string");
        String s1= scan.nextLine();
        System.out.println("enter another string");
        String s2= scan.nextLine();
        
        String hello= s1.concat(s2);
        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
        System.out.println(hello);
        System.out.println();
        
        System.out.println("enter another string");
        String s3= scan.nextLine();
        
        if(hello.equals(s3))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        
        scan.close();
    }
}