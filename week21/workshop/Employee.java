package week21.workshop;
import java.util.ArrayList;

public class Employee 
{

    private String empId, name, type, dept;
    private double salary;
    private ArrayList<String> benefits;

    public Employee(String empId, String name, double salary,String type, ArrayList<String> benefits, String dept) 
    {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.type = type;
        this.benefits = benefits;
        this.dept = dept;
    }

    public String toString() 
    {
        return "ID: " + empId +
               " | Name: " + name +
               " | Salary: " + salary +
               " | Type: " + type +
               " | Benefits: " + benefits +
               " | Dept: " + dept;
    }
}