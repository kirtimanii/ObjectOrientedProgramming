package week17.workshop17;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentWindow extends JFrame
{
    public StudentWindow()
    {
        setTitle("Student Profile");
        setSize(400,300);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);  
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            StudentWindow window= new StudentWindow();
            window.setVisible(true);
        });
    }
}
