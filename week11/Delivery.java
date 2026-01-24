package week11;


/**
 * Write a description of class Delivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Delivery  // parent class
{
    private int orderId;
    private double distanceInKm;
    private String pickUpLocation;
    private String dropOffLocation;
    
    public Delivery(int orderId, double distance, String pickUp, String dropOff)
    {
       this.orderId = orderId;
       this.distanceInKm = distanceInKm;
       this.pickUpLocation = pickUpLocation;
       this.dropOffLocation = dropOffLocation;
    }
    
    public int getOrderId()
    {
        return this.orderId;
    }
    
    public double getDistance()
    {
        return this.distanceInKm;
    }
    
    abstract double calculateCharge();
    
    abstract double estimateTime();
}