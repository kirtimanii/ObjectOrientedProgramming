package week22.workshop;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


public class EmployeeManagementTemplate extends JFrame {

    private JTextField empIdField, nameField, salaryField;
    private JRadioButton fullTime, partTime, contract;
    private JCheckBox healthInsurance, dentalInsurance, retirementPlan;
    private JComboBox<String> departmentBox;
    private JTextArea displayArea;
    private JLabel charCountLabel, mouseLabel, statusLabel;

    ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeManagementTemplate() {
        setTitle("Employee Management System");
        setSize(1000, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ===== HEADER =====
        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT));
        header.setBackground(new Color(70,130,200));
        header.setPreferredSize(new Dimension(1000, 80));

        JLabel title = new JLabel("Employee Management System");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 28));

        header.add(title);
        add(header, BorderLayout.NORTH);

        // ===== SIDEBAR =====
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setPreferredSize(new Dimension(180, 0));
        sidebar.setBackground(new Color(230,230,230));

        String[] btns = {"Add Employee","View Employees","Update Employee","Delete Employee","Search Employee"};

        for(String t: btns){
            JButton b = new JButton(t);
            b.setMaximumSize(new Dimension(160,40));
            b.setAlignmentX(Component.CENTER_ALIGNMENT);
            sidebar.add(Box.createRigidArea(new Dimension(0,10)));
            sidebar.add(b);
        }

        add(sidebar, BorderLayout.WEST);

        // ===== FORM CENTER =====
        JPanel form = new JPanel(new GridBagLayout());
        form.setBorder(BorderFactory.createEmptyBorder(20,40,20,40));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbc.anchor = GridBagConstraints.WEST;

        empIdField = new JTextField(20);
        nameField = new JTextField("Enter full name",20);
        nameField.setForeground(Color.GRAY);
        salaryField = new JTextField(20);

        // NAME FOCUS
        nameField.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e){
                if(nameField.getText().equals("Enter full name")){
                    nameField.setText("");
                    nameField.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e){
                if(nameField.getText().isEmpty()){
                    nameField.setText("Enter full name");
                    nameField.setForeground(Color.GRAY);
                }
            }
        });

        // CHARACTER COUNT
        nameField.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e){
                charCountLabel.setText("Characters: " + nameField.getText().length());
            }
        });

        // SALARY INPUT CONTROL
        salaryField.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(!Character.isDigit(c) && c!='.'){
                    e.consume();
                }
            }
        });

        // ROWS
        gbc.gridx=0; gbc.gridy=0;
        form.add(new JLabel("Employee ID:"), gbc);
        gbc.gridx=1; form.add(empIdField, gbc);

        gbc.gridx=0; gbc.gridy++;
        form.add(new JLabel("Name:"), gbc);
        gbc.gridx=1; form.add(nameField, gbc);

        gbc.gridx=0; gbc.gridy++;
        form.add(new JLabel("Salary"), gbc);
        gbc.gridx=1; form.add(salaryField, gbc);

        // TYPE
        fullTime = new JRadioButton("Full-Time");
        partTime = new JRadioButton("Part-Time");
        contract = new JRadioButton("Contract");

        ButtonGroup g = new ButtonGroup();
        g.add(fullTime); g.add(partTime); g.add(contract);

        JPanel typePanel = new JPanel();
        typePanel.add(fullTime); typePanel.add(partTime); typePanel.add(contract);

        gbc.gridx=0; gbc.gridy++;
        form.add(new JLabel("Type:"), gbc);
        gbc.gridx=1; form.add(typePanel, gbc);

        // BENEFITS
        healthInsurance = new JCheckBox("Health");
        dentalInsurance = new JCheckBox("Dental");
        retirementPlan = new JCheckBox("Retirement");

        JPanel bPanel = new JPanel();
        bPanel.add(healthInsurance);
        bPanel.add(dentalInsurance);
        bPanel.add(retirementPlan);

        gbc.gridx=0; gbc.gridy++;
        form.add(new JLabel("Benefits:"), gbc);
        gbc.gridx=1; form.add(bPanel, gbc);

        // DEPARTMENT
        departmentBox = new JComboBox<>(new String[]{"IT","HR","Finance","Marketing"});

        gbc.gridx=0; gbc.gridy++;
        form.add(new JLabel("Department:"), gbc);
        gbc.gridx=1; form.add(departmentBox, gbc);

        // BUTTONS
        JButton registerBtn = new JButton("Register Employee");
        JButton clearBtn = new JButton("Clear Form");
        JButton clearAllBtn = new JButton("Clear All Records");

        JPanel btnPanel = new JPanel();
        btnPanel.add(registerBtn);
        btnPanel.add(clearBtn);
        btnPanel.add(clearAllBtn);

        gbc.gridx=0; gbc.gridy++;
        gbc.gridwidth=2;
        form.add(btnPanel, gbc);

        add(form, BorderLayout.CENTER);

        // ===== DISPLAY =====
        displayArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(displayArea);
        scroll.setPreferredSize(new Dimension(300,0));
        add(scroll, BorderLayout.EAST);

        // ===== FOOTER =====
        JPanel footer = new JPanel(new FlowLayout(FlowLayout.LEFT));
        charCountLabel = new JLabel("Characters: 0");
        mouseLabel = new JLabel(" Mouse: 0,0 ");
        statusLabel = new JLabel(" Status: Ready ");

        footer.add(charCountLabel);
        footer.add(mouseLabel);
        footer.add(statusLabel);

        add(footer, BorderLayout.SOUTH);

        // ===== ACTIONS =====
        registerBtn.addActionListener(e -> registerEmployee());
        clearBtn.addActionListener(e -> clearForm());
        clearAllBtn.addActionListener(e -> clearAll());

        setVisible(true);
    }

    // ===== SAVE (ALL PARTS) =====
    private void registerEmployee(){
        try{
            String id = empIdField.getText();
            String name = nameField.getText();
            String salaryText = salaryField.getText();

            String type="";
            if(fullTime.isSelected()) type="Full-Time";
            else if(partTime.isSelected()) type="Part-Time";
            else if(contract.isSelected()) type="Contract";

            ArrayList<String> benefits = new ArrayList<>();
            if(healthInsurance.isSelected()) benefits.add("Health");
            if(dentalInsurance.isSelected()) benefits.add("Dental");
            if(retirementPlan.isSelected()) benefits.add("Retirement");

            // NAME VALIDATION
            if(name == null || name.trim().isEmpty() || name.equals("Enter full name")){
                JOptionPane.showMessageDialog(this,"Invalid Name!");
                nameField.requestFocus();
                return;
            }

            // SALARY VALIDATION
            if(salaryText.trim().isEmpty()){
                JOptionPane.showMessageDialog(this,"Salary cannot be empty!");
                return;
            }

            double salary;
            try{
                salary = Double.parseDouble(salaryText);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Invalid Salary Input");
                return;
            }

            if(salary < 0){
                JOptionPane.showMessageDialog(this,"Salary cannot be negative!");
                return;
            }

            if(type.isEmpty()){
                JOptionPane.showMessageDialog(this,"Select type!");
                return;
            }

            Employee emp = new Employee(id,name,salary,type,benefits,departmentBox.getSelectedItem().toString());
            employees.add(emp);

            displayArea.append(emp.toString()+"\n");

            JOptionPane.showMessageDialog(this,"Employee Saved Successfully");
            statusLabel.setText("Saved");

            clearForm();

        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage());
        }
    }

    // CLEAR FORM
    private void clearForm(){
        try{
            empIdField.setText("");
            nameField.setText("Enter full name");
            nameField.setForeground(Color.GRAY);
            salaryField.setText("");

            fullTime.setSelected(false);
            partTime.setSelected(false);
            contract.setSelected(false);

            healthInsurance.setSelected(false);
            dentalInsurance.setSelected(false);
            retirementPlan.setSelected(false);

            departmentBox.setSelectedIndex(0);

            statusLabel.setText("Form Reset");

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Error clearing form");
        }
    }

    private void clearAll(){
        employees.clear();
        displayArea.setText("");
        statusLabel.setText("All Cleared");
    }

    public static void main(String[] args)
    {
        new EmployeeManagementTemplate();
    }
}