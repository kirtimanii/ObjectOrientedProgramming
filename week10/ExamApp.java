package week10;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp
{
    public static void main(String[] args) {

        ScienceStudent s1 = new ScienceStudent(101, "Abhisarika", 30);
        ManagementStudent m1 = new ManagementStudent(201, "Anugya", 42);

        System.out.println(s1);
        System.out.println("Science Result: " + s1.calculateResult());
        System.out.println("Science Result: " +s1.calculateResult(5));

        System.out.println();

        System.out.println(m1);
        System.out.println("Management Result: " + m1.calculateResult());
        System.out.println("Management Result: " +m1.calculateResult(3));
    }
}
