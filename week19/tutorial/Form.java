package week19.tutorial;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Form here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Form extends JFrame
{
    private String[] buttons = {"Add","Edit","Delete","View"};
    
    public Form()
    {
        setTitle("Layout Demo");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());
        
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Welcome to this page");
        
        titlePanel.add(titleLabel);
        /*
        JPanel btnPanel = new JPanel();
        // btnPanel.setLayout(new FlowLayout());
        btnPanel.setLayout(new GridLayout(2,5,10,10)); // rows, columns
        
        for(String btn: buttons)
        {
            JButton button = new JButton(btn);
            btnPanel.add(button);
        }
        */
        
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
        sidebarPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        sidebarPanel.add(Box.createVerticalGlue());
        for(String btn: buttons)
        {
            JButton button = new JButton(btn);
            button.setMaximumSize(new Dimension(120,40));
            sidebarPanel.add(button);
            sidebarPanel.add(Box.createVerticalStrut(10));
        }
        sidebarPanel.add(Box.createVerticalGlue());
        
        add(titlePanel, BorderLayout.NORTH);
        // add(btnPanel, BorderLayout.CENTER);
        add(sidebarPanel, BorderLayout.WEST);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            new Form().setVisible(true);
        });
    }
}