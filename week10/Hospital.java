package week10;


/**
 * Write a description of class Hospital here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hospital
{
    public static void main(String[] args)
    {
        Person p1= new Person("Anugya" , 1001);
        System.out.println(p1);
        
        Doctor d1= new Doctor("Mukta", 1002, "Cardiologist" ,5000);
        System.out.println(d1);
        System.out.println(d1.calculateSalary());
        
        Nurse n1= new Nurse("Abhisarika" , 1003, "Night" , 2000);
        System.out.println(n1);
        System.out.println(n1.calculateSalary());
    }
}