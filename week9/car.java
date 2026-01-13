package week9;


/**
 * Write a description of class car here.
 *
 * K
 * v1.0
 */
public class car extends vehicle
{
    private int doors;
    
    public car(String brandName, int maxSpeed, int doors)
    {
        super(brandName, maxSpeed);
        this.doors = doors;
        System.out.println("This is our default car constructor");
    }
    
    public void displayCarDetails()
    {
        System.out.println("Brand Name of the Car : " + super.brandName);
        System.out.println("Maximum Speed of the Car : " + super.maxSpeed);
        System.out.println("Number of Doors : " + this.doors);
    }
}