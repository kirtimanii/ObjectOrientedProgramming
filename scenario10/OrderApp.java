package scenario10;


/**
 * Write a description of class OrderApp here.
 *
 * K
 * v1.0
 */
public class OrderApp
{
    public static void main(String[] args)
    {

        NormalOrder norder = new NormalOrder(1001, "Abhisarika", 5000);
        PremiumOrder porder = new PremiumOrder(201, "Anukta", 10000);

        System.out.println("=== Normal Order Invoice ===");
        System.out.println(norder);
        System.out.println("Final Amount: " + norder.calculateFinalAmount());
        System.out.println("Final Amount after Discount (500): " +norder.calculateFinalAmount(500));

        System.out.println("\n=== Premium Order Invoice ===");
        System.out.println(porder);
        System.out.println("Final Amount: " + porder.calculateFinalAmount());
        System.out.println("Final Amount after Discount (1000): " +porder.calculateFinalAmount(1000));
    }
}