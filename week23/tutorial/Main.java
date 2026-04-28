package week23.tutorial;
import java.util.*;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> persons= new ArrayList<>();
        
        //Student (String name, int age, String course)
        Student std = new Student("Kritimani", 18, "Computing");
        
        //Teacher ( String name, int age, String subject)
        Teacher teacher = new Teacher("Sandesh", 23, "Programming");
        
        // Upcasting ( run time polymerphism )
        
        Person p = std; // parent reference child object
        Person p1 = teacher;
        
        p.showBasicInfo();
        p1.showBasicInfo();
        
        // Downcasting
        
        /*
        Student st1= (Student)p;
        Teacher t1= (Teacher)p1;
        
        st1.attendClass();
        t1.takeLecture();
        */
       
        // safely downcast
        
        if(p instanceof Student)
        {
            Student st1= (Student)p;
            st1.attendClass();
        }
        
        if(p1 instanceof Teacher)
        {
            Teacher t1= (Teacher)p1;
            t1.takeLecture();
        }
        
        //p.attendClass();
        //p1.takeLecture();
        
        persons.add(p);
        persons.add(p1);
        
        // filter out
        
        for(Person pp: persons)
        {
            if(pp instanceof Teacher)
            {
                pp.showBasicInfo();
            }
        }
    }
}