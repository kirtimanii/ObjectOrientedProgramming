package week17.tutorial;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class window extends JFrame
{
    public window()
    {
        setTitle("CS4001NI Programming");
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setBorder(BorderFactory.createTitledBorder("Login Details"));
        
        JLabel label = new JLabel("Username: ");
        label.setBounds(50, 50, 100, 30);
        
        JTextField txtField = new JTextField();
        txtField.setBounds(150, 50, 100, 30);
        
        JButton btn = new JButton("Submit");
        btn.setBounds(150, 90, 100, 30); // lr, up down, width, height
        btn.setForeground(Color.BLACK); // text color
        /* btn.setBackground(Color.MAGENTA); // bg color */
        btn.setBackground(new Color(255,200,0)); // rgb
        
        panel.setLayout(null);
        panel.add(btn);
        panel.add(label);
        panel.add(txtField);
        add(panel);
        
        setSize(400,500); // width , height
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args)
    {
        window Window = new window();
        Window.setVisible(true);  
    }
}