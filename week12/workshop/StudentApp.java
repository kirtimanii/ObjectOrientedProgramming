package week12.workshop;
import java.util.*;


/**
 * Write a description of class StudentApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentApp
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ayush","L1N1","9876543210"));
        students.add(new Student("Rahul","L1M1","9876543211"));
        students.add(new Student("Gaurav","L1N2","9876543212"));

        
        // displaying all values
        System.out.println("Displaying all values");
        System.out.println();
        
        for(Student std: students)
        {
            System.out.println(std);
        }
        System.out.println();
        
        // removing gaurav
        students.remove(2);
        System.out.println("After removing gaurav");
        System.out.println();
        
        for(Student std: students)
        {
            System.out.println(std);
        }
        System.out.println();
        
        // new student add
        
        students.add(0,new Student("Aavaya","L1C1","9876543213"));
        System.out.println("After adding new value");
        System.out.println();
        
        for(Student std: students)
        {
            System.out.println(std);
        }
        System.out.println();
        
        // replacing rahul's group
        
        students.set(2,new Student("Rahul","L1N2","9876543211"));
        System.out.println("After updating group");
        System.out.println();
        
        for(Student std: students)
        {
            System.out.println(std);
        }
        System.out.println();
        
        // updating ayush's name
        
        students.set(1,new Student("Aayush","L1N1","9876543210"));
        System.out.println("After updating name");
        System.out.println();
        
        for(Student std: students)
        {
            System.out.println(std);
        }
        System.out.println();
        
        
    }
}