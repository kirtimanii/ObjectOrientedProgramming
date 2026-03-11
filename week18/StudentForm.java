package week18;
import javax.swing.*;
import java.awt.*;

public class StudentForm extends JFrame 
{
    public StudentForm() 
    {

        setTitle("Student Registration System");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Student ID
        add(new JLabel("Student ID"));
        JTextField txtId = new JTextField(10);
        add(txtId);

        // Student Name
        add(new JLabel("Student Name"));
        JTextField txtName = new JTextField(10);
        add(txtName);

        // Course ComboBox
        add(new JLabel("Course"));
        String[] courses = {"BSc","BBA","BIT"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        add(courseBox);

        // Gender Radio Buttons
        add(new JLabel("Gender"));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        add(male);
        add(female);
        add(other);

        // Skills CheckBox
        add(new JLabel("Skills"));
        JCheckBox skill = new JCheckBox("Programming");
        add(skill);

        // Buttons
        JButton addBtn = new JButton("Add");
        JButton resetBtn = new JButton("Reset");
        JButton searchBtn = new JButton("Search");
        JButton deleteBtn = new JButton("Delete");

        add(addBtn);
        add(resetBtn);
        add(searchBtn);
        add(deleteBtn);

        // Table for displaying records
        String[] columns = {"ID","Name","Course","Gender","Skill"};

        Object[][] data = {};

        JTable table = new JTable(data, columns);

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane);
    }

    public static void main(String[] args) 
    {

        SwingUtilities.invokeLater(() -> 
        {
            new StudentForm().setVisible(true);
        });

    }
}