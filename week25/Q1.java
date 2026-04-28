package week25;
import java.util.LinkedList;

public class Q1 
{
    public static void main(String[] args) 
    {

        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Bohemian Rhapsody");
        playlist.add("Blinding Lights");
        playlist.add("Imagine");

        playlist.addFirst("Billie Jean");
        playlist.addLast("Rolling in the Deep");

        playlist.remove(1);

        for (String song : playlist) 
        {
            System.out.println(song);
        }
    }
}