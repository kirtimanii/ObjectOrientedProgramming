package scenario7;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
 */
public class BankAccount
{
    int accountNumber;
    String holderName;
    double balance;
    
    BankAccount(int accNo, String name, double initialBalance) 
    {
        accountNumber = accNo;
        holderName = name;
        balance = initialBalance;
    }
    
    void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance = balance + amount;
        }
    }
    
    void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance = balance - amount;
        }
    }
    
    void displayBalance() 
    {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name : " + holderName);
        System.out.println("Balance : " + balance);
        System.out.println();
    }
}
