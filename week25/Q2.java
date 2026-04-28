package week25;
import java.util.HashMap;


public class Q2 
{
    public static void main(String[] args) 
    {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(101, 85);
        map.put(102, 92);
        map.put(103, 78);

        map.put(102, 95); // update
        map.remove(101);  // remove

        if (map.containsKey(103)) 
        {
            System.out.println(map.get(103));
        }

        for (Integer id : map.keySet()) 
        {
            System.out.println(id + " -> " + map.get(id));
        }
    }
}