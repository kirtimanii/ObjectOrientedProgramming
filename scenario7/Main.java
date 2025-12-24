package scenario7;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
 */
public class Main 
{
    public static void main(String[] args) 
    {
        BankAccount acc1 = new BankAccount(101, "Kirtimani Tamang", 5000);
        BankAccount acc2 = new BankAccount(102, "Abhisarika Khanal", 3000);
        
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc2.deposit(1000);
        acc2.withdraw(500);
        acc1.displayBalance();
        acc2.displayBalance();
    }
}
