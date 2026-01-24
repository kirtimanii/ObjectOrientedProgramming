package week11;


/**
 * Write a description of class Maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize extends Crop implements Transportable 
{

    public Maize(double landArea) 
    {
        super("Maize", "Summer", landArea);
    }

    @Override
    public double calculateYield() 
    {
        return landArea * 2.8;
    }

    @Override
    public double calculateWaterRequirement() 
    {
        return landArea * 400;
    }

    @Override
    public double calculateTransportCost(double distance) 
    {
        return distance * 10;
    }

    @Override
    public String getTransportMethod() 
    {
        return "Jeep";
    }
}
