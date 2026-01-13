package week11;


/**
 * Write a description of class tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class tutorial
{
    abstract void hello();
}

class tutclass extends tutorial
{
    void hello()
    {
        System.out.println("hello");
    }
    
}

public class hey
{
    public static void main(String args[])
    { 
        tutorial tut= new tutclass();
        tut.hello();
    }
}