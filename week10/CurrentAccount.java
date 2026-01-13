package week10;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount
{
    public CurrentAccount(long accountNumber, String holderName, double balance)
    {
         super(accountNumber, holderName, balance);
    }
    
    @Override
    protected double getInterest()
    {
        return 5.0;
    }
}