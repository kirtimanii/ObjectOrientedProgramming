package scenario17;
import javax.swing.SwingUtilities;


/**
 * Write a description of class Main here.
 *
 * K
 * v1.0
 */
public class Main
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {

            Student S1 = new Student("001", "Kirtimani Tamang", "Computing");
            Student S2 = new Student("002", "Abhisarika Khanal", "AI");

            new IDCWindow(S1);
            new IDCWindow(S2);

        });
    }
}