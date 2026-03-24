package week20.workshop;
import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentTodoApp 
{

    JFrame frame;
    JTextField taskField;
    JComboBox<String> priorityBox;
    JButton addBtn, doneBtn, deleteBtn, viewPendingBtn, clearBtn;
    JPanel taskPanel;

    ArrayList<JCheckBox> checkBoxes = new ArrayList<>();

    public StudentTodoApp() 
    {

        frame = new JFrame("Student To-Do List");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        
        JPanel topPanel = new JPanel();

        taskField = new JTextField(15);
        String[] priorities = {"High", "Medium", "Low"};
        priorityBox = new JComboBox<>(priorities);

        addBtn = new JButton("Add Task");

        topPanel.add(new JLabel("Task:"));
        topPanel.add(taskField);
        topPanel.add(priorityBox);
        topPanel.add(addBtn);

        
        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(taskPanel);

        
        JPanel bottomPanel = new JPanel();

        doneBtn = new JButton("Done");
        deleteBtn = new JButton("Delete Selected");
        viewPendingBtn = new JButton("View Pending");
        clearBtn = new JButton("Clear All");

        bottomPanel.add(doneBtn);
        bottomPanel.add(deleteBtn);
        bottomPanel.add(viewPendingBtn);
        bottomPanel.add(clearBtn);
        
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);


        addBtn.addActionListener(e -> 
        {
            String taskText = taskField.getText().trim();
            String priority = (String) priorityBox.getSelectedItem();

            
            if (taskText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Task cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            addTask(taskText, priority);
            taskField.setText("");
        });


        doneBtn.addActionListener(e -> 
        {
            for (JCheckBox task : checkBoxes) 
            {

                task.setSelected(true);

                // Apply strikethrough
                Font font = task.getFont();
                Map attributes = new HashMap(font.getAttributes());
                attributes.put(TextAttribute.STRIKETHROUGH,TextAttribute.STRIKETHROUGH_ON);

                task.setFont(new Font(attributes));
            }

            taskPanel.revalidate();
            taskPanel.repaint();
        });


        // DELETE SELECTED TASKS
        deleteBtn.addActionListener(e -> 
        {
            ArrayList<JCheckBox> toRemove = new ArrayList<>();

            for (JCheckBox task : checkBoxes) 
            {
                if (task.isSelected()) 
                {
                    taskPanel.remove(task);
                    toRemove.add(task);
                }
            }

            checkBoxes.removeAll(toRemove);

            taskPanel.revalidate();
            taskPanel.repaint();
        });


        // VIEW PENDING TASKS
        viewPendingBtn.addActionListener(e -> 
        {
            StringBuilder pending = new StringBuilder();

            for (JCheckBox task : checkBoxes) 
            {
                if (!task.isSelected()) 
                {
                    pending.append(task.getText()).append("\n");
                }
            }

            if (pending.length() == 0) 
            {
                JOptionPane.showMessageDialog(frame, "No pending tasks!");
            } 
            else 
            {
                JOptionPane.showMessageDialog(frame,pending.toString(), "Pending Tasks", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        clearBtn.addActionListener(e -> 
        {

            int confirm = JOptionPane.showConfirmDialog(frame,"Are you sure you want to delete all tasks?","Confirm",JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) 
            {

                // Clear UI
                taskPanel.removeAll();

                // Clear data
                checkBoxes.clear();

                // Refresh UI
                taskPanel.revalidate();
                taskPanel.repaint();
            }
        });

        frame.setVisible(true);
    }

    // ADD TASK METHOD

    public void addTask(String text, String priority) 
    {

        JCheckBox task = new JCheckBox(text + " [" + priority + "]");

        // Color by priority
        if (priority.equals("High")) 
        {
            task.setForeground(Color.RED);
        } 
        else if (priority.equals("Medium")) 
        {
            task.setForeground(Color.ORANGE);
        } 
        else 
        {
            task.setForeground(Color.GREEN.darker());
        }

        checkBoxes.add(task);
        taskPanel.add(task);

        taskPanel.revalidate();
        taskPanel.repaint();
    }

    // MAIN METHOD

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(StudentTodoApp::new);
    }
}

