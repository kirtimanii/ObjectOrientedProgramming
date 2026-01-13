package week10;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args)
    {

        SavingsAccount sa = new SavingsAccount(1001, "Abhisarika", 50000);
        CurrentsAccount ca = new CurrentsAccount(2001, "Mukta", 80000);

        System.out.println(sa);
        System.out.println("Savings Interest: " + sa.calculateInterest());
        System.out.println("Savings Interest with rate" +sa.calculateInterest(0.05));

        System.out.println();

        System.out.println(ca);
        System.out.println("Current Interest: " + ca.calculateInterest());
        System.out.println("Current Interest with rate" +ca.calculateInterest(0.04));
    }
}