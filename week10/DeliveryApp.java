package week10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main(String[] args)
    {
        BikeDelivery b1 = new BikeDelivery(101, "Anugya", 15000);
        CarDelivery c1 = new CarDelivery(102, "Mukta", 20000);

        
        System.out.println(b1);
        System.out.println("Bike Delivery Payment: " + b1.calculatePayment());
        System.out.println("Bike Delivery Payment (extra orders): " +b1.calculatePayment(5));

        System.out.println();

        System.out.println(c1);
        System.out.println("Car Delivery Payment: " + c1.calculatePayment());
        System.out.println("Car Delivery Payment (extra orders): " +c1.calculatePayment(3));
    }
}
