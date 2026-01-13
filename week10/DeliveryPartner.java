package week10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int partnerId;
    private String name;
    protected double basePay;

    public DeliveryPartner(int partnerId, String name, double basePay)
    {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;
    }

    public int getPartnerId()
    {
        return partnerId;
    }

    public void setPartnerId(int partnerId)
    {
        this.partnerId = partnerId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double calculatePayment()
    {
        return basePay;
    }

    @Override
    public String toString()
    {
        return "Partner ID : " + partnerId +", Name : " + name +", BasePay : " + basePay;
    }
}