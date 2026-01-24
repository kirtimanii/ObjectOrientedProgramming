package workshop12;
import java.util.*;


/**
 * Write a description of class BusCompany here.
 *
 * K
 * v1.0
 */
public class BusCompany 
{
    ArrayList<Bus> buses = new ArrayList<>();

    public void addBus(Bus b)
    {
        buses.add(b);
    }

    public void removeBus(int index)
    {
        if(index >= 0 && index < buses.size())
        {
            buses.remove(index);
        }
        else 
        {
            System.out.println("Invalid index!");
        }
    }

    public void displayAll()
    {
        for(Bus b : buses)
        {
            System.out.println(b);
        }
    }

    public void displayRateMoreThan500()
    {
        for(Bus b : buses)
        {
            if(b.rate > 500)
            {
                System.out.println(b);
            }
        }
    }

    public void displayRedOrBlue()
    {
        for(Bus b : buses)
        {
            if(b.color.equalsIgnoreCase("red") || b.color.equalsIgnoreCase("blue"))
            {
                System.out.println(b);
            }
        }
    }
}