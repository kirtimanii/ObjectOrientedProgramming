package week18;
import javax.swing.*;
import java.awt.*;

public class Q1ComponentSelection extends JFrame 
{
    public Q1ComponentSelection() 
    {

        setTitle("Student Form");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField txtName = new JTextField(15);
        JTextField txtAge = new JTextField(5);
        JTextField txtPhone = new JTextField(10);

        String[] departments = {"IT","BBA","BIT","BSc","Math","Physics","Chemistry","Biology","Law","Arts","Finance","Management"};
        JComboBox<String> deptBox = new JComboBox<>(departments);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        JCheckBox hobby1 = new JCheckBox("Sports");
        JCheckBox hobby2 = new JCheckBox("Music");
        JCheckBox hobby3 = new JCheckBox("Gaing");

        add(new JLabel("Name")); add(txtName);
        add(new JLabel("Age")); add(txtAge);
        add(new JLabel("Phone")); add(txtPhone);
        add(deptBox);
        add(male); add(female); add(other);
        add(hobby1); add(hobby2); add(hobby3);
    }

    public static void main(String[] args) 
    {
        new Q1ComponentSelection().setVisible(true);
    }
}