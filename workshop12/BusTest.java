package workshop12;


/**
 * Write a description of class BusTest here.
 *
 * K
 * v1.0
 */
public class BusTest 
{
    public static void main(String[] args) 
    {

        BusCompany bc = new BusCompany();

        bc.addBus(new Bus("BA1234", "Red", "KTM-PKH", "Ram", true, 600));
        bc.addBus(new Bus("BA2231", "Blue", "KTM-CTW", "Shyam", false, 450));
        bc.addBus(new Bus("BA9934", "Green", "KTM-BKP", "Hari", true, 700));

        System.out.println("All Buses:");
        bc.displayAll();

        System.out.println("\nRate more than 500:");
        bc.displayRateMoreThan500();

        System.out.println("\nRed or Blue buses:");
        bc.displayRedOrBlue();

        bc.removeBus(1);
    }
}