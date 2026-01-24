package week12.workshop;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private String group;
    private String phone;
    
    public Student(String name, String group, String phone)
    {
        this.name =name;
        this.group = group;
        this.phone = phone;
    }
    
    public String getGroup() 
    {
        return group;
    }

    public void setGroup(String group) 
    {
        this.group = group;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }
    
    @Override
    public String toString()
    {
        return "Student details----> student name : "+ this.name + ", group : "+ this.group + ", phone : "+ this.phone;
    }
}