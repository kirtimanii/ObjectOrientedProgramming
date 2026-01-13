package week10;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        // long accountNumber, String holderName, double balance
        SavingAccount acc1 = new SavingAccount(10012, "Sandesh", 10000);
        CurrentAccount acc2 = new CurrentAccount(10012, "Sandesh", 10000);

        double interest1 = acc1.getCompoundInterest(5);
        double interest2 = acc2.getCompoundInterest(5);

        System.out.println("Compound Interest of Saving account: " + interest1);
        System.out.println("Interest of Current account: " + interest1);
    }
}