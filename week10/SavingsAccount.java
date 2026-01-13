package week10;


/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends Account
{
    public SavingsAccount(int accountNo, String holderName, double balance)
    {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest()
    {
        return super.calculateInterest() + (balance * 0.03);
    }

    public double calculateInterest(double rate)
    {
        return balance * rate;
    }
}
