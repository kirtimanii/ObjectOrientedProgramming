package week10;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int id;
    
    public Person(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    
    public void setname(String newname)
    {
        this.name = newname;
    }
    
    public void setid(int newid)
    {
        this.id = newid;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    public int getid()
    {
        return this.id;
    }
    
    public double calculateSalary()
    {
        return 0.0;
    }
    
    @Override
    public String toString()
    {
        return("Staff ID : "+ this.getid() + " Staff Name : "+ this.getname());
    }
}