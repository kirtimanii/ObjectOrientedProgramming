package week9;


/**
 * Write a description of class vehicle here.
 *
 * K
 * v1.0
 */
public class vehicle
{
    protected String brandName;
    protected int maxSpeed;
    
    public vehicle(String brandName, int maxSpeed)
    {
        this.brandName = brandName;
        this.maxSpeed = maxSpeed;
        System.out.println("This is our default vehicle constructor");
    }  
}