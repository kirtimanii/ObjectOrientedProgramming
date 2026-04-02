package week22.tutorial;


public class InvalidPatientDataException extends RuntimeException 
{
    public InvalidPatientDataException(String message) 
    {
        super(message);
    }
}
