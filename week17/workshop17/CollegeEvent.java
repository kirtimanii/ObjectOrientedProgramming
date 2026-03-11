package week17.workshop17;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeEvent extends JFrame
{
    public CollegeEvent()
    {
        setTitle("College Announcement");
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        
        JLabel label = new JLabel("Welcome to Orientation Day");
        label.setBounds(50, 100, 200, 100);
        
        panel.setLayout(null);
        panel.add(label);
        add(panel);

        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args)
    {
        CollegeEvent anc = new CollegeEvent();
        anc.setVisible(true);  
    }
}
