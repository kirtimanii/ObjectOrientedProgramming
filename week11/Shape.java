package week11;


/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape implements Drawable
{
    abstract double calculateArea();
    abstract double calculatePerimeter();
    
    public void displayShapeInfo()
    {
        System.out.println("Area : "+calculateArea());
        System.out.println("Perimeter : "+calculatePerimeter());
    }
    
    public static void main(String[] args) 
    {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 4);
        shapes[1] = new Circle(3);

        for (Shape shape : shapes) 
        {
            shape.displayShapeInfo();

            if (shape instanceof Drawable) 
            {
                ((Drawable) shape).draw();
            }

        }
    }
}

