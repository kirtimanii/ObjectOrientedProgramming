package week17.workshop17;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Login extends JFrame
{
    public Login()
    {
        setTitle("Login Window");
        
        JLabel label = new JLabel("Username: ");
        label.setBounds(50, 50, 100, 30);
        
        JTextField txtField = new JTextField();
        txtField.setBounds(150, 50, 100, 30);
        
        JButton btn = new JButton("Login");
        btn.setBounds(150, 150, 100, 30); // lr, up down, width, height
        btn.setForeground(Color.BLACK); // text color
        btn.setBackground(Color.GREEN); // bg color
        // btn.setBackground(new Color(255,200,0)); // rgb
        
        setLayout(null);
        add(btn);
        add(label);
        add(txtField);
        
        setSize(400,500); // width , height
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args)
    {
        Login log = new Login();
        log.setVisible(true);  
    }
}
