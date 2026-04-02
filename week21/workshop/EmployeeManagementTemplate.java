package week21.workshop;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class EmployeeManagementTemplate extends JFrame 
{

    private JLabel headerLabel;
    private JTextField empIdField, nameField, salaryField;
    private JRadioButton fullTime, partTime, contract;
    private JCheckBox healthInsurance, dentalInsurance, retirementPlan;
    private JComboBox<String> departmentBox;
    private JTextArea displayArea;
    private JLabel charCountLabel, mousePositionLabel, statusLabel;

    ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeManagementTemplate() {
        setTitle("Employee Management System");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);

        // ===== HEADER =====
        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headerLabel = new JLabel("<html><h1>Employee Management System</h1></html>");
        header.add(headerLabel);
        header.setBackground(new Color(70,130,200));
        headerLabel.setForeground(Color.WHITE);
        add(header, BorderLayout.NORTH);

        // HEADER HOVER EFFECT
        header.addMouseListener(new MouseAdapter() 
        {
            public void mouseEntered(MouseEvent e) 
            {
                header.setBackground(Color.ORANGE);
                headerLabel.setText("<html><h1>Employee Records View</h1></html>");
            }
            public void mouseExited(MouseEvent e) 
            {
                header.setBackground(new Color(70,130,200));
                headerLabel.setText("<html><h1>Employee Management System</h1></html>");
            }
        });
        
        //sidebar
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setPreferredSize(new Dimension(200, 0));
        sidebar.setBackground(new Color(240, 240, 240));
        sidebar.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        JButton addBtn = new JButton("Add Employee");
        JButton viewBtn = new JButton("View Employees");
        JButton updateBtn = new JButton("Update Employee");
        JButton deleteBtn = new JButton("Delete Employee");
        JButton searchBtn = new JButton("Search Employee");
       
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(addBtn);
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(viewBtn);
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(updateBtn);
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(deleteBtn);
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(searchBtn);
        sidebar.add(Box.createVerticalGlue());
       
        add(sidebar, BorderLayout.WEST);


        // ===== FORM =====
       
        JPanel form = new JPanel();
        form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
        form.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        // MOUSE TRACKING
       
        form.addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseMoved(MouseEvent e)
            {
                mousePositionLabel.setText("<html><h3>Mouse Moved At: "+e.getX()+","+e.getY()+"</h3></html>");
            }
            
            public void mouseDragged(MouseEvent e)
            {
                  mousePositionLabel.setText("<html><h3>Mouse Dragged At: "+ e.getX()+ ", " + e.getY()+"</h3></html>");
            }
        });

        // EMPLOYEE ID
        empIdField = new JTextField(20);
        form.add(createFieldPanel("Employee ID:", empIdField));

        // NAME FIELD (Part 3: Focus Listener)
        nameField = new JTextField("Enter full name",20);
        nameField.setForeground(Color.GRAY);
        form.add(createFieldPanel("Name:", nameField));

        nameField.addFocusListener(new FocusAdapter() 
        {
            public void focusGained(FocusEvent e) 
            {
                if(nameField.getText().equals("Enter full name"))
                {
                    nameField.setText("");
                    nameField.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e) 
            {
                if(nameField.getText().isEmpty())
                {
                    nameField.setText("Enter full name");
                    nameField.setForeground(Color.GRAY);
                }
            }
        });

        // ===== Part 4: Key Listener =====
        // Name field character counter
        nameField.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(KeyEvent e) 
            {
                charCountLabel.setText("<html><h3>Characters: " + nameField.getText().length() + "</h3></html>");
            }
        });

        // Salary field numeric validation
        salaryField = new JTextField(20);
        JPanel salaryPanel = createFieldPanel("Salary", salaryField);
        form.add(salaryPanel);
        form.add(Box.createRigidArea(new Dimension(0,10)));
       
       
        salaryField.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char c= e.getKeyChar();
                if(!Character.isDigit(c) && c !='.')
                {
                    e.consume(); //block the words & other keys except digits and dot
                }
            }
        });

        // EMPLOYMENT TYPE
        JPanel typePanel = new JPanel();
        fullTime = new JRadioButton("Full-Time");
        partTime = new JRadioButton("Part-Time");
        contract = new JRadioButton("Contract");
        ButtonGroup g = new ButtonGroup();
        g.add(fullTime); g.add(partTime); g.add(contract);
        typePanel.add(new JLabel("Type:"));
        typePanel.add(fullTime); typePanel.add(partTime); typePanel.add(contract);
        form.add(typePanel);

        // BENEFITS
        JPanel bPanel = new JPanel();
        healthInsurance = new JCheckBox("Health");
        dentalInsurance = new JCheckBox("Dental");
        retirementPlan = new JCheckBox("Retirement");
        bPanel.add(new JLabel("Benefits:"));
        bPanel.add(healthInsurance);
        bPanel.add(dentalInsurance);
        bPanel.add(retirementPlan);
        form.add(bPanel);

        // DEPARTMENT
        departmentBox = new JComboBox<>(new String[]{"IT","HR","Finance","Marketing"});
        JPanel dPanel = new JPanel();
        dPanel.add(new JLabel("Department:"));
        dPanel.add(departmentBox);
        form.add(dPanel);

        // BUTTONS
        JButton registerBtn = new JButton("Register Employee");
        JButton clearFormBtn = new JButton("Clear Form");
        JButton clearAllBtn = new JButton("Clear All Records");

        JPanel btnPanel = new JPanel();
        btnPanel.add(registerBtn);
        btnPanel.add(clearFormBtn);
        btnPanel.add(clearAllBtn);
        form.add(btnPanel);

        add(form, BorderLayout.CENTER);

        // DISPLAY AREA
        displayArea = new JTextArea(15,30);
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.EAST);

        // FOOTER
        JPanel footer = new JPanel();
        charCountLabel = new JLabel("Characters: 0");
        mousePositionLabel = new JLabel("Mouse: (0,0)");
        statusLabel = new JLabel("Status: Ready");

        footer.add(charCountLabel);
        footer.add(mousePositionLabel);
        footer.add(statusLabel);
        add(footer, BorderLayout.SOUTH);

        // ===== BUTTON ACTIONS =====
        registerBtn.addActionListener(e -> registerEmployee());
        clearFormBtn.addActionListener(e -> clearForm());
        clearAllBtn.addActionListener(e -> clearAllRecords());

        setVisible(true);
    }

    private JPanel createFieldPanel(String label, JTextField field){
        JPanel p = new JPanel();
        p.add(new JLabel(label));
        p.add(field);
        return p;
    }

    private void registerEmployee(){
        String id = empIdField.getText();
        String name = nameField.getText();
        String salaryText = salaryField.getText();

        String type = "";
        if(fullTime.isSelected()) type="Full-Time";
        else if(partTime.isSelected()) type="Part-Time";
        else if(contract.isSelected()) type="Contract";

        ArrayList<String> benefits = new ArrayList<>();
        if(healthInsurance.isSelected()) benefits.add("Health");
        if(dentalInsurance.isSelected()) benefits.add("Dental");
        if(retirementPlan.isSelected()) benefits.add("Retirement");

        if(name.isEmpty() || name.equals("Enter full name") || salaryText.isEmpty() || type.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please fill all required fields!");
            return;
        }

        double salary;
        try { salary = Double.parseDouble(salaryText); }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Invalid salary!");
            return;
        }

        Employee emp = new Employee(id, name, salary, type, benefits, departmentBox.getSelectedItem().toString());
        employees.add(emp);
        displayArea.append(emp.toString()+"\n");
        statusLabel.setText("Status: Employee Registered");
        clearForm();
    }

    private void clearForm(){
        empIdField.setText("");
        nameField.setText("Enter full name"); nameField.setForeground(Color.GRAY);
        salaryField.setText("");
        fullTime.setSelected(false);
        partTime.setSelected(false);
        contract.setSelected(false);
        healthInsurance.setSelected(false);
        dentalInsurance.setSelected(false);
        retirementPlan.setSelected(false);
        departmentBox.setSelectedIndex(0);
        statusLabel.setText("Status: Form Cleared");
    }

    private void clearAllRecords(){
        int confirm = JOptionPane.showConfirmDialog(this,"Are you sure you want to clear all records?");
        if(confirm == JOptionPane.YES_OPTION){
            employees.clear();
            displayArea.setText("");
            statusLabel.setText("Status: All Records Cleared");
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(EmployeeManagementTemplate::new);
    }
}