package scenario10;


/**
 * Write a description of class NormalOrder here.
 *
 * K
 * v1.0
 */
public class NormalOrder extends order
{
    public NormalOrder(int orderId, String customerName, double amount)
    {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount()
    {
        return super.calculateFinalAmount();
    }

    public double calculateFinalAmount(double discountAmount)
    {
        return super.calculateFinalAmount() - discountAmount;
    }
}