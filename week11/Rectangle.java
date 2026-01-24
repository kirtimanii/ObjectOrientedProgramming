package week11;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape implements Drawable 
{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() 
    {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() 
    {
        return 2 * (length + breadth);
    }

    @Override
    public void draw() 
    {
        System.out.println("Hello, this is a rectangle");
    }
}
