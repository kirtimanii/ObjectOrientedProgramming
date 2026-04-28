package week26.tutorial;


/**
 * Write a description of class Recursion here.
 *
 * K
 * @version (a version number or a date)
 */
public class Recursion
{
    public static void main(String[] args)
    {
        int fact = factorial(5);
        
        System.out.println("Factorial: "+ fact);
    }
    
    public static int factorial(int n)
    {
        // base case
        if( n==0 || n==1 )
        {
            return 1;
        }
        
        return n * factorial(n-1);
    }
}