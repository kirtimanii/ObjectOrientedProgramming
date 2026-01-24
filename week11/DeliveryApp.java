package week11;


/**
 * Write a description of class DeliveryApp here.
 *
 * K
 * v1.0
 */
public class DeliveryApp  // main
{
    public static void main(String[] args)
    {
        // int orderId, double distance, String pickup, String dropOff
        
        Notifications d1 = new CarDelivery(101, 12, "Ktm", "Pkh");
        d1.notify("Your order has been placed.");
    }
}