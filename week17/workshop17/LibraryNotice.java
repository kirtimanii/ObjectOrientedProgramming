package week17.workshop17;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryNotice extends JFrame
{
    public LibraryNotice()
    {
        setTitle("Library Notice");
        setSize(400,300); // width , height
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args)
    {
        LibraryNotice lib = new LibraryNotice();
        lib.setVisible(true);  
    }
}
