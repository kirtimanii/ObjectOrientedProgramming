package scenario17;


/**
 * Write a description of class Student here.
 *
 * K
 * v1.0
 */
public class Student 
{
    private String stdId;
    private String name;
    private String course;

    public Student(String stdId, String name, String course) 
    {
        this.stdId = stdId;
        this.name = name;
        this.course = course;
    }

    public String getFormattedDetails() 
    {
        return "<html>" + "<h2>Student ID</h2>" +"<b>ID:</b> " + stdId + "<br>" +
        "<b>Name : </b> " + name + "<br>" + "<b>Course : </b> " + course + "</html>";
    }
}