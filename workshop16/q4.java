package workshop16;
import java.util.*;


/**
 * Write a description of class q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4
{
    public static void main(String[] args)
    {
        String text= "heLLO wORlD";
        
        String trimmedString = text.trim();
        
        System.out.println(trimmedString.toUpperCase());
        System.out.println();
        System.out.println(trimmedString.toLowerCase());
        System.out.println();
        String[] words= trimmedString.split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<words.length; i++)
        {
            String first= words[i].substring(0,1).toUpperCase();
            String rest= words[i].substring(1).toLowerCase();
            sb.append(first).append(rest).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}