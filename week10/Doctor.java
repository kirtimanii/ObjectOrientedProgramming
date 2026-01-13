package week10;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person
{
    private String specialization;
    private double consultationFee;
    
    public Doctor(String name,int id,  String specialization, double consultationFee)
    {
        super(name, id);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
    
    @Override
    public double calculateSalary()
    {
        double base= super.calculateSalary();
        double finalSalary= base+ (consultationFee * 30);
        return finalSalary;
    }
    
    public double calculateSalary(int emergencyCases)
    {
        double normalSalary= this.calculateSalary();
        double perEmergencyCharge= 500;
        double emergencyBonus = emergencyCases* perEmergencyCharge;
        return (emergencyBonus+ normalSalary);
    }
    
    @Override
    public String toString()
    {
        return ("Doctor Name : "+ super.getname()+" Doctor Id : "+ super.getid()+" Specialization : "+this.specialization);
    }
    
}