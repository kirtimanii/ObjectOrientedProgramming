package week10;


/**
 * Write a description of class Nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends Person
{
    private String shift;
    private double extraAllowance;
    
    public Nurse(String    name,int id, String shift, double extraAllowance)
    {
        super(name,id);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }
    
    @Override
    public double calculateSalary()
    {
        double base= super.calculateSalary();
        return (base+extraAllowance);
    }
    
    @Override
    public String toString()
    {
        return ("Nurse Name : "+ super.getname()+" Nurse Id : "+ super.getid()+" Shift: "+this.shift);
    }
}