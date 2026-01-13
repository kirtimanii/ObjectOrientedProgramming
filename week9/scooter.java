package week9;


/**
 * Write a description of class scooter here.
 *
 * K
 * v1.0
 */
public class scooter extends vehicle
{
    private int tires;
    
    public scooter(String brandName, int maxSpeed, int tires)
    {
        super(brandName, maxSpeed);
        this.tires = tires;
        System.out.println("This is our default scooter constructor");
    }
    
    public void displayScooterDetails()
    {
        System.out.println("Brand Name of the Car : " + super.brandName);
        System.out.println("Maximum Speed of the Car : " + super.maxSpeed);
        System.out.println("Number of Tires : " + this.tires);
    }
}