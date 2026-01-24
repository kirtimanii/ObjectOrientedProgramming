package week11;


/**
 * Write a description of class CarDelivery here.
 *
 * K
 * v1.0
 */
public class CarDelivery extends Delivery implements Notifications  // child class
{
    private static final double PER_KM_CHARGE = 40;
    private static final double MIN_PER_KM=3;
    
    public CarDelivery(int orderId, double distance, String pickUp, String dropOff)
    {
        super(orderId, distance, pickUp, dropOff);
    }
    
    @Override
    public double calculateCharge()
    {
        return super.getDistance()* PER_KM_CHARGE;
    }
    
    @Override
    public double estimateTime()
    {
        return super.getDistance() * MIN_PER_KM;
    }
    
    @Override
    public void notify(String message)
    {
        System.out.println(message);
    }
    
    public void display()
    {
        System.out.println("Charge: "+ this.calculateCharge());
    }
}