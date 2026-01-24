package workshop12;


/**
 * Write a description of class Bus here.
 *
 * K
 * v1.0
 */
public class Bus 
{
    String numberPlate;
    String color;
    String route;
    String customerName;
    boolean availableStatus;
    int rate;

    public Bus(String numberPlate, String color, String route, String customerName, boolean availableStatus, int rate) 
    {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.availableStatus = availableStatus;
        this.rate = rate;
    }

    public String toString() 
    {
        return numberPlate + " | " + color + " | " + route + " | " + customerName + " | " + availableStatus + " | " + rate;
    }
}