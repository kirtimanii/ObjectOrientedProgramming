package scenario17;
import javax.swing.*;

/**
 * Write a description of class IDCwindow here.
 *
 * K
 * v1.0
 */
public class IDCWindow extends JFrame 
{
    public IDCWindow(Student student) 
    {

        setTitle("Student's ID Card");

        JLabel label = new JLabel(student.getFormattedDetails());
        add(label);

        setSize(450, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}