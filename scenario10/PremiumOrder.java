package scenario10;


/**
 * Write a description of class PremiumOrder here.
 *
 * K
 * v1.0
 */
public class PremiumOrder extends order
{
    public PremiumOrder(int orderId, String customerName, double amount)
    {
        super(orderId, customerName, amount);
    }
    
    @Override
    public double calculateFinalAmount()
    {
        return super.calculateFinalAmount() + (amount * 0.10);
    }

    public double calculateFinalAmount(double discountAmount)
    {
        return calculateFinalAmount() - discountAmount;
    }
}