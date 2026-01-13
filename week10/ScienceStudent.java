package week10;


/**
 * Write a description of class ScienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStudent extends Student
{
    public ScienceStudent(int rollNo, String name, int marks)
    {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult()
    {
        return super.calculateResult();
    }

    public String calculateResult(int graceMarks)
    {
        int total = marks + graceMarks;
        return total >= 45 ? "Pass" : "Fail";
    }
}

