package week18;
import javax.swing.*;

public class Q2Validation 
{
    public static void main(String[] args) 
    {

        JTextField txtName = new JTextField();
        JTextField txtAge = new JTextField();
        JTextField txtPhone = new JTextField();

        String name = txtName.getText().trim();
        String ageText = txtAge.getText().trim();
        String phone = txtPhone.getText().trim();

        if(name.isEmpty())
        {
            System.out.println("Name cannot be empty");
        }

        if(!ageText.matches("\\d+"))
        {
            System.out.println("Age must be a number");
        } 
        else {
            int age = Integer.parseInt(ageText);

            if(age < 16 || age > 60){
                System.out.println("Age must be between 16 and 60");
            }
        }

        // Check phone number format
        if(!phone.matches("\\d{10}")){
            System.out.println("Phone number must be 10 digits");
        }

    }
}