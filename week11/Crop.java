package week11;


/**
 * Write a description of class Crop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Crop 
{
    protected String cropName;
    protected String season;
    protected double landArea;

    public Crop(String cropName, String season, double landArea) 
    {
        this.cropName = cropName;
        this.season = season;
        this.landArea = landArea;
    }

    public abstract double calculateYield();
    public abstract double calculateWaterRequirement();

    public void displayCropInfo() 
    {
        System.out.println("Crop Name: " + cropName);
        System.out.println("Season: " + season);
        System.out.println("Land Area: " + landArea);
    }
    
    public static void main(String[] args) 
    {
        Crop rice = new Rice(2.0);
        Crop wheat = new Wheat(1.5);
        Crop maize = new Maize(1.0);

        displayDetails((Transportable) rice, rice, 20);
        displayDetails((Transportable) wheat, wheat, 15);
        displayDetails((Transportable) maize, maize, 10);
    }

    public static void displayDetails(Transportable t, Crop c, double distance) 
    {
        c.displayCropInfo();
        System.out.println("Expected Yield: " + c.calculateYield());
        System.out.println("Water Requirement: " + c.calculateWaterRequirement());
        System.out.println("Transport Method: " + t.getTransportMethod());
        System.out.println("Transport Cost: Rs. " + t.calculateTransportCost(distance));
    }
}

