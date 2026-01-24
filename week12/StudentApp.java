package week12;
import java.util.*;


/**
 * Write a description of class StudentApp here.
 *
 * K
 * v1.0
 */
public class StudentApp
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101,"Kritimani",75));
        students.add(new Student(102,"Abhisarika",85));
        students.add(new Student(103,"Anugya",85));
        students.add(new Student(104,"Mukta",75));
        
        System.out.println(students.get(0));
        
        for(Student std: students)
        {
            System.out.println(std);
        }
    }
}