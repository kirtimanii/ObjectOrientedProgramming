package workshop16;


/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7
{
    public static boolean isValidPhone(String phone) 
    {
        // Regex explanation:
        // ^ → start of string
        // 9[87] → first digit 9, second digit 8 or 7
        // \\d{8} → exactly 8 digits after that
        // $ → end of string
        return phone.matches("^9[87]\\d{8}$");
    }
    // Testing the method
    public static void main(String[] args) 
    {
        String[] testNumbers = {"9841234567", // valid 
            "1234567890", // invalid
            "98412345", // invalid
            "98-412-345" // invalid
        };
        for (String number : testNumbers) 
        {
            System.out.println(number + " → " + isValidPhone(number));
        }
    }

}