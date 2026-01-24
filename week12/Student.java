package week12;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int id;
    private String name;
    private double marks;
    
    public Student(int id, String name, double marks)
    {
        this.id =id;
        this.name = name;
        this.marks = marks;
    }
    
    @Override
    public String toString()
    {
        return "Student details----> student id : "+ this.id + ", name : "+ this.name + ", marks : "+ this.marks;
    }
}