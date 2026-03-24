package week19.workshop;

import javax.swing.*;
import java.awt.*;

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

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setAlignmentY(Component.TOP_ALIGNMENT);

        JPanel row1 = new JPanel();
        row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
        row1.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameField = new JTextField(10);
        nameField.setMaximumSize(new Dimension(120,30));

        row1.add(nameLabel);
        row1.add(Box.createHorizontalStrut(10));
        row1.add(nameField);

        JPanel row2 = new JPanel();
        row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
        row2.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel genderLabel = new JLabel("Gender: ");
        row2.add(genderLabel);

        String[] genders = {"Male","Female","Others"};
        ButtonGroup genderGrp = new ButtonGroup();

        for(String gender : genders)
        {
            JRadioButton rb = new JRadioButton(gender);
            genderGrp.add(rb);
            row2.add(rb);
        }

        JPanel row3 = new JPanel();
        row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
        row3.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel courseLabel = new JLabel("Course: ");

        String[] courses = {"Computing","Business","Engineering","Arts"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        courseBox.setMaximumSize(new Dimension(150,30));

        row3.add(courseLabel);
        row3.add(Box.createHorizontalStrut(10));
        row3.add(courseBox);

        JPanel row4 = new JPanel();
        row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));
        row4.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel hobbyLabel = new JLabel("Hobby: ");
        row4.add(hobbyLabel);

        String[] hobbies = {"Singing","Dancing","Drawing"};
        ButtonGroup hobbyGrp = new ButtonGroup();
        
        for(String hobby : hobbies)
        {
            JCheckBox cb = new JCheckBox(hobby);
            hobbyGrp.add(cb);
            row4.add(cb);
        }

        JPanel row5 = new JPanel();
        row5.setLayout(new BoxLayout(row5, BoxLayout.X_AXIS));
        row5.setAlignmentX(Component.LEFT_ALIGNMENT);

        JButton submitBtn = new JButton("Submit");
        row5.add(submitBtn);

        formPanel.add(row1);
        formPanel.add(Box.createVerticalStrut(5));
        formPanel.add(row2);
        formPanel.add(Box.createVerticalStrut(5));
        formPanel.add(row3);
        formPanel.add(Box.createVerticalStrut(5));
        formPanel.add(row4);
        formPanel.add(Box.createVerticalStrut(5));
        formPanel.add(row5);

        add(titlePanel, BorderLayout.NORTH);
        add(sidebarPanel, BorderLayout.WEST);
        add(formPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            new Form().setVisible(true);
        });
    }
}