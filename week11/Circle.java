package week11;


/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape implements Drawable 
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea() 
    {
        return ((22/7) * radius * radius);
    }

    @Override
    public double calculatePerimeter() 
    {
        return (2 * (22/7) * radius);
    }

    @Override
    public void draw() 
    {
        System.out.println("Hello, this is a circle");
    }
}
