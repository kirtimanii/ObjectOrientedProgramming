package week17.workshop17;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class IDCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IDCard extends JFrame
{
    public IDCard()
    {
        setTitle("ID Card Preview");
        setSize(500,500);
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(20,20,400,400);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        String htmlText="<html><body><div><p>Name: Shishir Mishra</p><br><p>Module: Programming</p><br><p>College: Islington College</p></div></body></html>";
        
        JLabel label = new JLabel(htmlText, SwingConstants.CENTER);
        // label.setHorizontalAlignment(SwingConstants.CENTER); EITHER THIS OR LINE 25
        // label.setVerticalAlignment(SwingConstants.CENTER); 
        label.setBounds(20, 20, 300, 300);
        // label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
        panel1.setLayout(null);
        panel1.add(label);
        add(panel1);

        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args)
    {
        IDCard id = new IDCard();
        id.setVisible(true);  
    }
}