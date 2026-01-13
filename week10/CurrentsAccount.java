package week10;


/**
 * Write a description of class CurrentsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentsAccount extends Account
{
    public CurrentsAccount(int accountNo, String holderName, double balance)
    {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest()
    {
        return super.calculateInterest() + (balance * 0.01);
    }

    public double calculateInterest(double rate)
    {
        return balance * rate;
    }
}